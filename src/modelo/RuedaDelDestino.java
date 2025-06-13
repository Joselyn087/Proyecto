package modelo;

public class RuedaDelDestino {
	private int minimo;
	private int maximo;
	private int resultado;
		
		
		//Inicializar
	public RuedaDelDestino(int minimo, int maximo) {
		this.maximo = maximo;
		this.minimo = minimo;
			
		}
		
	public int numeroAzar() {
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
