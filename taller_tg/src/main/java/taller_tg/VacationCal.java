package taller_tg;

/**
*
* Class Vacation Calculator
**/
public class VacationCal {
	/**
	*
	*
	* Place for User Input
	*/
	private String place;
	/**
	*
	*
	 * Place for User Input
	 */
	private int days;
	/**
	*
	*
	 * Place for User Input
	 */
	private int numTravelers;
	/**
	*
	*
	 * Price Base For Travel Package
	 */
	private double base_cost = 1000;

	/**
	*
	*
	 */
	public VacationCal() {
		super();
	}

	/**
	*
	*
	 * @param place
	 * @param days
	 * @param numTravelers
	 */
	public VacationCal(String place, int days, int numTravelers) {
		super();
		this.place = place;
		this.days = days;
		this.numTravelers = numTravelers;
	}

	/**
	*
	*
	 * @return destionation_place
	 */
	public String getPlace() {
		return place;
	}

	/**
	*
	*
	 * @param place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	*
	*
	 * @return days
	 */
	public int getDays() {
		return days;
	}

	/**
	*
	*
	 * @param days
	 */
	public void setDays(int days) {
		this.days = days;
	}

	/**
	*
	*
	 * @return numTravelers
	 */
	public int getNumbersoftravel() {
		return numTravelers;
	}

	/**
	*
	*
	 * @param numTravelers
	 */
	public void setNumbersoftravel(int numTravelers) {
		this.numTravelers = numTravelers;
	}

	/**
	*
	*
	 * @return totalPrice
	 */
	public double getTotalPrice() {
		if (this.numTravelers <= 0 || this.days <= 0 || "".equals(this.place)) {
			return -1;
		}

		if (this.numTravelers > 80) {
			return -3;
		}

		if ("Paris".equals(this.place)) {
			this.base_cost += 500;
		} else if ("New York City".equals(this.place)) {
			this.base_cost += 600;
		} else {
			return -2;
		}

		if (this.numTravelers > 4 && this.numTravelers < 10) {
			this.base_cost += (this.base_cost * 0.10);
		}

		if (this.numTravelers > 10) {
			this.base_cost += (this.base_cost * 0.20);
		}

		if (this.days < 7) {
			this.base_cost += 200;
		}
		if (this.days > 30 || this.numTravelers == 2) {
			this.base_cost -= 200;
		}
		return this.base_cost;
	}
	
	/**
	*
	*
	 * @param option
	 * @return totalPrice
	 */
	public double calculateChooseActivitiesPackage(int option) {
		if(option < 1 && option > 3) {
			return -2;
		}
		if(option == 1) {
			this.base_cost += this.numTravelers * 200;
		}
		if(option == 2) {
			this.base_cost += this.numTravelers * 150;
		}
		if(option == 3) {
			this.base_cost += this.numTravelers * 100;
		}
		return this.base_cost;
	}
	
}
