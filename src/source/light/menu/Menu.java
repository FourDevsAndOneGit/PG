package source.light.menu;

import javax.swing.JOptionPane;

import source.light.Run;
import source.light.a.Variables;

public class Menu {
	
	protected final String [] opc = {"variaveis","opção2", "opção3"};
	
	/**
	 * Menu instantiate all classes of the source.light.a, source.light.b, and source.light.c packages.
	 * Menu will have a constant exchange of data with such classes.
	 */
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public void testRequest (Object obj) {
		if (obj.equals(opc[0])) {
			goVariablesTopic();
		}else if (obj.equals(opc[1])) {
			goError();
		}else if (obj.equals(opc[2])) {
			goError();
		}
	}
	
	public void goError() {
		Run run = new Run();
		JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado", "PG", JOptionPane.ERROR_MESSAGE, null);
		run.Executable();
	}
	
	public void goVariablesTopic () {
		Variables variables = new Variables();
		variables.startTopic();
	}

}
