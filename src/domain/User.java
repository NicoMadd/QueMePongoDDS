package domain;

import java.util.LinkedList;

import java.util.List;

/*
 * La clase usuario tendra su propio atuendo
 * que este podra ser incluido o no en la generacion. Tambien tendra un nombre y una id para identidad.
 * 
 * User agrega como dependencias los respectivos subjects que pueda llegar a necesitar
 * 
*/

public class User {
	static int idGlobal=0;
	int id;
	String nombre;
	Uniforme atuendo;
	List<Guardarropa> guardarropasPropios;
	List<GuardarropaCompartido> guardarropasCompartidos; // Son los guardarropas con los que este usuario puede enviar solicitudes
	Borrador prendaBorrador;
	List<Uniforme> uniformes;
	List<Notificador> notificadores;
	
	public User(String unNombre, List<Notificador> notificadores) {
		this.id = idGlobal++;
		this.nombre = unNombre;
		this.guardarropasPropios = new LinkedList();
		this.guardarropasCompartidos = new LinkedList();
		this.atuendo = null;
		this.uniformes = new LinkedList<>();
		this.notificadores = new LinkedList<>();
		this.notificadores.addAll(notificadores);
		}
	
	public void crearBorrador(TipoPrenda tipoPrenda) {
		this.prendaBorrador = new Borrador(tipoPrenda);
	}
	
	public void agregarPrenda(Guardarropa guardarropa){
		guardarropa.agregar(prendaBorrador.crearPrenda());
		prendaBorrador=null;
	}
	
	public void agregarGuardarropa(Guardarropa guardarropa) {
		guardarropasPropios.add(guardarropa);
	}

	public void agregarGuardarropaCompartido(Guardarropa guardarropa) {
		guardarropasCompartidos.add(new GuardarropaCompartido(guardarropa));
	}
	
	public void enviarSolicitud(GuardarropaCompartido guarrdarropaCompartido, Solicitud solicitud) {
		guarrdarropaCompartido.agregarSolicitud(solicitud);
	}

	public void recibirNotificacion(String alerta){
		// printear alerta
		}
	

	public void recibirSugerencia(Atuendo atuendo) {
		
		/*
		 * hacer algo con la sugerencia
		 */
	}
	

}
