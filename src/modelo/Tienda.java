// Joselyn Salas Ramirez C4J596
// Skylar Espinoza B82757
package modelo;

public class Tienda {
	private int precioVitalidad;
	private int precioIntercambio;
	private int cantidadVitalidad;
	private int cantidadIntercambio;
	
	
	
	public Tienda() {
		precioVitalidad = 50;
		precioIntercambio = 60;
		cantidadIntercambio = 3;
		cantidadVitalidad = 3;	
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
	
	
	public int getCantidadIntercambio() {
		return cantidadIntercambio;
	}
	
	public void setCantidadIntercambio(int cantidadIntercambio) {
		this.cantidadIntercambio = cantidadIntercambio;
	}
	
	
	public String toString() {
		return "Tienda: precioVitalidad: " + precioVitalidad + " precioIntercambio: " + precioIntercambio;
	}
	
	
	
	

}
