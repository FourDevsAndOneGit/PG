package source.light;

import javax.swing.JOptionPane;

import source.light.menu.Menu;

public class Run extends Menu{
	
	/**
	 * source.light will be the package that will store the light version code.
	 * Run is the executor of the light version, from it all the program in the light version will work.
	 * Run will inherit class source.light.menu.Menu which will have access to the other codes.
	 */
	
	public Run() {
		// TODO Auto-generated constructor stub
	}
	
	public void Executable() {
		Object request = JOptionPane.showInputDialog(null, "Escolha topico desejado", "PG", JOptionPane.INFORMATION_MESSAGE, null, opc, opc[0]);
		testRequest(request);
	}
}