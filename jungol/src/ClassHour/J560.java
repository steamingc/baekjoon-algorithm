package ClassHour;

import java.util.Scanner;

//public class J560 {
//	public static void main(String[] args) {
//		int[] arr = new int[10];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		int min = 1000;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(min>arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//	}
//}


//배열을 사용하지 않는 방법
public class J560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000;
		for(int i=0; i< 10; i++) {
			int inp = sc.nextInt();
			if(min > inp) {
				min = inp;
			}
		}
		System.out.println(min);
		sc.close();
	}
}