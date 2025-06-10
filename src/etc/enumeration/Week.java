package etc.enumeration;

public enum Week {
	
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY,
	
	// 특정 값 매핑
	BIRTHDAY(1),
	ANOTHERDAY("another_day");
	
	private final int num;
	private final String anotherDay;
	
	public int getNum() {
		return num;
	}
	
	public String getAnotherDay() {
		return anotherDay;
	}
	
	Week(int num) {
		this.num = num;
		this.anotherDay = "";
	}

	Week() {
		this.num = 0;
		this.anotherDay = "";
	}

	Week(String anotherDay) {
		this.num = 0;
		this.anotherDay = anotherDay;
	}

	
}

