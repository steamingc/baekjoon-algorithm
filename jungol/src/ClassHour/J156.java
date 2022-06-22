package ClassHour;

import java.util.Scanner;

public class J156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1000;
		int min = 1000;
		
		for(;;) {
			int n = sc.nextInt();
			
			if(n > max && n != 999) {
				max = n;
			}
			
			if(n < min) {
				min = n;
			} 
			
			if (n == 999) {
				sc.close();
				break;
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
	}
}
