package part2.ch6._17;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
	private String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}
