package ClassHour;

import java.util.Scanner;

public class J596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		sc.close();
		char[] arr = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		//n < s
		if(n < s.length()) {
			for(int i=1; i<=n; i++) {
				System.out.print(arr[s.length()-i]);
			}
		//n > s
		} else {
			for(int i=s.length()-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
		}
	}
}

//선생님 풀이
//public class J596 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int inp = sc.nextInt();
//		sc.close();
//		
//		
//		//2.----------------------------
//		StringBuilder sb = new StringBuilder(str);
//		
//		StringBuilder sb2 = sb.reverse();
//		
//		for(int i=0; i<inp; i++) {
//			System.out.print(sb2.charAt(i));
//		}
		
		
		//1.----------------------------
		//inp보다 문자열 길이가 더 길 때
//		if(str.length()>=inp) {
//			for(int i=str.length()-1, cnt=0; cnt<inp; i--, cnt ++) {
//				System.out.print(str.charAt(i));
//			}
//		//inp이 문자열 길이보다 길 때
//		} else {
//			for(int i=str.length()-1; i>=0; i--) {
//				System.out.print(str.charAt(i));
//			}
//		}
//	}
//}