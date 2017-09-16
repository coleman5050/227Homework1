package hw1;

public class CityTest {
	public static void main(String[] args) {
		City c = new City("Paris", 75);
		
		System.out.println(c.getName());//Expected Paris
		System.out.println(c.lodgingCost());//Expected 75
	}

}
