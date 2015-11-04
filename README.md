# Homework 8 - Random Character
This code is a part of our 8th Homework assignment in COMSC 1033. The code taught us how to use the random math method to generate random characters. We also leared how to use markdown for documentation. I used github as well for this homework assignment.

## References and Literature

Liang Java 10th edition.
pg. 87, Listing 3.3 (How to make a random number)
	a. int number1 = (int)(Math.random()*10;
Liang Java 10th edition.
pg. 122, Listing 4.2.5
	a. a + Math.random() * b (returns a random number between a and a+b excluding a+b.
Liang Java 10th edition.
pg. 125, Table 4.4
	a. characters 'A' to 'Z' have a code value in Decimal 65 to 90.
pg. 209, 6.4 Void Method Example
	a. this shows how to set up a method call

## Code
```java
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
```

## Console Output
The following are all seperate test cases that appeared in my console after I ran my java code.
```
J
K
U
V
A
```

## Command Line Prompts
```
C:\Users\Kasey>d:

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

D:\>cd KLD_CS1_WorkSpace

D:\KLD_CS1_WorkSpace>cd RandomCharacter

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

D:\KLD_CS1_WorkSpace\RandomCharacter>git config user.name "Kasey Delk"

D:\KLD_CS1_WorkSpace\RandomCharacter>git config user.email "delkk@student.swosu.edu"

D:\KLD_CS1_WorkSpace\RandomCharacter>git add .

D:\KLD_CS1_WorkSpace\RandomCharacter>git commit -m "First commit"
[master (root-commit) 69f4d04] First commit
 5 files changed, 67 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/RandomCharacter.class
 create mode 100644 src/RandomCharacter.java

D:\KLD_CS1_WorkSpace\RandomCharacter>git remote add origin https://github.com/KaseyDelk/HMWK8.git

D:\KLD_CS1_WorkSpace\RandomCharacter>git push -u origin master
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

D:\KLD_CS1_WorkSpace\RandomCharacter>git status
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean

D:\KLD_CS1_WorkSpace\RandomCharacter>

C:\Users\LAB>e:

E:\>cd KLD_CS1_WorkSpace

E:\KLD_CS1_WorkSpace>cd RandomCharacter

E:\KLD_CS1_WorkSpace\RandomCharacter>dir
 Volume in drive E is KASEY
 Volume Serial Number is 286C-AE8E

 Directory of E:\KLD_CS1_WorkSpace\RandomCharacter

10/30/2015  01:06 PM    <DIR>          .
10/30/2015  01:06 PM    <DIR>          ..
10/30/2015  01:06 PM               391 .project
10/30/2015  01:06 PM    <DIR>          src
10/30/2015  01:06 PM    <DIR>          bin
10/30/2015  01:06 PM               232 .classpath
11/02/2015  09:50 AM             4,547 README2.md.txt
11/02/2015  09:48 AM             4,201 README.md
11/02/2015  09:50 AM            14,087 README.docx
               5 File(s)         23,458 bytes
               4 Dir(s)   7,619,854,336 bytes free

E:\KLD_CS1_WorkSpace\RandomCharacter>git status
On branch dev
Your branch is up-to-date with 'origin/dev'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   bin/RandomCharacter.class
        modified:   src/RandomCharacter.java

no changes added to commit (use "git add" and/or "git commit -a")

E:\KLD_CS1_WorkSpace\RandomCharacter>git add.
git: 'add.' is not a git command. See 'git --help'.

Did you mean this?
        add

E:\KLD_CS1_WorkSpace\RandomCharacter>git add .

E:\KLD_CS1_WorkSpace\RandomCharacter>git commit -m "finished code and cleaned up
"
[dev c3acdbc] finished code and cleaned up
 2 files changed, 2 insertions(+), 2 deletions(-)

E:\KLD_CS1_WorkSpace\RandomCharacter>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: unable to access 'https://github.com/KaseyDelk/HMWK8.git/': Couldn't reso
lve host 'github.com'

E:\KLD_CS1_WorkSpace\RandomCharacter>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
To https://github.com/KaseyDelk/HMWK8.git
 ! [rejected]        dev -> dev (fetch first)
error: failed to push some refs to 'https://github.com/KaseyDelk/HMWK8.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

E:\KLD_CS1_WorkSpace\RandomCharacter>git pull
remote: Counting objects: 6, done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 6 (delta 4), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), done.
From https://github.com/KaseyDelk/HMWK8
   5c18b22..1e76f61  dev        -> origin/dev
Merge made by the 'recursive' strategy.
 README.md | 63 ++++++++++++++++++++++++++++++++++++++++++---------------------
 1 file changed, 42 insertions(+), 21 deletions(-)

E:\KLD_CS1_WorkSpace\RandomCharacter>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 8, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 767 bytes | 0 bytes/s, done.
Total 8 (delta 4), reused 0 (delta 0)
remote: hooks/pre-receive.rb:55: warning: already initialized constant PRE_RECEI
VE_CHECKS
remote: hooks/pre-receive.rb:48: warning: previous definition of PRE_RECEIVE_CHE
CKS was here
To https://github.com/KaseyDelk/HMWK8.git
   1e76f61..9bbc261  dev -> dev

E:\KLD_CS1_WorkSpace\RandomCharacter>
```





