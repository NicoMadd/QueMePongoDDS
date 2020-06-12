package domain;

import java.util.List;

public class NotificadorDeGranizo implements Notificador{

	@Override
	public void notificarUsuarios(List<User> usuarios) {
		validarNotificacion();
		usuarios.forEach(usuario -> usuario.recibirNotificacion("Van a caer enanos en bolas!!"));
		
	}

	@Override
	public void validarNotificacion() {
		// chequea si hay granizo
		
	}

}
