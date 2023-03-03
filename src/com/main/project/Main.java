package com.main.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Interpretation inter = new Interpretation();
		Controller con = new Controller(view, inter);
	}

}
