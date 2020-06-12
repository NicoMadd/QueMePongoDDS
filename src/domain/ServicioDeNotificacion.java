package domain;

import java.util.LinkedList;
import java.util.List;

public interface ServicioDeNotificacion{ //SUB
	
	void agregarUsuario(User usuario);
	void sacarUsuario(User usuario);
	void notificar();
	//actualizarEstado();
	
}
/*
	List<User> listaUsuarios;
	List<Notificador> notificadores;
	
	public ServicioDeNotificacion(List<Notificador> unosNotificadores) {
		List<User> listaUsuarios = new LinkedList<>();
		List<Notificador> alertas = new LinkedList<>();
		alertas.addAll(unosNotificadores);
	}
	
	public void agregarUsuario(User usuario) {
		listaUsuarios.add(usuario);
	}
	
	public void sacarUsuario(User usuario) {
		listaUsuarios.remove(usuario);
	}
	
	
	
	public void notificar() { //unaAlerta tiene que contener a quien mandarle, que mandarle y de quien viene en teoria
		notificadores.forEach(notificador -> notificador.notificarUsuarios(listaUsuarios));
	}
	


}
*/