
public class Solicitud {
	Operacion operacion;
	
	Solicitud(Operacion operacion){
		this.operacion = operacion;
	}
	
	public void deshacer() {
		operacion.deshacer();
	}
	
	public void ejecutar() {
		operacion.ejecutar();
	}
}
