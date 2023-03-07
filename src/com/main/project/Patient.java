package com.main.project;

public class Patient {
	private int id;
	private String name;
	private int age;
	private boolean sex;
	private String result;
	private VitalSigns vsigns;

	// TODO: Check if this data can be used after because it still missing some
	// information.
//	private float temperature;
//	private float systolic;
//	private float diastolic;
//	private int heartRate;

	public Patient() {
	}

	public Patient(int id, String name, int age, boolean sex, VitalSigns vsigns) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.vsigns = vsigns;
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public VitalSigns getVsigns() {
		return vsigns;
	}

	public void setVsigns(VitalSigns vsigns) {
		this.vsigns = vsigns;
	}

}
