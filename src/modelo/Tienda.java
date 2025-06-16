package modelo;

import vista.joption.Escritor;

public class Tienda {
	private int precioVitalidad;
	private int precioIntercambio;
	private int cantidadVitalidad;
	private int cantidadIntercambio;
	RuedaDelDestino azarVitalidad;
	private Protagonista protagonista;
	private Escritor escritor;
	private Enemigo enemigo;
	
	
	public Tienda(Protagonista protagonista, Escritor escritor, Enemigo enemigo) {
		precioVitalidad = 10;
		precioIntercambio = 20;
		cantidadIntercambio = 2;
		azarVitalidad = new RuedaDelDestino(10,40);
		this.protagonista = protagonista;
		cantidadVitalidad = 2;
		this.escritor = escritor;
		this.enemigo = enemigo;
		
	}
	
	public void compraPocionVitalidad() {
		if(cantidadVitalidad<= 0) {
			escritor.escribir("No quedan posiones de vitalidad");
		
		}else if(protagonista.getDinero() < precioVitalidad) {
			escritor.escribir("No tienes suficiente dinero");
		
		}else{
			protagonista.setDinero(protagonista.getDinero() - precioVitalidad);
		
			int aumentoVitalidad = azarVitalidad.numeroAzar();
			int vitalidadJugador = protagonista.getVitalidad();
			int nuevaVitalidad = (vitalidadJugador + aumentoVitalidad);
		
			protagonista.setVitalidad(nuevaVitalidad);
			cantidadVitalidad--;
			escritor.escribir("Has comprado una poción de vitalidad.(+"+ aumentoVitalidad + "vitalidad)");
		}
			
	}
	public void compraPocionIntercambio() {
		if(cantidadIntercambio<= 0) {
			escritor.escribir("No quedan posicines de intercambio");
			return;
		
		}else if(protagonista.getDinero() < precioIntercambio) {
			escritor.escribir("No tienes suficiente dinero");
			return;
		}
		
		protagonista.setDinero(protagonista.getDinero() - precioIntercambio);
		
		int temporal = protagonista.getVitalidad();
		if(temporal > 0) {
	    	enemigo.setVitalidad(temporal);
		   protagonista.setVitalidad(0);
		
	
		cantidadIntercambio--;
		escritor.escribir("Has intercambiado tu vitalidad con el enemigo");
		
	  }else 
		escritor.escribir("no tienes vitalidad para intercambiar");
		protagonista.setDinero(protagonista.getDinero() + precioIntercambio);
	}

	
	

	public int getCantidadVitalidad() {
		return cantidadVitalidad;
	}

	public void setCantidadVitalidad(int cantidadVitalidad) {
		this.cantidadVitalidad = cantidadVitalidad;
	}
	
	public int getPrecioVitalidad() {
		return precioVitalidad;
	}

	public void setPrecioVitalidad(int precioVitalidad) {
		this.precioVitalidad = precioVitalidad;
	}
	
	public int getPrecioIntercambio() {
		return precioIntercambio;
	}

	public void setPrecioIntercambio(int precioIntercambio) {
		this.precioIntercambio = precioIntercambio;
	}
	
	
	
	

}
