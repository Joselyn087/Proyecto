// Joselyn Salas Ramirez C4J596
// Skylar Espinoza B82757
package vista.terminal;

import java.util.Scanner;

public class Lector {
	public Scanner sc;
	
	public Lector() {
		sc = new Scanner(System.in);
	}
	
	public String leerString(String Mensaje) {
		return sc.next();
	}
	
	public int leerInt(String Mensaje) {
		return sc.nextInt();
	}

	public char leerChar(String Mensaje) {
		return sc.next().charAt(0);
	}
	
	public double leerDouble(String Mensaje) {
		return sc.nextDouble();
	}
	
	public boolean leerBoolean(String Mensaje) {
		return sc.nextBoolean();
	}

}
