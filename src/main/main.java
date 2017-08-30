package main;

import javax.swing.JOptionPane;

import source.light.Run;

public class main {
	
	/**
	 * Main will be the starting point of the entire program.
	 * The starting point will be divided into 2, light version (where it will be a part made entirely in the terminal), 
	 * and full version (where interface will be used).
	 * Main will have a version choice system where the user can choose which version to use.
	 * Main will have 2 methods, one will use EventQueue from awt with run method for the full version, and another will 
	 * start directly to other methods in other packages in which to start light version.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run run = new Run();
		
		String [] opc = {"Versão light","Versão Full"};
		Object menu = JOptionPane.showInputDialog(null, "Escolha a versão", "PG", JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
		if (menu.equals(opc[0])) {
			run.Executable();
		}else {
			JOptionPane.showMessageDialog(null, "Versão full ainda em desenvolvimento", "PG", JOptionPane.ERROR_MESSAGE, null);
			main(null);
		}
	}
	
}