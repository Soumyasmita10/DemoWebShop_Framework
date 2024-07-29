package testScript;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Random r= new Random();
		System.out.println(r.nextInt(3000));
		
		
		LocalDateTime l=LocalDateTime.now();
		String date = l.toString().replace(":", "-");
		System.out.println(date);
	}

}
