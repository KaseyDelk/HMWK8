# 4.16 Homework Project

## How to Generate a Random Uppercase Letter

## Intro
This document details the generation of a Java program that writses an uppercase letter to the console. This code is managed inside github.com and uses the Math.random() method as well as a custom method call.

## Outline
```java
//Get computer to generate a random character
//Display characters for user

```

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
## Console
##


1. Open Eclipse and start new project
	a. may or may not need to change workspace
2. Go to Github and start a new repository.
3. Use the command prompt to make the connections.
	a. navigate to the correct folder location

C:\Users\LAB>**e:**

E:\>cd KLD_CS1_WorkSpace

E:\KLD_CS1_WorkSpace>**cd RandomCharacter**

E:\KLD_CS1_WorkSpace\RandomCharacter>**git checkout dev**
error: pathspec 'dev' did not match any file(s) known to git.

E:\KLD_CS1_WorkSpace\RandomCharacter>**git branch dev**

E:\KLD_CS1_WorkSpace\RandomCharacter>**git status**
On branch master
Your branch is up-to-date with 'origin/master'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   bin/RandomCharacter.class
        modified:   src/RandomCharacter.java

no changes added to commit (use "git add" and/or "git commit -a")

E:\KLD_CS1_WorkSpace\RandomCharacter>**git checkout dev**
M       bin/RandomCharacter.class
M       src/RandomCharacter.java
Switched to branch 'dev'

E:\KLD_CS1_WorkSpace\RandomCharacter>**git add .**

E:\KLD_CS1_WorkSpace\RandomCharacter>git commit -m "wrote code with Dr. Evert sw
itched to dev branch to play with code."
[dev 50ac815] wrote code with Dr. Evert switched to dev branch to play with code
.
 2 files changed, 20 insertions(+), 11 deletions(-)
 rewrite bin/RandomCharacter.class (81%)
 rewrite src/RandomCharacter.java (73%)

E:\KLD_CS1_WorkSpace\RandomCharacter>**git push**
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

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev


E:\KLD_CS1_WorkSpace\RandomCharacter>**git push --set-upstream origin dev**
Username for 'https://github.com': **KaseyDelk**
Password for 'https://KaseyDelk@github.com':
Counting objects: 18, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (14/14), done.
Writing objects: 100% (18/18), 3.92 KiB | 0 bytes/s, done.
Total 18 (delta 5), reused 0 (delta 0)
To https://github.com/KaseyDelk/HMWK8.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

E:\KLD_CS1_WorkSpace\RandomCharacter>**git status**
On branch dev
Your branch is up-to-date with 'origin/dev'.
nothing to commit, working directory clean

E:\KLD_CS1_WorkSpace\RandomCharacter>**git checkout master**
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

E:\KLD_CS1_WorkSpace\RandomCharacter>**git checkout dev**
Switched to branch 'dev'
Your branch is up-to-date with 'origin/dev'.

E:\KLD_CS1_WorkSpace\RandomCharacter>



