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
		
		String nombreProtagonista = protagonista.nombreProtaginista();
		String nombreEnemigoTierra = enemigo.nombreEnemigosTierra();
		String nombreEnemigoMar = enemigo.nombreEnemigosMar();
		boolean jugar = true;
		while(jugar){
			escritor.escribir("Las posibilidades son múltiples; algunas elecciones son sencillas, otras sensatas, unas temerarias... \n"
						+ "y algunas peligrosas. Eres tú quien debe tomar las decisiones. Puedes jugar muchas veces y obtener \n"
						+ "resultados diferentes. Recuerda que tú decides la aventura, que tú eres la aventura. Si tomas una decisión \n"
						+ "imprudente, vuelve al principio y empieza de nuevo. No hay opciones acertadas o erróneas, sino muchas elecciones \n"
						+ "posibles. Elige tu propia aventura");
			
			escritor.escribir("El heroe con el que jugaras el dia de hoy se llama " + nombreProtagonista);
			
			opcionMenu = lector.leerInt("1. Explorar \n2.Estado \n3.Tienda \n4.Salir");
			switch(opcionMenu) {
				// explorar
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
										while(protagonista.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
											
											//ataque protagonista
											enemigo.setVitalidad(enemigo.getVitalidad()- protagonista.getDanoAtaque());
											escritor.escribir("¡Atacas al enemigo! Vitalidad del enemigo: " + enemigo.getVitalidad());
											
											if(enemigo.getVitalidad() <= 0) {
												escritor.escribir("¡Has derrotado al enemigo!");
												protagonista.setVictorias(protagonista.getVictorias() + 1);
												protagonista.setDinero(protagonista.getDinero() + 50);
											}
											
											//ataque enemigo
											protagonista.setVitalidad(protagonista.getVitalidad() - enemigo.getDanoAtaque());
									        escritor.escribir("El enemigo te ataca. Tu vitalidad: " + protagonista.getVitalidad());

									        if (protagonista.getVitalidad() <= 0) {
									            escritor.escribir("¡Has sido derrotado!");
									            protagonista.setDerrotas(protagonista.getDerrotas() + 1);
									        }

											
										}
									break;
									case 2:
										escritor.escribir("el protagonista se retira del combate contra " + nombreEnemigoTierra);
										luchar = false;
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
								accion = lector.leerInt("¿Qué deseas hacer? \n1. Luchar \n2. Correr \n3. Ir a la tienda");
								switch(accion) {
									case 1:
									break;
									case 2:
										escritor.escribir("el protagonista se retira del combate contra " + nombreEnemigoMar);
										luchar = false;
									break;
									case 3:
									break;
									default:
								}
							}
						break;
						default:
							escritor.escribir("Digite una opcion valida");
					
					}
					
				break;
				case 2:
					escritor.escribir("\nESTADO DEL PROTAGONISTA" + "\nNombre: " + nombreProtagonista + "\nVitalidad: " + protagonista.getVitalidad() + "\nDaño de Ataque: " + protagonista.getDanoAtaque() + "\nDinero: " + protagonista.getDinero()
			     	+ "\nVictorias: " + protagonista.getVictorias() + "\nDerrotas: " + protagonista.getDerrotas()
			        + "\nPociones de Vitalidad: " + protagonista.getPocionVitalidad()
			        + "\nPociones de Intercambio: " + protagonista.getPocionIntercambio());
					
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