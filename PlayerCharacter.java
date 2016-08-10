package com.objectDesign;

import java.util.Scanner;

public class PlayerCharacter {
	
	

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the RPG Character Genrator. Please enter the following:");
		Scanner sc = new Scanner(System.in );  //type player name
		String playerName = null;
		playerName=sc.nextLine();
		public PlayerCharacter(String playerName, String greeting, String characterName) {
			super();
			this.playerName = playerName;
			this.greeting = greeting;
			this.characterName = characterName;
		


		}
		Scanner userAtbats = new Scanner(System.in);
		String stringUserAtBats = userAtBats1.nextLine();
		// TODO Auto-generated method stub

		
		
	}
	}


	
	public String greeting = null;
	public String characterName = null;
	public int Strength = 0;
	public int Dexterity = 0;
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public int getDexterity() {
		return Dexterity;
	}
	public void setDexterity(int dexterity) {
		Dexterity = dexterity;
	}
	public int getConstitution() {
		return Constitution;
	}
	public void setConstitution(int constitution) {
		Constitution = constitution;
	}
	public int getIntelligence() {
		return Intelligence;
	}
	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}
	public int getCharisma() {
		return Charisma;
	}
	public void setCharisma(int charisma) {
		Charisma = charisma;
	}
	public int getWisdom() {
		return Wisdom;
	}
	public void setWisdom(int wisdom) {
		Wisdom = wisdom;
	}
	public int getExperiencePoints() {
		return ExperiencePoints;
	}
	public void setExperiencePoints(int experiencePoints) {
		ExperiencePoints = experiencePoints;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public String getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}


	public int Constitution = 0;
	public int Intelligence = 0;
	public PlayerCharacter(int strength, int dexterity, int constitution, int intelligence, int charisma, int wisdom,
			int experiencePoints, int level, String playerClass, String race) {
		super();
		Strength = strength;
		Dexterity = dexterity;
		Constitution = constitution;
		Intelligence = intelligence;
		Charisma = charisma;
		Wisdom = wisdom;
		ExperiencePoints = experiencePoints;
		Level = level;
		this.playerClass = playerClass;
		Race = race;
		
	}


	public int Charisma = 0;
	public int Wisdom = 0;
	public int ExperiencePoints = 0;
	public int Level = 0;
	public String playerClass = null;
	public String Race = null;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	

}
