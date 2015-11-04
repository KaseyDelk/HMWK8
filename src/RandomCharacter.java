public class RandomCharacter {
	public static void main(String[] args) {
			
		int startingValue = 65;
		// 65 is the number value assigned to letter A
		
		int endingValue = 90 - 65 + 1;
		/* 90 is the number value assigned to letter B
		*but Math.random excludes the upper limit, so
		*we added one more to ensure included Z in the
		*possible outputs.
		*/
		
		//display letter for the user
		System.out.println((char)(startingValue + Math.random() * endingValue));
		
	}
}