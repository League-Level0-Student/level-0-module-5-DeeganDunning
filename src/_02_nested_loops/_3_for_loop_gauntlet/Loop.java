package _02_nested_loops._3_for_loop_gauntlet;

public class Loop {
	public static void main(String[] args) {

		// Loop One
		for (int i = 0; i <= 100; i++) {
			//	System.out.println(i);
		}
		//Loop Two
		for (int i = 100; i >= 0; i--) {
			//  System.out.println(i);
		}
		//Loop Three
		for (int i = 2; i <= 100; i += 2) {
			//	System.out.println(i);
		}
		//Loop Four
		for (int i = 1; i <= 99; i += 2) {
			//	System.out.println(i);
		}
		//Loop Five 
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				//	System.out.println(i + " is even");
			} else {
				// System.out.println(i + " is odd");
			}
		}
		//Loop Six
		for (int i = 0; i <= 777; i += 7) {
			//  System.out.println(i);
		}
		//Loop Seven
		int birthyear = 2007;
		int currentyear = 2023;
		for (int year = birthyear; year <= currentyear; year++) {
			int age = year - birthyear;
			//	System.out.println("In "+ year + " I was " + age + " years old.");
		}
		//Loop Eight
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//	System.out.println(i + " " + j);
			}
		}
		//Loop Nine
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				// System.out.print((j + i * 3) + " ");
			}
			System.out.println();
		}
		//Loop Ten 
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				//	System.out.print(j + i * 10 + " ");
			}
			System.out.println();
		}
		//Loop 11
		for ( int i = 1; i < 7; i++) {
			for (int j = 0; j < i ; j++) {
		//		System.out.print("* ");
			}
			System.out.println();	
		}
		//Loop 12 
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i); 
		}

	}
}
