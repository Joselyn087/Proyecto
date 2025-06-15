package modelo;

import vista.joption.Escritor;

public class Tienda {
	private int precioVitalidad;
	private int precioIntercambio;
	private int cantidadVitalidad;
	private int cantidadIntercambio;
	RuedaDelDestino azarVitalidad;
	Protagonista protagonista;
	Escritor escritor;
	Enemigo enemigo;
	
	
	public Tienda() {
		precioVitalidad = 10;
		precioIntercambio = 20;
		cantidadIntercambio = 2;
		azarVitalidad = new RuedaDelDestino(10,40);
		protagonista = new Protagonista();
		cantidadVitalidad = 2;
		escritor = new Escritor();
		enemigo = new Enemigo();
		
	}
	
	public void compraPocionVitalidad() {
		if(cantidadVitalidad<= 0) {
			escritor.escribir("No quedan posicines de vitalidad");
		
		}else if(protagonista.getDinero() < precioVitalidad) {
			escritor.escribir("No tienes suficiente dinero");
		
		}else{
			protagonista.setDinero(protagonista.getDinero() - precioVitalidad);
		
			//por aqui esta el error
			int aumentoVitalidad = azarVitalidad.numeroAzar();
			protagonista.setVitalidad(protagonista.getVitalidad() + aumentoVitalidad);
		
			cantidadVitalidad--;
			escritor.escribir("Has comprado una poción de vitalidad.");
		}
			
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
