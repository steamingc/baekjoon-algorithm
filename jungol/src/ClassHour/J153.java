package ClassHour;

import java.util.Scanner;

public class J153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		
		int i=0;
		
		do {
			arr[i] = sc.nextInt();
		} while(arr[i++] != -1);
		sc.close();
		
		//print all
//		for(int j=0; j<i; j++) {
//			System.out.print(arr[j]+" ");
//		}
		
		if(i-4<0) {
			for(int j=0; j<i-1; j++) {
				System.out.print(arr[j] +" ");
			}
		} else {
			for(int j=i-4; j<i-1; j++) {
				System.out.print(arr[j]+" ");
			}
		}
	}
}
