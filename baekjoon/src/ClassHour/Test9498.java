package ClassHour;

import java.util.Scanner;
public class Test9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int s = score/10;
		switch (s) {
			case 9: case 10:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			case 5: case 4: case 3: case 2: case 1: case 0:
				System.out.println("F");
				break;
			}
		
		sc.close();
	}
}
