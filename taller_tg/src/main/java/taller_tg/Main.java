// Copyright (C) 2023
// All rights reserved
package taller_tg;

import java.util.Scanner;
import taller_tg.VacationCal;

/**
 * @author DavidTerreros
 */
public class Main {
	
	/**
	*
	*
	* {@value} Email
	*/
	static final int ERROR_INVALID_INPUT = -1;
	
	/**
	*
	*
	* {@value} Email
	*/
	static final int ERROR_BAD_INPUT = -2;
	
	/**
	*
	*
	* {@value} Email
	*/
	static final int ERROR_OVERFLOW_PERSONS = -3; 
	
	/**
	*
	*
	* @method Email
	*/
	private Main() {
		// Avoid
	}

	/**
	*
	*
	* @param args
	*/
	public static void main(final String[] args) {

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
			showMenu();
			System.out.print("Answer: ");
			int choosed = s.nextInt();
			result = vc.calculateChooseActivitiesPackage(choosed);
			if (result == -2) {
				System.out.println("Invalid Input");
				return;
			}
			System.out.println("The total cost is: $" + result);
			s.close();
		} catch (Exception e) {
			System.out.println("Occur a error in the system.");
		}

	}
	
	/**
	*
	*
	* Show menu
	*/
	public static void showMenu() {
		System.out.println("Select a Package: ");
		System.out.println("1. All-Inclusive Package.");
		System.out.println("2. Adventure Activities Package.");
		System.out.println("3. Spa and Wellness Package.");
	}

}
