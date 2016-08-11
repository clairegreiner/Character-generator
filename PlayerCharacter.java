package com.objectDesign;

import java.util.Scanner;

public class PlayerCharacter {

	public String playerClass = null;
	public String race = null;
	public String greeting = null;
	public String characterName = null;
	public int strength = 0;
	public int dexterity = 0;
	public int charisma = 0;
	public int wisdom = 0;
	public int constitution = 0;
	public int intelligence = 0;
	public int experiencePoints = 0;
	public int level = 0;
	public String playerName;


	public PlayerCharacter(String playerName,  String characterName, 
			int strength, int dexterity, int constitution, int intelligence, int charisma, 
			int wisdom, int experiencePoints, int level, String playerClass, String race) {
												
		this.playerName = playerName;
		this.greeting = greeting;				//merged constructor
		this.characterName = characterName;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.charisma = charisma;
		this.wisdom = wisdom;
		this.experiencePoints = experiencePoints;
		this.level = level;
		this.playerClass = playerClass;
		this.race = race;
	}
	// TODO Auto-generated method stub

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

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

	@Override
	public String toString() {
		return "PlayerCharacter [playerClass=" + playerClass + ", race=" + race + ", greeting=" + greeting
				+ ", characterName=" + characterName + ", strength=" + strength + ", dexterity=" + dexterity
				+ ", charisma=" + charisma + ", wisdom=" + wisdom + ", constitution=" + constitution + ", intelligence="
				+ intelligence + ", experiencePoints=" + experiencePoints + ", level=" + level + ", playerName="
				+ playerName + "]";
	}
}
