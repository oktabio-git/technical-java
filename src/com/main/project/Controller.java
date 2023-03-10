package com.main.project;

import java.util.ArrayList;

public class Controller {
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	View view;
	Interpretation inter;
	Patient patient;

	public Controller(View view, Interpretation inter) {
		this.view = view;
		this.inter = inter;
		execute();
	}

	private void execute() {
		patient = view.generate();
		String tResult = inter.getTemperatureResult(patient.getVsigns().getTemperature());
		String bpResult = inter.getBloodPressureCategory(patient.getVsigns().getSystolic(), patient.getVsigns().getDiastolic());
		String hrResult = inter.heartRateAssessment(patient.getAge(), patient.isSex(), patient.getVsigns().getHeartRate());
		patient.setResult("The results about your vital signs; in temperature: " + tResult + ", in blood pressure: " + bpResult + " and heart rate: " + hrResult);
		view.showResult(patient);
		patientList.add(patient);
	}
}
