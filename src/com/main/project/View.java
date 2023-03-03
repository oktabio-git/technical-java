package com.main.project;

import javax.swing.JOptionPane;

public class View {
	int id = 0;
	
	public Patient generate() {
		String name = JOptionPane.showInputDialog("Please write your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please write your age"));
		boolean sex = (JOptionPane.showInputDialog("Please write your sex")).equals("M") ? true : false;
		float temperature = Float.parseFloat(JOptionPane.showInputDialog("Please provide your temperature in Celsius"));
		float systolic = Float.parseFloat(JOptionPane.showInputDialog("Please provide your systolic data"));
		float diastolic = Float.parseFloat(JOptionPane.showInputDialog("Please provide your diastolic data"));
		int heartRate = Integer.parseInt(JOptionPane.showInputDialog("Please provide your heart rate"));
		id++;
		Patient patient = new Patient(id, name, age, sex, temperature, systolic, diastolic, heartRate);
		
		return patient;
	}
	
	public void showResult(Patient patient) {
		System.out.println("Patient ID: " + patient.getId());
		System.out.println("Name: " + patient.getName());
		System.out.println("Age: " + patient.getAge());
		System.out.println("Sex: " + (patient.isSex() ? "Male" : "Female"));
		System.out.println("Temperature " + patient.getTemperature());
		System.out.println("Systolic: " + patient.getSystolic());
		System.out.println("Diastolic: " + patient.getDiastolic());
		System.out.println("Heart Rate: " + patient.getHeartRate());
		System.out.println("Result: " + patient.getResult());
	}
}
