package source.light.a;

import javax.swing.JOptionPane;

import source.light.a.variablequestions.Questions;

public class Variables extends Questions {
	
	/**
	 * 
	 */
	
	private int questions = 0;
	
	public Variables() {
		// TODO Auto-generated constructor stub
	}
	
	public void startTopic() {
		questions = 0;
		selectQuestion();
	}
	
	private int upQuestion (int question) {
		return this.questions = question + 1;
	}
	
	public void selectQuestion() {
		upQuestion(questions);
		if (questions == 1) {
			quest1();
		}else if (questions == 2){
			quest2();
		}else if (questions == 3){
			
		}else {
			Error();
		}
	}
	
	private void Error() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado", "PG", JOptionPane.ERROR_MESSAGE, null);
	}

}
