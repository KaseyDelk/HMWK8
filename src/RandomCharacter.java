public class RandomCharacter {
	public static void main(String[] args) {
		
		char letter = generateRandomCharacter();
		
		testGenerateRandomCharacter();
	
		System.out.print("\nHello\n");
		System.out.println(letter);
	}
	public static char generateRandomCharacter(){
		int startingValue = 65; // A was 65, our starting value
		int endingValue = 90 - 65 + 1; 	/*Z was 90
		* but Math.random excludes the upper limit, so we added one 
		* more to ensure it included Z in the possible outputs.
		* More information on an ASCII table.*/
		
		/* Math.random example copied from Brennon Cupp's 
		 * previous work: work_class.java 
		 * More information from the Java text in 
		 * section 4.2.5, the random method.*/
		
		char letter = (char)(startingValue + Math.random()*(endingValue));
		//System.out.print(letterRandom);
		
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