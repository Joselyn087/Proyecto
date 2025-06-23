package modelo;

public class RuedaDelDestino {
	private int minimo;
	private int maximo;
	private int resultado;
		
		
		//Inicializar
	public RuedaDelDestino() {
		this.maximo = 0;
		this.minimo = 0;
			
		}
		
	
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
