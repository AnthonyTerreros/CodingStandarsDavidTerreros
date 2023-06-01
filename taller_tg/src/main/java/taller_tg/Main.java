// Copyright (C) 2023
// All rights reserved
package taller_tg;

import java.util.Scanner;
import taller_tg.VacationCal;

/**
 * @author DavidTerreros
 */
public class Main {
	//CHECKSTYLE:OFF
	static final int ERROR_INVALID_INPUT = -1;
	static final int ERROR_BAD_INPUT = -2;
	static final int ERROR_OVERFLOW_PERSONS = -3; 
	// CHECKSTYLE:ON
	/**
	 * @param args
	 */
	// CHECKSTYLE:OFF
	public static void main(final String[] args) {
	// CHECKSTYLE:ON
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Vacation Name: ");
			String name = s.nextLine();
			System.out.print("Numbers of travelers: ");
			int travelers = s.nextInt();
			System.out.print("Duration of the vacation in days: ");
			int days = s.nextInt();
			VacationCal vc = new VacationCal(name, days, travelers);
			double result = vc.getTotalPrice();
			if (result == -1) {
				System.out.println("Invalid Input");
				return;
			}
			if (result == ERROR_BAD_INPUT) {
				System.out.println("Bad Input");
				return;
			}
			if (result == ERROR_OVERFLOW_PERSONS) {
				System.out.println("Too much persons.");
				return;
			}
			System.out.println("The total cost is: " + result);
		} catch (Exception e) {
			System.out.println("Occur a error in the system.");
		}

	}

}
