package domain;


import java.util.List;

public class Guardarropa {
	List<Prenda> prendas;
	List<Solicitud> solicitudesPendientes;
	List<Solicitud> solicitudesAceptadas;
	public Guardarropa(List<Prenda> prendas) {
		this.prendas = prendas;
	
	}
	public List<Prenda> getGuardarropa(){
		return prendas;
	}
	
	public void agregar(Prenda unaPrenda) {
		prendas.add(unaPrenda);
	}
	
	public void quitar(Prenda unaPrenda) {
		prendas.remove(unaPrenda);
	}
	
	
	public boolean contiene(Prenda unaPrenda) {
		return prendas.contains(unaPrenda);
	}
	
	public void compartir(User usuario) {
		usuario.agregarGuardarropaCompartido(this);
	}


	public List<Atuendo> todasLasPosiblesCombinaciones() {
		// TODO Auto-generated method stub
		return null;
	}}
