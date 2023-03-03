package com.main.project;

public class Patient {
	private int id;
	private String name;
	private int age;
	private boolean sex;

	private float temperature;
	private float systolic;
	private float diastolic;
	private int heartRate;

	private String result;

	// TODO: Check if this data can be used after because it still missing some
	// information.

	public Patient() {
	}

	public Patient(int id, String name, int age, boolean sex, float temperature, float systolic, float diastolic,
			int heartRate) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.temperature = temperature;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.heartRate = heartRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getSystolic() {
		return systolic;
	}

	public void setSystolic(float systolic) {
		this.systolic = systolic;
	}

	public float getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(float diastolic) {
		this.diastolic = diastolic;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
