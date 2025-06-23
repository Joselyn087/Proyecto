package modelo;

import vista.joption.Escritor;

public class Enemigo {
	private String nombre;
	private int vitalidadMaxima;
	private int danoAtaque;
	private String nombreAtaque;
	RuedaDelDestino azarNombre;
	Escritor escritor;
	
	public Enemigo() {
		nombre = "";
		vitalidadMaxima = 0;
		danoAtaque = 0;
		nombreAtaque = "";
		azarNombre = new RuedaDelDestino(1, 3);
		escritor = new Escritor();
	}

	public void generarEnemigoTierra() {
		
		switch(azarNombre.numeroAzar()) {
			case 1:
				nombre = "El Sombrío";	
				vitalidadMaxima = 130;
				danoAtaque = 18;
				nombreAtaque = "Aplastamiento";
				break;
			case 2:
				nombre = "El Profeta Olvidado";
				vitalidadMaxima = 140;
				danoAtaque = 20;
				nombreAtaque = "Golpe de garrote";
				break;
			case 3:
				nombre = "La Sombra Errante";
				vitalidadMaxima = 150;
				danoAtaque = 30;
				nombreAtaque = "Estocada veloz";
				break;
		
		}
		escritor.escribir(nombre + " usa " + nombreAtaque + ", tiene " + vitalidadMaxima + " de vitalidad y causa " + danoAtaque + " de daño.");
	}
	

	public void generarEnemigosMar() {
		switch(azarNombre.numeroAzar()) {
		case 1:
			nombre = "Sombra Eterna";	
			vitalidadMaxima = 130;
			danoAtaque = 18;
			nombreAtaque = "Tentáculo aplastante";
		break;
		case 2:
			nombre = "La Bestia del Abismo";
			vitalidadMaxima = 140;
			danoAtaque = 20;
			nombreAtaque = "Disparo maldito";
			break;
		case 3:
			nombre = "Lord Chiflón";
			vitalidadMaxima = 150;
			danoAtaque = 30;
			nombreAtaque = "Canto mortal";
		break;
	
		}	
		escritor.escribir(nombre + " usa " + nombreAtaque + ", tiene " + vitalidadMaxima + " de vitalidad y causa " + danoAtaque + " de daño.");
	
	}

	public int getVitalidad() {
		return vitalidadMaxima;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidadMaxima = vitalidad;
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
