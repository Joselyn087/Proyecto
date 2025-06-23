package modelo;



public class Enemigo {
	private String nombre;
	private int vitalidad;
	private int danoAtaque;
	private String nombreAtaque;
	
	
	public Enemigo() {
		nombre = "";
		vitalidad = 0;
		danoAtaque = 0;
		nombreAtaque = "";
		
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
