// Joselyn Salas Ramirez C4J596
// Skylar Espinoza B82757
package vista.joption;

import javax.swing.JOptionPane;

public class Lector {
	public Lector() {
		
	}
	
	public String leerString(String Mensaje) {
		return JOptionPane.showInputDialog(Mensaje);
	}
		
	public char leerChar(String Mensaje) {
		return JOptionPane.showInputDialog(Mensaje).charAt(0);
	
	}
	
	public int leerInt(String Mensaje) {
		return Integer.parseInt(JOptionPane.showInputDialog(Mensaje));
	}
	
	public double leerDouble(String Mensaje) {
		return Double.parseDouble(JOptionPane.showInputDialog(Mensaje));
	}
	
	public boolean leerBoolean(String Mensaje) {
		return Boolean.parseBoolean(JOptionPane.showInputDialog(Mensaje));
				
		
	}

}
