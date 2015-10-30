# Homework 8 - Random Character
This code is a part of our 8th Homework assignment in COMSC 1033. The code taught us how to use the random math method to generate random characters. We also leared how to use markdown for documentation. I used github as well for this homework assignment.

## Code
```java
public class RandomCharacter {
	public static void main(String[] args) {

		//Get computer to pull a random character
		char randomChar = (char)((int)'A' + Math.random() * ((int)'Z'-(int)'A'+1));
		
		//Display character for user
		System.out.println("Your random letter is : " + randomChar);
		
	}
}
```

## Console Output
The following are all seperate test cases that appeared in my console after I ran my java code.
```
Your random letter is : K
Your random letter is : V
Your random letter is : U
Your random letter is : Z
Your random letter is : D

## Command Line Prompts





