package part2.ch6._19;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Mocha Syrup ");
	}

}
