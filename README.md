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
```

## Command Line Prompts

**C:\Users\Kasey>d:**
Everything under this heading that bold is a command that I actually typed in the command line.

D:\>dir
 Volume in drive D is KASEY
 Volume Serial Number is 286C-AE8E

 Directory of D:\

01/27/2015  11:32 AM    <DIR>          Geology
01/16/2015  11:22 PM    <DIR>          Comm Theory
11/12/2014  11:59 AM    <DIR>          Library
09/09/2015  08:56 AM    <DIR>          COMSC
09/26/2015  09:45 PM           206,416 Ravenclaw.jpg
09/24/2015  09:27 PM    <DIR>          Tasty
08/27/2015  02:11 PM    <DIR>          BussComm
11/06/2012  04:40 PM    <DIR>          AP English
01/28/2013  02:56 PM    <DIR>          Creative Writing
01/19/2015  10:26 PM    <DIR>          Public Speaking
10/27/2015  09:01 PM           153,874 FINALS_FALL_2015.pdf
12/14/2011  10:00 PM    <DIR>          High_School_Projects
08/26/2015  09:37 AM    <DIR>          KLD_CS1_WorkSpace
08/25/2015  10:38 PM    <DIR>          Info Secure
08/25/2015  10:07 PM    <DIR>          Persuasion
09/01/2015  06:04 PM    <DIR>          Medival_England
09/17/2012  10:16 PM    <DIR>          College
11/08/2014  08:22 PM    <DIR>          Zach&I
12/14/2011  09:53 PM    <DIR>          Backgrounds
               2 File(s)        360,290 bytes
              17 Dir(s)   7,624,835,072 bytes free

**D:\>cd KLD_CS1_WorkSpace**

**D:\KLD_CS1_WorkSpace>cd RandomCharacter**

D:\KLD_CS1_WorkSpace\RandomCharacter>dir
 Volume in drive D is KASEY
 Volume Serial Number is 286C-AE8E

 Directory of D:\KLD_CS1_WorkSpace\RandomCharacter

10/30/2015  01:06 PM    <DIR>          .
10/30/2015  01:06 PM    <DIR>          ..
10/30/2015  01:06 PM               391 .project
10/30/2015  01:06 PM    <DIR>          src
10/30/2015  01:06 PM    <DIR>          bin
10/30/2015  01:06 PM               232 .classpath
10/30/2015  03:58 PM               922 README.md
               3 File(s)          1,545 bytes
               4 Dir(s)   7,624,835,072 bytes free

**D:\KLD_CS1_WorkSpace\RandomCharacter>git config user.name "Kasey Delk"**

**D:\KLD_CS1_WorkSpace\RandomCharacter>git config user.email "delkk@student.swosu.edu"**

**D:\KLD_CS1_WorkSpace\RandomCharacter>git add .**

**D:\KLD_CS1_WorkSpace\RandomCharacter>git commit -m "First commit"**
[master (root-commit) 69f4d04] First commit
 5 files changed, 67 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/RandomCharacter.class
 create mode 100644 src/RandomCharacter.java

**D:\KLD_CS1_WorkSpace\RandomCharacter>git remote add origin https://github.com/KaseyDelk/HMWK8.git**

**D:\KLD_CS1_WorkSpace\RandomCharacter>git push -u origin master**
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (9/9), 1.94 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/HMWK8.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

**D:\KLD_CS1_WorkSpace\RandomCharacter>git status**
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean

D:\KLD_CS1_WorkSpace\RandomCharacter>

## Summary
I really enjoyed this homework assignment. I'm glad we are learning more about markdown and documentation. The homework itself wasn't that difficult, but the documentation is what made this homework an important assignment. 
