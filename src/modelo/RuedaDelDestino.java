// Joselyn Salas Ramirez C4J596
// Skylar Espinoza B82757
package modelo;

public class RuedaDelDestino {
	
	private int resultado;
		
	
	public int girar(int minimo, int maximo) {
		if (minimo>maximo) {
			int temporal;
			temporal = minimo;
			minimo = maximo;
			maximo = temporal;
			
			
		}
		resultado = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
	    return resultado;
	}

		

}
