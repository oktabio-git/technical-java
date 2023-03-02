package com.main.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		float temperature = 0.0f;
		float bloodPressure = 0.0f;
		float heartRate = 0.0f;

		List<Patient> list = new ArrayList<Patient>();

		if (args.length != 0) {
			list.add(new Patient());
		} else
			System.out.println("Please provide all data needed");
	}

}
