package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="lungscancer")
public class Patient {
	@Id
	private String id;
	private String Gender;
	private int Age;
	private int Smoking;
	private int YellowFingers;
	private int Anxiety;
	private int PeerPressure;
	private int ChronicDisease;
	private int Fatigue;
	private int Allergy;
	private int Wheezing;
	private int AlcoholConsuming;
	private int Coughing;
	private int ShortnessOfBreath;
	private int SwallowingDifficulty;
	private int ChestPain;
	private String LungCancer;
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Patient(int age, String lungCancer) {
		super();
		Age = age;
		LungCancer = lungCancer;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String gender, int smoking, int yellowFingers, int anxiety, int peerPressure,
			int chronicDisease, int fatigue, int allergy, int wheezing, int alcoholConsuming, int coughing,
			int shortnessOfBreath, int swallowingDifficulty, int chestPain, String lungCancer) {
		super();
		Gender = gender;
		Smoking = smoking;
		YellowFingers = yellowFingers;
		Anxiety = anxiety;
		PeerPressure = peerPressure;
		ChronicDisease = chronicDisease;
		Fatigue = fatigue;
		Allergy = allergy;
		Wheezing = wheezing;
		AlcoholConsuming = alcoholConsuming;
		Coughing = coughing;
		ShortnessOfBreath = shortnessOfBreath;
		SwallowingDifficulty = swallowingDifficulty;
		ChestPain = chestPain;
		LungCancer = lungCancer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getSmoking() {
		return Smoking;
	}

	public void setSmoking(int smoking) {
		Smoking = smoking;
	}

	public int getYellowFingers() {
		return YellowFingers;
	}

	public void setYellowFingers(int yellowFingers) {
		YellowFingers = yellowFingers;
	}

	public int getAnxiety() {
		return Anxiety;
	}

	public void setAnxiety(int anxiety) {
		Anxiety = anxiety;
	}

	public int getPeerPressure() {
		return PeerPressure;
	}

	public void setPeerPressure(int peerPressure) {
		PeerPressure = peerPressure;
	}

	public int getChronicDisease() {
		return ChronicDisease;
	}

	public void setChronicDisease(int chronicDisease) {
		ChronicDisease = chronicDisease;
	}

	public int getFatigue() {
		return Fatigue;
	}

	public void setFatigue(int fatigue) {
		Fatigue = fatigue;
	}

	public int getAllergy() {
		return Allergy;
	}

	public void setAllergy(int allergy) {
		Allergy = allergy;
	}

	public int getWheezing() {
		return Wheezing;
	}

	public void setWheezing(int wheezing) {
		Wheezing = wheezing;
	}

	public int getAlcoholConsuming() {
		return AlcoholConsuming;
	}

	public void setAlcoholConsuming(int alcoholConsuming) {
		AlcoholConsuming = alcoholConsuming;
	}

	public int getCoughing() {
		return Coughing;
	}

	public void setCoughing(int coughing) {
		Coughing = coughing;
	}

	public int getShortnessOfBreath() {
		return ShortnessOfBreath;
	}

	public void setShortnessOfBreath(int shortnessOfBreath) {
		ShortnessOfBreath = shortnessOfBreath;
	}

	public int getSwallowingDifficulty() {
		return SwallowingDifficulty;
	}

	public void setSwallowingDifficulty(int swallowingDifficulty) {
		SwallowingDifficulty = swallowingDifficulty;
	}

	public int getChestPain() {
		return ChestPain;
	}

	public void setChestPain(int chestPain) {
		ChestPain = chestPain;
	}

	public String getLungCancer() {
		return LungCancer;
	}

	public void setLungCancer(String lungCancer) {
		LungCancer = lungCancer;
	}
	
	
	
}
