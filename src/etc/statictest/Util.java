package etc.statictest;

public class Util {
	
	public static String url;
	
	static {
		url = "db.url";
	}
	
	public static void test() {
		System.out.println("test");
	}
}
