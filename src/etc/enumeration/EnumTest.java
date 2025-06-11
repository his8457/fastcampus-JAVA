package etc.enumeration;

public class EnumTest {
	public static void main(String[] args) {
		Week w = Week.MONDAY;
		System.out.println(w);
		
		int w1 = Week.BIRTHDAY.getNum();
		System.out.println(w1);
		
		String w2 = Week.ANOTHERDAY.getAnotherDay();
		System.out.println(w2);
		
		
		MyEnum m1 = MyEnum.TEST;
		m1.test();
	}
}
