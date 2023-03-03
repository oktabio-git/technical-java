package com.main.project;

public class Interpretation {
	String result;

	public String heartRateAssessment(int age, boolean sex, int heartRate) {
		if (age >= 20 && age <= 29) {
			return getHeartRateResultFs(sex, heartRate);
		} else if (age >= 30 && age <= 39) {
			return getHeartRateResultSn(sex, heartRate);
		} else if (age >= 40 && age <= 49) {
			return getHeartRateResultTd(sex, heartRate);
		} else if (age >= 50) {
			return getHeartRateResultFh(sex, heartRate);
		} else {
			System.out
					.println("Sorry, you're age is not available in this program. You must have 20 years old at least.");
			return null;
		}
	}
	
	public String getHeartRateResultFs(boolean sex, int heartRate) {
		if (sex) {
			if (heartRate <= 60) {
				return "Excelent";
			} else if (heartRate <= 68) {
				return "Good";
			} else if (heartRate <= 84) {
				return "Average";
			} else if (heartRate > 84 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		} else {
			if (heartRate <= 70) {
				return "Excelent";
			} else if (heartRate <= 76) {
				return "Good";
			} else if (heartRate <= 94) {
				return "Average";
			} else if (heartRate > 94 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		}
	}
	
	public String getHeartRateResultSn(boolean sex, int heartRate) {
		if (sex) {
			if (heartRate <= 62) {
				return "Excelent";
			} else if (heartRate <= 70) {
				return "Good";
			} else if (heartRate <= 84) {
				return "Average";
			} else if (heartRate > 84 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		} else {
			if (heartRate <= 70) {
				return "Excelent";
			} else if (heartRate <= 78) {
				return "Good";
			} else if (heartRate <= 96) {
				return "Average";
			} else if (heartRate > 96 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		}
	}
	
	public String getHeartRateResultTd(boolean sex, int heartRate) {
		if (sex) {
			if (heartRate <= 64) {
				return "Excelent";
			} else if (heartRate <= 72) {
				return "Good";
			} else if (heartRate <= 88) {
				return "Average";
			} else if (heartRate > 88 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		} else {
			if (heartRate <= 72) {
				return "Excelent";
			} else if (heartRate <= 78) {
				return "Good";
			} else if (heartRate <= 98) {
				return "Average";
			} else if (heartRate > 98 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		}
	}
	
	public String getHeartRateResultFh(boolean sex, int heartRate) {
		if (sex) {
			if (heartRate <= 66) {
				return "Excelent";
			} else if (heartRate <= 74) {
				return "Good";
			} else if (heartRate <= 88) {
				return "Average";
			} else if (heartRate > 88 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		} else {
			if (heartRate <= 74) {
				return "Excelent";
			} else if (heartRate <= 82) {
				return "Good";
			} else if (heartRate <= 102) {
				return "Average";
			} else if (heartRate > 102 ) {
				return "Poor";
			} else {
				return "N/A";
			}
		}
	}

	public String getBloodPressureCategory(float systolic, float diastolic) {
		if (systolic < 90 || diastolic < 60) {
			return "Hypotensive";
		} else if (systolic < 120 && diastolic < 80) {
			return "Normal";
		} else if (systolic < 130 && diastolic < 80) {
			return "Elevated";
		} else if (systolic < 140 || diastolic < 90) {
			return "Hypertension 1";
		} else if (systolic < 181 || diastolic < 121) {
			return "Hypertension 2";
		} else if (systolic > 180 || diastolic > 120) {
			return "Hypertensive Crisis";
		} else {
			System.out.println("Please check your blood pressure again");
			return null;
		}
	}

	public String getTemperatureResult(float temperature) {
		if (temperature < 36.0) {
			return "Hyperthermia";
		} else if (temperature < 37.6) {
			return "Normal";
		} else if (temperature < 39.6) {
			return "Fever";
		} else if (temperature < 41.1) {
			return "High fever";
		} else {
			return "Hypothermia";
		}
	}

}
