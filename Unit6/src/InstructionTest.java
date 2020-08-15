
import java.util.Scanner;

public class InstructionTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Instruction i = new Instruction();
		int answer;
		i.newQuestion();
		while(true) {		
		answer = s.nextInt();
		i.checkAnswer(answer);
		
		}	
		
	}
}
