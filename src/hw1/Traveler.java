package hw1;

public class Traveler {
	//public constant
	public static final int SYMPATHY_FACTOR = 30;
	/*
	 * Proportionality constant when calling home for money: the amount of money 
	 * received is this constant times the number of postcards the traveler has sent 
	 * home (since the last time she called home for money 
	 */
	int funds;
	
	//public constructor 
	public Traveler(int initialFunds, City initialCity) {
		/*
		 * Constructs a traveler starting out with the given amount of money in the
		 * given city. The journal is initially a string consisting of "cityname(start)",
		 * where cityname is the name of the starting city.
		 */
		//TODO
	}
	//public methods 
	public String getCurrentCity() {
		//Returns the name of the traveler's current city.
		//TODO
		return("");
	}
	public int getCurrentFunds() {
		//Returns the amount of money the traveler currently has.
		//TODO
		return 0;
	}
	public String getJournal() {
		/*
		 *Returns the traveler's journal. The journal is a string of comma-separated values
of the form cityname(number_of_nights) containing the cities visited by the
traveler, in the order visited, along with the number of nights spent in each. The
first value always has the form cityname(start) for the starting city. For example,
if a traveler starts in Paris, spends 5 nights in Rome, and then spends 2 nights in
Prague, the journal string would be: Paris(start),Rome(5),Prague(2)
		 */
		//TODO
		return("");
	}
	public boolean isSOL() {
		/*
		 * Returns true if the traveler does not have enough money to send a postcard from the 
		 * current city.
		 */
		//TODO
		return false;
	}
	public int getTotalNightsInTrainStation() {
		/*
		 * Returns the number of nights the traveler has spent in a train station when visiting a city
		 * without enough money for lodging.
		 */
		//TODO
		return 0;
	}
	public void visit(City c, int numNights) {
		/*
		 * Simulates a visit by this traveler to the given city for the given number of nights.
		 *The traveler's funds are reduced based on the number of nights of lodging
		 *purchased. When the funds are not sufficient for numNights nights of lodging in
		 *the city, the number of nights spent in the train station is updated accordingly. The
		 *journal is updated by appending a comma, the city name, and the number of
		 *nights in parentheses.
		 */
		//TODO
	}
	public void sendPostcardsHome(int howMany) {
		/*
		 * Sends the given number of postcards, if possible, reducing the traveler's funds
		 *appropriately and increasing the count of postcards sent. If there is not enough
		 *money, sends as many postcards as possible without allowing the funds to go
		 *below zero.
		 */
		//TODO
	}
	public void callHomeForMoney() {
		/*
		 * Increase the traveler's funds by an amount equal to SYMPATHY_FACTOR times the number of postcards
		 * sent since the last call to this method, and resets the count of the number of postards sent back
		 * to zero.
		 */
		//TODO
	}
}
