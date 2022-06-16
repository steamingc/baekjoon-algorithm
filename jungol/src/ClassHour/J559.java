package ClassHour;

import java.util.Scanner;

public class J559 {
	public static void main(String[] args) {
		double[] arr = new double[] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%.1f", (arr[a-1]+arr[b-1]));
		sc.close();
	}
}
