package controlador;

import modelo.Enemigo;
import modelo.Protagonista;
import modelo.RuedaDelDestino;
import modelo.Tienda;
import vista.joption.Escritor;
import vista.joption.Lector;

public class JuegoRPG {

	public static void main(String[] args) {
		
		JuegoRPG juego = new JuegoRPG();	
		juego.iniciarJuego();
	}
		
	public void iniciarJuego(){
		Protagonista protagonista = new Protagonista();;
		Enemigo enemigo = new Enemigo();;
		Lector lector = new Lector();;
		Escritor escritor = new Escritor();;
		Tienda tienda = new Tienda();;
		RuedaDelDestino rueda = new RuedaDelDestino();
		int opcionMenu;
		
		switch(rueda.girar(1, 3)) {
		case 1:
			protagonista.setNombre("Artur");
			
		break;
		case 2:
			protagonista.setNombre("Diana");
			
		break;
		case 3:
			protagonista.setNombre("Petra");
			
		break;
	}
		protagonista.setVitalidad(rueda.girar(80, 100));
		
		
		boolean jugar = true;
		while(jugar){
			escritor.escribir("Las posibilidades son múltiples; algunas elecciones son sencillas, otras sensatas, unas temerarias... \n"
						+ "y algunas peligrosas. Eres tú quien debe tomar las decisiones. Puedes jugar muchas veces y obtener \n"
						+ "resultados diferentes. Recuerda que tú decides la aventura, que tú eres la aventura. Si tomas una decisión \n"
						+ "imprudente, vuelve al principio y empieza de nuevo. No hay opciones acertadas o erróneas, sino muchas elecciones \n"
						+ "posibles. Elige tu propia aventura");
			
			
			escritor.escribir("El heroe con el que jugaras el dia de hoy se llama " + protagonista.getNombre());
			if(protagonista.getVictorias() == 5) {
				escritor.escribir( "“Tu nombre empieza a escucharse en las aldeas."
						+ " Eres conocido como El Errante, portador de la voluntad de Lyvaria.”");
			}else if(protagonista.getDerrotas() == 5) {
				escritor.escribir( "“Te debilitas. Las criaturas del caos sienten tu flaqueza... pero la historia aún no ha terminado.”");
			}else {
				
			}
			
			opcionMenu = lector.leerInt("1. Explorar \n2.Estado \n3.Tienda \n4.Salir");
			switch(opcionMenu) {
				// explorar
				case 1:
					
					int opcionLugar = lector.leerInt("Selecciona un lugar \n1.Tierra \n2.Mar");
					
					switch(opcionLugar) {
						//Tierra
						case 1:
							escritor.escribir("“Caminas entre ruinas cubiertas de hiedra. El viento susurra secretos\r\n"
									+ "olvidados. De pronto, una figura emerge entre el polvo…”");
							
							boolean lucharTierra = true;
							switch(rueda.girar(1,3)) {
							case 1:
								enemigo.setNombre("El Sombrío");	
								enemigo.setVitalidad(90);
								enemigo.setDanoAtaque(20);
								enemigo.setNombreAtaque("Aplastamiento");
								break;
							case 2:
								enemigo.setNombre("El Profeta Olvidado");
								enemigo.setVitalidad(100);
								enemigo.setDanoAtaque(40);
								enemigo.setNombreAtaque("Golpe de garrote");
							break;
							case 3:
								enemigo.setNombre("La Sombra Errante");
								enemigo.setVitalidad(110);
								enemigo.setDanoAtaque(50);
								enemigo.setNombreAtaque("Estocada veloz");
							break;
					
						}
							escritor.escribir(enemigo.getNombre() + " usa " + enemigo.getNombreAtaque() + ", tiene " + enemigo.getVitalidad() + " de vitalidad y causa " + enemigo.getDanoAtaque() + " de daño.");
							while(lucharTierra) {
								
								
								int accion = lector.leerInt("¿Qué deseas hacer? \n1. Luchar \n2. Correr \n3. Ir a la tienda \n4. Regresar");
								switch(accion) {
									//Luchar
									case 1:
										while(protagonista.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
											//ataque protagonista
											enemigo.setVitalidad(enemigo.getVitalidad()- protagonista.getDanoAtaque());
											escritor.escribir("¡Atacas al enemigo! Vitalidad del enemigo: " + enemigo.getVitalidad());
											
											if(enemigo.getVitalidad() <= 0) {
												escritor.escribir("¡Has derrotado al enemigo!");
												protagonista.setVictorias(protagonista.getVictorias() + 1);
												protagonista.setDinero(protagonista.getDinero() + 20);
												lucharTierra = false;
												break;
											}
											
											
											//ataque enemigo
											protagonista.setVitalidad(protagonista.getVitalidad() - enemigo.getDanoAtaque());
									        escritor.escribir("El enemigo te ataca. Tu vitalidad: " + protagonista.getVitalidad());

									        if (protagonista.getVitalidad() <= 0) {
									            escritor.escribir("¡Has sido derrotado!");
									            protagonista.setDerrotas(protagonista.getDerrotas() + 1);
									            lucharTierra = false;
									            break;
									        }
										}
									break;
									//Correr
									case 2:
										escritor.escribir("el protagonista se retira del combate contra " + enemigo.getNombre());
										lucharTierra = false;
									break;
									//ir a la tienda
									case 3:
										boolean entrarTiendaTierra = true;
										while(entrarTiendaTierra) {
											escritor.escribir("“Encuentras una carreta abandonada convertida en tienda por un mercader\r\n"
												+ "nómada. ‘Solo vendo a los que tienen valor... y monedas’, dice mientras ríe con\r\n"
												+ "dientes dorados.”");
											int opcionCompra1 = lector.leerInt("Bienvenido a la tienda \n Su dinero es " + protagonista.getDinero() 
											+ "\n1. Comprar poción de vitalidad (10 monedas) \n2. Comprar poción de intercambio (30 monedas) \n3. Regresar");
											
											switch(opcionCompra1) {
											case 1:
												
												if(protagonista.getDinero()>= tienda.getPrecioVitalidad()) {
													if(tienda.getCantidadVitalidad()<= 0) {
														escritor.escribir("No quedan posiones de vitalidad");
													
													}else if(protagonista.getDinero() < tienda.getPrecioVitalidad()) {
														escritor.escribir("No tienes suficiente dinero");
													
													}else{
														protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioVitalidad());
													
														int aumentoVitalidad = rueda.girar(40,80);
														int vitalidadJugador = protagonista.getVitalidad();
														int nuevaVitalidad = (vitalidadJugador + aumentoVitalidad);
													
														protagonista.setVitalidad(nuevaVitalidad);
														tienda.setCantidadVitalidad(tienda.getCantidadVitalidad() -1);
														escritor.escribir("Has comprado una poción de vitalidad.(+"+ aumentoVitalidad + "vitalidad)");
													}
													protagonista.setPocionVitalidad(protagonista.getPocionVitalidad() + 1);
													
													escritor.escribir("vitalidad " + protagonista.getVitalidad() + "dinero " + protagonista.getDinero());
												}else {
													escritor.escribir("No tienes suficiente dinero");
												}
												
											break;
											case 2:
												//Comprar posion intercambio
												
												if(protagonista.getDinero() >= tienda.getPrecioIntercambio()) {
													if(tienda.getCantidadIntercambio()<= 0) {

														escritor.escribir("No quedan posiones de intercambio");
														

														return;

													}else if(protagonista.getDinero() < tienda.getPrecioIntercambio()) {
														escritor.escribir("No tienes suficiente dinero");
														
													}else if (protagonista.getVitalidad() <= 0){
														escritor.escribir("no tienes vitalidad para intercambiar");
														
													}else if(enemigo.getVitalidad() <= 0) {
														escritor.escribir("La vitalidad del el enemigo es " + enemigo.getVitalidad() + ", no puedes comprar posion de intercambio");
														
													}else {
														protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
														
														int temporal = protagonista.getVitalidad();
														protagonista.setVitalidad(enemigo.getVitalidad());
														enemigo.setVitalidad(temporal);
												
														tienda.setCantidadIntercambio(tienda.getCantidadIntercambio() - 1);
														escritor.escribir("Has usado una poción de intercambio.");
													    escritor.escribir("Ahora tu vitalidad es: " + protagonista.getVitalidad() +
													                      "\nLa vitalidad del enemigo es: " + enemigo.getVitalidad());
													    
														
														escritor.escribir("Has intercambiado tu vitalidad con el enemigo");
													}
													protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
													protagonista.setPocionIntercambio(protagonista.getPocionIntercambio() + 1);
												}else {
													escritor.escribir("No tienes suficinte dinero");
												}
											break;
											case 3:
												entrarTiendaTierra = false;
											break;
											default:
											
											}
										}
									break;
									case 4:
										lucharTierra = false;
									break;
									default:
										escritor.escribir("Digite una opcion valida");
								}
								
							}
						break;
						//Mar
						case 2:
							escritor.escribir("“Surcas las costas escarpadas, donde las olas rompen con furia. De las\r\n"
									+ "aguas oscuras asciende una criatura ancestral…”");
							boolean lucharMar = true;
							switch(rueda.girar(1,3)) {
								case 1:
									enemigo.setNombre("Sombra Eterna");	
									enemigo.setVitalidad(90);
									enemigo.setDanoAtaque(20);
									enemigo.setNombreAtaque("Tentáculo aplastante");
									break;
								case 2:
									enemigo.setNombre("La Bestia del Abismo");
									enemigo.setVitalidad(100);
									enemigo.setDanoAtaque(40);
									enemigo.setNombreAtaque("Disparo maldito");
								break;
								case 3:
									enemigo.setNombre("Lord Chiflón");
									enemigo.setVitalidad(110);
									enemigo.setDanoAtaque(50);
									enemigo.setNombreAtaque("Canto mortal");
									break;
						
							}	
							escritor.escribir(enemigo.getNombre() + " usa " + enemigo.getNombreAtaque() + ", tiene " + enemigo.getVitalidad() + " de vitalidad y causa " + enemigo.getDanoAtaque() + " de daño.");
						
							while(lucharMar) {
								
								
								int accionMar = lector.leerInt("¿Qué deseas hacer? \n1. Luchar \n2. Correr \n3. Ir a la tienda \n4. Regresar");
								
								switch(accionMar) {
									//Luchar
								
									case 1:
										
										while(protagonista.getVitalidad() > 0 && enemigo.getVitalidad() > 0) {
											
											//ataque protagonista
											enemigo.setVitalidad(enemigo.getVitalidad()- protagonista.getDanoAtaque());
											escritor.escribir("¡Atacas al enemigo! Vitalidad del enemigo: " + enemigo.getVitalidad());
											
											if(enemigo.getVitalidad() <= 0) {
												escritor.escribir("¡Has derrotado al enemigo!");
												protagonista.setVictorias(protagonista.getVictorias() + 1);
												protagonista.setDinero(protagonista.getDinero() + 20);
												lucharMar = false;
												break;
												
											}
											
											//ataque enemigo
											protagonista.setVitalidad(protagonista.getVitalidad() - enemigo.getDanoAtaque());
									        escritor.escribir("El enemigo te ataca. Tu vitalidad: " + protagonista.getVitalidad());

									        if (protagonista.getVitalidad() <= 0) {
									            escritor.escribir("¡Has sido derrotado!");
									            protagonista.setDerrotas(protagonista.getDerrotas() + 1);
									            lucharMar = false;
									            break;
									        }
									        escritor.escribir("La vitalidad de " + protagonista.getNombre() + " es " + protagonista.getVitalidad());
									        
									        lucharMar = false;

									     
										}
									break;
									//Correr
									case 2:
										escritor.escribir("el protagonista se retira del combate contra " + enemigo.getNombre());
										lucharMar = false;
									break;
									//ir a la tienda
									case 3:
										boolean entrarTiendaMar = true;
										while(entrarTiendaMar) {
											escritor.escribir("“Encuentras una carreta abandonada convertida en tienda por un mercader\r\n"
												+ "nómada. ‘Solo vendo a los que tienen valor... y monedas’, dice mientras ríe con\r\n"
												+ "dientes dorados.”");
											int opcionCompraMar = lector.leerInt("Bienvenido a la tienda \n Su dinero es " + protagonista.getDinero() 
											+ "\n1. Comprar poción de vitalidad (10 monedas) \n2. Comprar poción de intercambio (30 monedas) \n3. Regresar");
											
											switch(opcionCompraMar) {
												case 1:
													
													if(protagonista.getDinero()>= tienda.getPrecioVitalidad()) {
														if(tienda.getCantidadVitalidad()<= 0) {
															escritor.escribir("No quedan posiones de vitalidad");
														
														}else if(protagonista.getDinero() < tienda.getPrecioVitalidad()) {
															escritor.escribir("No tienes suficiente dinero");
														
														}else{
															protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioVitalidad());
														
															int aumentoVitalidad = rueda.girar(40,80);
															int vitalidadJugador = protagonista.getVitalidad();
															int nuevaVitalidad = (vitalidadJugador + aumentoVitalidad);
														
															protagonista.setVitalidad(nuevaVitalidad);
															tienda.setCantidadVitalidad(tienda.getCantidadVitalidad() -1);
															escritor.escribir("Has comprado una poción de vitalidad.(+"+ aumentoVitalidad + "vitalidad)");
														}
														protagonista.setPocionVitalidad(protagonista.getPocionVitalidad() + 1);
														
														escritor.escribir("vitalidad " + protagonista.getVitalidad() + "dinero " + protagonista.getDinero());
													}else {
														escritor.escribir("No tienes suficiente dinero");
													}
													
												break;
												case 2:
													//Comprar posion intercambio
													
													if(protagonista.getDinero() >= tienda.getPrecioIntercambio()) {
														if(tienda.getCantidadIntercambio()<= 0) {

															escritor.escribir("No quedan posiones de intercambio");
															

															return;

														}else if(protagonista.getDinero() < tienda.getPrecioIntercambio()) {
															escritor.escribir("No tienes suficiente dinero");
															
														}else if (protagonista.getVitalidad() <= 0){
															escritor.escribir("no tienes vitalidad para intercambiar");
															
														}else if(enemigo.getVitalidad() <= 0) {
															escritor.escribir("La vitalidad del el enemigo es " + enemigo.getVitalidad() + ", no puedes comprar posion de intercambio");
															
														}else {
															protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
															
															int temporal = protagonista.getVitalidad();
															protagonista.setVitalidad(enemigo.getVitalidad());
															enemigo.setVitalidad(temporal);
													
															tienda.setCantidadIntercambio(tienda.getCantidadIntercambio() - 1);
															escritor.escribir("Has usado una poción de intercambio.");
														    escritor.escribir("Ahora tu vitalidad es: " + protagonista.getVitalidad() +
														                      "\nLa vitalidad del enemigo es: " + enemigo.getVitalidad());
														    
															
															escritor.escribir("Has intercambiado tu vitalidad con el enemigo");
														}
														protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
														protagonista.setPocionIntercambio(protagonista.getPocionIntercambio() + 1);
													}else {
														escritor.escribir("No tienes suficinte dinero");
													}
												break;
												case 3:
													entrarTiendaMar = false;
												break;
												default:
											
											}
										}
									break;
									case 4:
										lucharMar = false;
									break;
									default:
										escritor.escribir("Digite una opcion valida");
								}
								
							}
						break;
					}
				//Explorar
				case 2:
					escritor.escribir("\nESTADO DEL PROTAGONISTA" + "\nNombre: " + protagonista.getNombre() + "\nVitalidad: " + protagonista.getVitalidad() + "\nDaño de Ataque: " + protagonista.getDanoAtaque() + "\nDinero: " + protagonista.getDinero()
			     	+ "\nVictorias: " + protagonista.getVictorias() + "\nDerrotas: " + protagonista.getDerrotas()
			        + "\nPociones de Vitalidad: " + protagonista.getPocionVitalidad()
			        + "\nPociones de Intercambio: " + protagonista.getPocionIntercambio());
					
				break;
				//Tienda
				case 3:
					boolean entrarTienda = true;
					while(entrarTienda) {
						escritor.escribir("“Encuentras una carreta abandonada convertida en tienda por un mercader\r\n"
							+ "nómada. ‘Solo vendo a los que tienen valor... y monedas’, dice mientras ríe con\r\n"
							+ "dientes dorados.”");
						int opcionCompra = lector.leerInt("Bienvenido a la tienda \n Su dinero es " + protagonista.getDinero() 
						+ "\n1. Comprar poción de vitalidad (10 monedas) \n2. Comprar poción de intercambio (30 monedas) \n3. Regresar");
						
						switch(opcionCompra) {
						case 1:
							
							if(protagonista.getDinero()>= tienda.getPrecioVitalidad()) {
								if(tienda.getCantidadVitalidad()<= 0) {
									escritor.escribir("No quedan posiones de vitalidad");
								
								}else if(protagonista.getDinero() < tienda.getPrecioVitalidad()) {
									escritor.escribir("No tienes suficiente dinero");
								
								}else{
									protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioVitalidad());
								
									int aumentoVitalidad = rueda.girar(40,80);
									int vitalidadJugador = protagonista.getVitalidad();
									int nuevaVitalidad = (vitalidadJugador + aumentoVitalidad);
								
									protagonista.setVitalidad(nuevaVitalidad);
									tienda.setCantidadVitalidad(tienda.getCantidadVitalidad() -1);
									escritor.escribir("Has comprado una poción de vitalidad.(+"+ aumentoVitalidad + "vitalidad)");
								}
								protagonista.setPocionVitalidad(protagonista.getPocionVitalidad() + 1);
								
								escritor.escribir("vitalidad " + protagonista.getVitalidad() + "dinero " + protagonista.getDinero());
							}else {
								escritor.escribir("No tienes suficiente dinero");
							}
							
						break;
						case 2:
							//Comprar posion intercambio
							
							if(protagonista.getDinero() >= tienda.getPrecioIntercambio()) {
								if(tienda.getCantidadIntercambio()<= 0) {

									escritor.escribir("No quedan posiones de intercambio");
									

									return;

								}else if(protagonista.getDinero() < tienda.getPrecioIntercambio()) {
									escritor.escribir("No tienes suficiente dinero");
									
								}else if (protagonista.getVitalidad() <= 0){
									escritor.escribir("No tienes vitalidad para intercambiar");
									
								}else if(enemigo.getVitalidad() <= 0) {
									escritor.escribir("La vitalidad del el enemigo es " + enemigo.getVitalidad() + ", no puedes comprar posion de intercambio");
									
								}else {
									protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
									
									int temporal = protagonista.getVitalidad();
									protagonista.setVitalidad(enemigo.getVitalidad());
									enemigo.setVitalidad(temporal);
							
									tienda.setCantidadIntercambio(tienda.getCantidadIntercambio() - 1);
									escritor.escribir("Has usado una poción de intercambio.");
								    escritor.escribir("Ahora tu vitalidad es: " + protagonista.getVitalidad() +
								                      "\nLa vitalidad del enemigo es: " + enemigo.getVitalidad());
								    
									
									escritor.escribir("Has intercambiado tu vitalidad con el enemigo");
								}
								protagonista.setDinero(protagonista.getDinero() - tienda.getPrecioIntercambio());
								protagonista.setPocionIntercambio(protagonista.getPocionIntercambio() + 1);
							}else {
								escritor.escribir("No tienes suficinte dinero");
							}
						break;
						case 3:
							entrarTienda = false;
						break;
						default:
						
						}
					}
				break;
				//Salir
				case 4:
					escritor.escribir("Gracias por jugar. ¡Hasta la próxima!");
					jugar = false;

				break;
				default:
					escritor.escribir("Digite una opcion valida");
			}
		if(protagonista.getVictorias() == 10) {
			escritor.escribir(" “Has derrotado a los guardianes de la Tierra y el Mar. El velo entre los elementos \r\n"
					+ "se ha restaurado. Pero nuevos rumores surgen… Esta historia apenas comienza.”");
		}
		
		
		}
		
			
	}
	
	
	
	
	
}