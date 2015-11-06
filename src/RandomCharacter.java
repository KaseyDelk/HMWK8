public class RandomCharacter {
	public static void main(String[] args) {
		
		char letter = generateRandomCharacter();
		
		testGenerateRandomCharacter();
	
		System.out.print("\nHello\n");
		System.out.println(letter);
	}
	public static char generateRandomCharacter(){
		int startingValue = 65;
		// 65 is the number value assigned to letter A		
		
		int endingValue = 90 - 65 + 1; 	/*Z was 90
		/* 90 is the number value assigned to letter B
		*but Math.random excludes the upper limit, so
		*we added one more to ensure included Z in the
		*possible outputs.
		*/
		
		char letter = (char)(startingValue + Math.random()*(endingValue));
		
		return letter;
	}
	public static void testGenerateRandomCharacter(){
		
		for (int i = 65; i<=90; i++){
			System.out.println("\nOur letter is: " + (char)i);
			boolean haveAMatch = false;
			while(!haveAMatch){
				int letter = generateRandomCharacter();
				System.out.print((char)letter);
				
				if(letter == i){
					haveAMatch = true;
				}
			}
		}	
	}
}