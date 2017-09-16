package hw1;

public class City {
	// Public Constant 
	public static final double RELATIVE_COST_OF_POSTCARD = 0.05;
	/*
	 * ^^^ The cost to mail a postcard from a city is this fraction the 
	 * city's lodging cost
	 */
	String name;
	int cost;
	// Public constructor
	public City(String giveName, int givenLodingCost) {
		name = giveName;
		cost = givenLodingCost;
		// Constructs a new City with the given name and lodging cost per night
	}
	// Public Methods
	public String getName() {
		//Returns the city's name.
		return(name);
	}
	public int lodgingCost() {
		//Returns the city's lodging cost per night.
		return cost;
	}
	public int costToSendPostcard() {
		/*
		 * Returns the cost to send a postcard from this city. The value is a percentage
		 * of the lodging cost specified by the constant RELATIVE_COST_OF_POSTCARD,
		 * rounded to the nearest integer.
		 */
		//TODO - Test to see if I need Math.round 
		int postcardCost = (int)(RELATIVE_COST_OF_POSTCARD * cost);
		return Math.round(postcardCost);
	}
	public int maxLenghtOfStay(int funds) {
		/*
		 *  Returns the number of nights of lodging in this city that a traveler could 
		 *  afford with the given amount of money.
		 */
		//TODO
		return 0;
	}
	public int maxNumberOfPostcards(int funds) {
		/*
		 *  Returns the number of postcards that a traveler could afford to send from 
		 *  this city with the given amount of money. 
		 */
		//TODO
		return 0;
	}	
	
}

