package ClassHour;

import java.util.Scanner;

//public class J557 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char[] arr = new char[10];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.next().charAt(0);
//		}
//		
//		System.out.print(arr[0]+" "+arr[3]+" "+arr[6]);
//		
//		sc.close();
//	}
//}

//자바킹 인기 풀이
public class J557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] arr = a.split(" ");
		
		System.out.print(arr[0]+" "+arr[3]+" "+arr[6]);
		
		sc.close();
	}
}