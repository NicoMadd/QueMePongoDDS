package domain;

import java.util.List;

public class SugerenciaDiaria implements ServicioDeNotificacion{
	
	List<User> suscriptores;
	
	
	
	public SugerenciaDiaria();
	
	@Override
	public void agregarUsuario(User usuario) {
		suscriptores.add(usuario);
	}

	@Override
	public void sacarUsuario(User usuario) {
		suscriptores.add(usuario);
		
	}

	@Override
	public void notificar() {
		Atuendo atuendo = getSugerencia();
		suscriptores.forEach(user -> user.recibirSugerencia(atuendo));
	}

	public Atuendo getSugerencia(){
		return null;
		
	}
	
}
