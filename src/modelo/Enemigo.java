package modelo;

public class Enemigo {
	private String nombre;
	private int vitalidad;
	private int danoAtaque;
	private String nombreAtaque;
	RuedaDelDestino azarNombre;
	
	public Enemigo() {
		nombre = "";
		vitalidad = 100;
		danoAtaque = 0;
		nombreAtaque = "";
		azarNombre = new RuedaDelDestino(1, 3);
	}

public String nombreEnemigosTierra() {
		
		if(azarNombre.numeroAzar() == 1) {
			nombre = "El Sombrío";
		}else if(azarNombre.numeroAzar() == 2) {
			nombre = "El Profeta Olvidado";
			
		}else {
			nombre = "La Sombra Errante";
		}
		return nombre;
		
	}

public String nombreEnemigosMar() {
	
	if(azarNombre.numeroAzar() == 1) {
		nombre = "Sombra Eterna";
	}else if(azarNombre.numeroAzar() == 2) {
		nombre = "Lord Chiflón";
		
	}else {
		nombre = "La Bestia del Abismo";
	}
	return nombre;
	
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
	

}
