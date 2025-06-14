package controlador;

import modelo.Enemigo;
import modelo.Protagonista;
import modelo.Tienda;
import vista.joption.Escritor;
import vista.joption.Lector;

public class JuegoRPG {

	public static void main(String[] args) {
		
		JuegoRPG juego = new JuegoRPG();
        
		
		
		juego.iniciarJuego();
	}
		
	public void iniciarJuego(){
		Protagonista protagonista;
		Enemigo enemigo;
		Lector lector;
		Escritor escritor;
		Tienda tienda;
		int opcionMenu;
		
		protagonista = new Protagonista();
		enemigo = new Enemigo();
		lector = new Lector();
		escritor = new Escritor();
		tienda = new Tienda();
		
		
		boolean jugar = true;
		while(jugar){
			escritor.escribir("Las posibilidades son múltiples; algunas elecciones son sencillas, otras sensatas, unas temerarias... \n"
						+ "y algunas peligrosas. Eres tú quien debe tomar las decisiones. Puedes jugar muchas veces y obtener \n"
						+ "resultados diferentes. Recuerda que tú decides la aventura, que tú eres la aventura. Si tomas una decisión \n"
						+ "imprudente, vuelve al principio y empieza de nuevo. No hay opciones acertadas o erróneas, sino muchas elecciones \n"
						+ "posibles. Elige tu propia aventura");
			String nombreProtagonista = protagonista.nombreProtaginista();
			escritor.escribir("El heroe con el que jugaras el dia de hoy se llama " + nombreProtagonista);
			
			opcionMenu = lector.leerInt("1. Explorar \n2.Estado \n3.Tienda \n4.Salir");
			switch(opcionMenu) {
				case 1:
					int opcionLugar = lector.leerInt("Selecciona un lugar \n1.Tierra \n2.Mar");
					boolean luchar = true;
					int accion;
					switch(opcionLugar) {
						case 1:
							escritor.escribir("“Caminas entre ruinas cubiertas de hiedra. El viento susurra secretos\r\n"
									+ "olvidados. De pronto, una figura emerge entre el polvo…”");
							
							while(luchar) {
								accion = lector.leerInt("¿Qué deseas hacer? \n1. Luchar \n2. Correr \n3. Ir a la tienda");
								switch(accion) {
									case 1:
									break;
									case 2:
									break;
									case 3:
									break;
									default:
								}
								
							}
						break;
						case 2:
							escritor.escribir("“Surcas las costas escarpadas, donde las olas rompen con furia. De las\r\n"
									+ "aguas oscuras asciende una criatura ancestral…”");
							while(luchar) {
								
							}
						break;
						default:
							escritor.escribir("Digite una opcion valida");
					
					}
					
				break;
				case 2:
				break;
				case 3:
					escritor.escribir("“Encuentras una carreta abandonada convertida en tienda por un mercader\r\n"
							+ "nómada. ‘Solo vendo a los que tienen valor... y monedas’, dice mientras ríe con\r\n"
							+ "dientes dorados.”");
				break;
				case 4:
					escritor.escribir("Gracias por jugar. ¡Hasta la próxima!");
					jugar = false;

				break;
				default:
					escritor.escribir("Digite una opcion valida");
			}
		}
	}
}
	


