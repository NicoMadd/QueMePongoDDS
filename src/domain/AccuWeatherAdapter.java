package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements ServicioMeteorologico{
	static AccuWeatherAPI api;
	Duration periodoDeValidez;
	private Map<String, RespuestaMeteorologica> ultimasRespuestas;


	
	public AccuWeatherAdapter(AccuWeatherAPI api, Duration periodoDeValidez) { //
		this.api = api;            
		this.periodoDeValidez = periodoDeValidez;  
		this.ultimasRespuestas = new HashMap<String, Object>();
		}
	
	public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
		if (!this.ultimasRespuestas.contains(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
		    ultimasRespuestas.put(new RespuestaMeteorologica(consultarApi(direccion), proximaExpiracion()));    
		}
		return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
		}

	private LocalDateTime proximaExpiracion() {
		    return LocalDateTime.now().plus(this.periodoDeValidez);
		  }  

	private Object consultarApi(String direccion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean expiro() {
	    return proximaExpiracion.isAfter(DateTime.now);
	}

	@Override
	public int consultarTemperatura(String direccion) {
		
		return 0;
	}  



