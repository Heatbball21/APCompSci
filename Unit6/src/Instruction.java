import java.security.SecureRandom;

public class Instruction {

	SecureRandom sr = new SecureRandom();
	int num1;
	int num2;
	
	
	public void newQuestion() {
		num1 = sr.nextInt(10);
		num2 = sr.nextInt(10);
		System.out.println("What is " + num1 + " x " + num2 + "? :");
	}
	public void retryQuestion() {
		System.out.println("Try Again\n");
		System.out.println("What is " + num1 + " x " + num2 + "? :");
	}
	public void checkAnswer(int answer) {
		
		if(answer != num1 * num2) {
			retryQuestion();
		}else {
			System.out.println("Very Good!");
			newQuestion();
		}
		
	}
	
}

