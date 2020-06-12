package domain;

import java.util.List;

public interface Notificador {
	void notificarUsuarios(List<User> usuarios); // notifica a la lista
	void validarNotificacion(); // valida si debe hacer la notificacion a la lista
}