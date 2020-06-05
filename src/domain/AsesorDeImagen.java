package domain;

import java.util.List;

public class AsesorDeImagen{
	ServicioMeteorologico servicioMeteorologico;
	
	public AsesorDeImagen(ServicioMeteorologico servicioMeteorologico) {
		this.servicioMeteorologico = servicioMeteorologico;
	}
	
	public Atuendo sugerirAtuendo(String direccion, Guardarropa guardarropa) {
	    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico().obtenerCondicionesClimaticas(direccion);
	    
	    List<Atuendo> combinaciones = guardarropa.todasLasPosiblesCombinaciones();
	      return combinaciones
	        .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.temperatura))
	        .filter(combinacion -> combinacion.aptaParaHumedad(estadoDelTiempo.humedad))
	        .first();
	    
	  }

	private Object servicioMeteorologico() {
		// TODO Auto-generated method stub
		return null;
	}
}