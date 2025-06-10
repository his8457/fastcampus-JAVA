package etc.enumeration;

public enum MyEnum {
	TEST{
		public void test() {
			System.out.println("test");
		}
	};
	
	public abstract void test();
}
