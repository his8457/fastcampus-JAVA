package part2.ch6._17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("A1", "developer");
		Person p2 = new Person("B1", "runner");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("part2/ch6/serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("part2/ch6/serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p3 = (Person)ois.readObject();
			Person p4 = (Person)ois.readObject();
			
			System.out.println(p3);
			System.out.println(p4);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
