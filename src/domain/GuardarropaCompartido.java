package domain;

import java.util.LinkedList;
import java.util.List;

public class GuardarropaCompartido {
	Guardarropa guardarropa;
	List<Solicitud> solicitudesPendientes;
	List<Solicitud> solicitudesAceptadas;
	
	GuardarropaCompartido(Guardarropa guardarropa){
		this.guardarropa = guardarropa;
		solicitudesPendientes = new LinkedList<>();
		solicitudesAceptadas = new LinkedList<>();
	}
	
	public void aceptarSolicitud(Solicitud solicitud){
		solicitudesPendientes.remove(solicitud);
		solicitud.ejecutar();
		solicitudesAceptadas.add(solicitud);
	}
	
	public void deshacerSolicitud(Solicitud solicitud){
		solicitud.deshacer();
		solicitudesAceptadas.remove(solicitud);
	}
	
	public void agregarSolicitud(Solicitud solicitud) {
		solicitudesPendientes.add(solicitud);
	}
	
	public void atenderSolicitudes(){
		//resuelve si se quieren aceptar cada solicitud contenida en pendientes
	}
}
