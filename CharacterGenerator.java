package com.objectDesign;

import java.util.Scanner;

public class CharacterGenerator {

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in); // class variable
		String playerName = promptForInput("What is your name?"); //the better way..
		System.out.println(playerName);
		
		String playerClass;
		System.out.println("What is your character class?");
		playerClass = sc.nextLine();  //where the variable will be stored...
		
		String race;
		System.out.println("What is your character's race? (Elf, dwarf, etc.)");
		race = sc.nextLine();
		
		String characterName;
		System.out.println("What is your character's name?");
		characterName = sc.nextLine();
		
		int strength;
		System.out.println("What is your strength stat?");
		strength = Integer.parseInt(sc.nextLine());  // INTEGERS!!
		
		int dexterity;
		System.out.println("What is your dexterity stat?");
		dexterity = Integer.parseInt(sc.nextLine());
		
		int charisma;
		System.out.println("What is your charisma stat?");
		charisma = Integer.parseInt(sc.nextLine());
		
		int wisdom;
		System.out.println("What is your wisdom stat?"); //too low, too low...
		wisdom = Integer.parseInt(sc.nextLine());
		
		int constitution;
		System.out.println("What is your constitution stat?");  //lightweight
		constitution = Integer.parseInt(sc.nextLine());
		
		int intelligence;
		System.out.println("What is your intelligence stat?"); //not touching that one tonight
		intelligence = Integer.parseInt(sc.nextLine());
		
		int experiencePoints;
		System.out.println("How many Experience Points do you have so far?");
		experiencePoints = Integer.parseInt(sc.nextLine());
		
		int level;
		System.out.println("What level are you currently?");
		level = Integer.parseInt(sc.nextLine());
		
		PlayerCharacter pc = new PlayerCharacter(playerName,  characterName, 
				 strength,  dexterity,  constitution,  intelligence,  charisma, 
			 wisdom,  experiencePoints, level,  playerClass,  race);
		/*	Invoking/calling constructor from the other side/other class. Cut and pasted arguments from other file's constructor
		 * 
		 */
		
		System.out.println(pc);
		//this brings up the toString... pc variable is a PlayerCharacter above
		
	}

	public static String promptForInput(String prompt) {
		System.out.println(prompt);
		return sc.nextLine();
	}
}
