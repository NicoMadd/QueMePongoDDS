
public class Solicitud {
	Command command;
	
	Solicitud(Command operacion){
		this.command = operacion;
	}
	
	public void deshacer() {
		command.deshacer();
	}
	
	public void ejecutar() {
		command.ejecutar();
	}
}
