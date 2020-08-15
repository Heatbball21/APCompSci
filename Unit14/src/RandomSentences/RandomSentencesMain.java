package RandomSentences;

import java.util.Random;



public class RandomSentencesMain {
	static String[] article = {"the", "a", "one", "some", "any"};
	static String[] noun = {"boy", "girl", "town", "dog", "car"};
	static String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
	static String[] preposition = {"to", "from", "over", "under", "on"};
	static String sentence = "";
	static Random r = new Random();
	static int[] numSet = new int[6];
	
	public static void main(String[] args) {
		
		
		
		for(int i = 0; i < 20; i++) {
			createSentence();
		}
		
	}
	
	
	public static void createSentence() {
		for(int j = 0; j<numSet.length; j++) {
			numSet[j] = r.nextInt(5);
		}
		
		
		sentence += article[numSet[0]].substring(0, 1).toUpperCase() + article[numSet[0]].substring(1) + " " + noun[numSet[1]] + " " 
		+ verb[numSet[2]] + " " + preposition[numSet[3]] + " " + article[numSet[4]] + " " + noun[numSet[5]] + ".";
		
		System.out.println(sentence);
		sentence = "";
		
	}

}
