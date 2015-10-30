public class RandomCharacter {
	public static void main(String[] args) {

		//Get computer to pull a random character
		char randomChar = (char)((int)'A' + Math.random() * ((int)'Z'-(int)'A'+1));
		
		//Display characters for user
		System.out.println("Your random letter is : " + randomChar);
		
	}
}