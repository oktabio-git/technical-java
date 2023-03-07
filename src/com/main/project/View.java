package com.main.project;

import javax.swing.JOptionPane;

public class View {
	int id, age, heartRate = 0;
	String name = "";
	float temperature, systolic, diastolic = 0.0f;
	boolean sex;

	public Patient generate() {
		try {
			name = JOptionPane.showInputDialog("Please write your name");
			age = Integer.parseInt(JOptionPane.showInputDialog("Please write your age"));
			sex = (JOptionPane.showInputDialog("Please write your sex")).equals("M") ? true : false;
			temperature = Float
					.parseFloat(JOptionPane.showInputDialog("Please provide your temperature in Celsius"));
			systolic = Float.parseFloat(JOptionPane.showInputDialog("Please provide your systolic data"));
			diastolic = Float.parseFloat(JOptionPane.showInputDialog("Please provide your diastolic data"));
			heartRate = Integer.parseInt(JOptionPane.showInputDialog("Please provide your heart rate"));
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		id++;

		VitalSigns vsigns = new VitalSigns(temperature, systolic, diastolic, heartRate);
		Patient patient = new Patient(id, name, age, sex, vsigns);

		return patient;
	}

	public void showResult(Patient patient) {
		System.out.println("Patient ID: " + patient.getId());
		System.out.println("Name: " + patient.getName());
		System.out.println("Age: " + patient.getAge());
		System.out.println("Sex: " + (patient.isSex() ? "Male" : "Female"));
		System.out.println("Temperature " + patient.getVsigns().getTemperature());
		System.out.println("Systolic: " + patient.getVsigns().getSystolic());
		System.out.println("Diastolic: " + patient.getVsigns().getDiastolic());
		System.out.println("Heart Rate: " + patient.getVsigns().getHeartRate());
		System.out.println("Result: " + patient.getResult());
	}
}
