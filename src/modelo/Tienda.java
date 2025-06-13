package modelo;

import vista.joption.Escritor;

public class Tienda {
	private int preciVitalidad;
	private int precioIntercambio;
	private int cantidadVitalidad;
	private int cantidadIntercambio;
	RuedaDelDestino azarVitalidad;
	Protagonista protagonista;
	Escritor escritor;
	Enemigo enemigo;
	
	
	public Tienda() {
		preciVitalidad = 0;
		precioIntercambio = 0;
		cantidadIntercambio= 0;
		cantidadIntercambio = 0;
		azarVitalidad = new RuedaDelDestino(10,40);
		protagonista = new Protagonista();
		cantidadVitalidad = azarVitalidad.numeroAzar();
		escritor = new Escritor();
		enemigo = new Enemigo();
		
	}
	
	public void compraPocionVitalidad() {
		if(cantidadVitalidad<= 0) {
			escritor.escribir("No quedan posicines de vitalidad");
		}
		
		if(protagonista.getDinero() < preciVitalidad) {
			escritor.escribir("No tienes suficiente dinero");
		}
		
		protagonista.setDinero(protagonista.getDinero() - preciVitalidad);
		
		int aumentoVitalidad = azarVitalidad.numeroAzar();
		protagonista.setVitalidad(protagonista.getVitalidad() + aumentoVitalidad);
		
		cantidadVitalidad--;
			
	}
	
	public void compraPocionIntercambio() {
		if(cantidadIntercambio<= 0) {
			escritor.escribir("No quedan posicines de intercambio");
		}
		
		if(protagonista.getDinero() < precioIntercambio) {
			escritor.escribir("No tienes suficiente dinero");
		}
		
		protagonista.setDinero(protagonista.getDinero() - precioIntercambio);
		
		int temporal = protagonista.getVitalidad();
		enemigo.setVitalidad(temporal);
		
		
		
		cantidadIntercambio--;
			
	}
	
	

	public int getCantidadVitalidad() {
		return cantidadVitalidad;
	}

	public void setCantidadVitalidad(int cantidadVitalidad) {
		this.cantidadVitalidad = cantidadVitalidad;
	}
	
	
	
	

}
