package source.light.a;

import javax.swing.JOptionPane;

public class Variables {
	
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
	
	private void selectQuestion() {
		upQuestion(questions);
		if (questions == 1) {
			
		}else if (questions == 2){
			
		}else if (questions == 3){
			
		}else {
			Error();
		}
	}
	
	private void Error() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado", "PG", JOptionPane.ERROR_MESSAGE, null);
	}

}
