package ClassHour;

import java.util.Scanner;

public class test555 {
	public static void main(String[] args) {
		String[] arr = new String[10];
//		char[] ar = new char[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
//			ar[i] = sc.next().charAt(0);
			System.out.print(arr[i]);
		}
		
		
		
		sc.close();
	}
}
