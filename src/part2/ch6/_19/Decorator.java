package part2.ch6._19;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}
}
