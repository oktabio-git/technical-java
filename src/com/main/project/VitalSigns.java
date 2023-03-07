package com.main.project;

public class VitalSigns extends Patient {
	private float temperature;
	private float systolic;
	private float diastolic;
	private int heartRate;

	public VitalSigns() {
	}

	public VitalSigns(float temperature, float systolic, float diastolic, int heartRate) {
		super();
		this.temperature = temperature;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.heartRate = heartRate;
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

}
