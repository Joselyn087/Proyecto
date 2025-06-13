package controlador;

import modelo.Enemigo;
import modelo.Protagonista;
import modelo.Tienda;
import vista.joption.Escritor;
import vista.joption.Lector;

public class JuegoRPG {

	public static void main(String[] args) {
		Protagonista protagonista;
		Enemigo enemigo;
		Lector lector;
		Escritor escritor;
		Tienda tienda;
		
		protagonista = new Protagonista();
		enemigo = new Enemigo();
		lector = new Lector();
		escritor = new Escritor();
		tienda = new Tienda();
		
		escritor.escribir("El nombre del enemigo es " + protagonista.nombreProtaginista() + "vitalidad" + protagonista.getVitalidad());
		
		int opcionMenu = lector.leerInt("1. Explorar \n2.Estado \n3.Comprar \nSalir");
		if(opcionMenu == 1) {
			tienda.pocionVitalidad();
			escritor.escribir(protagonista.nombreProtaginista() + " recibió una poción de vitalidad de +" + tienda.getCantidadVitalidad());
			escritor.escribir("La vitalidad es "+ protagonista.getVitalidad());
			
		}
		
		
		
		
	}

}
