// Joselyn Salas Ramirez C4J596
// Skylar Espinoza B82757
package modelo;



public class Protagonista {
	
	
	private String nombre;
	private int vitalidad;
	private int danoAtaque;
	private String nombreAtaque;
	private int pocionVitalidad;
	private int pocionIntercambio;
	private int dinero;
	private int victorias;
	private int derrotas;
	
	public Protagonista() {

		
		nombre = "";
		vitalidad = 0;
		danoAtaque = 50;
		nombreAtaque = "";
		pocionVitalidad = 0;
		pocionIntercambio = 0;
		dinero = 100;
		victorias = 0;
		derrotas = 0;
		
		
	}

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}
	
	public int getDanoAtaque() {
		return danoAtaque;
	}

	public void setDanoAtaque(int danoAtaque) {
		this.danoAtaque = danoAtaque;
	}

	public String getNombreAtaque() {
		return nombreAtaque;
	}

	public void setNombreAtaque(String nombreAtaque) {
		this.nombreAtaque = nombreAtaque;
	}

	public int getPocionVitalidad() {
		return pocionVitalidad;
	}

	public void setPocionVitalidad(int pocionVitalidad) {
		this.pocionVitalidad = pocionVitalidad;
	}

	public int getPocionIntercambio() {
		return pocionIntercambio;
	}

	public void setPocionIntercambio(int pocionIntercambio) {
		this.pocionIntercambio = pocionIntercambio;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	
	
	public String toString() {
		return "Protagonista: nombre: " + nombre + " vitalidad: " + vitalidad + " danoAtaque: " + danoAtaque + " nombreAtaque: " +nombreAtaque 
				+ " pocionVitalidad: " + pocionVitalidad + " pocionIntercambio: " + pocionIntercambio + " dinero: " + dinero + " victorias: " 
				+ victorias + " derrotas: " + derrotas ;
	}

}
