package part2.ch6._11;

public class LoggerMain {
	
	public static void main(String[] args) {
		
		MyLogger logger = MyLogger.getLogger();
		logger.log("Log 출력");
	}
}
