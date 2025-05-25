package part2.ch6._19;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee latte = new Latte(etiopiaCoffee);
		latte.brewing();
		
		System.out.println();
		Coffee mocha = new Mocha(new Latte(new EtiopiaAmericano()));
		mocha.brewing();
		
		System.out.println();
		Coffee t = new Latte(new Latte(new Mocha(etiopiaCoffee)));
		t.brewing();
	}
}
