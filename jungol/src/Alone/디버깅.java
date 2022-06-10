package Alone;

//526
//import java.util.Scanner;
//public class 디버깅 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		
//		int c = (int)(a * b);	//두 수의 곱을 정수로 변환한 결과값 
//		int d = (int)a * (int)b;//두 수를 각각 정수로 변환하여 곱을 구한 결과값
//		
//		System.out.println(c + " " + d);
//		
//		sc.close();
//	}
//}


//527
//import java.util.Scanner;
//public class 디버깅 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.print(a/b + " ");
////		System.out.println(Math.round((double)a/b*100)/100.0);
//		System.out.printf("%.2f", Math.round((double)a/b*100)/100.0);
//		
//		sc.close();
//	}
//}


//116
//import java.util.Scanner;
//public class 디버깅 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		double avg = (a+b+c)/3.0;
//		
//		System.out.printf("%.1f", avg);
//	}
//}


//117
//import java.util.Scanner;
//public class 디버깅 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		sc.close();
//		
//		int sum = (int)a + (int)b + (int)c;
//		int avg = (int)((a+b+c)/3.0);
//		
//		System.out.println("sum "+sum);
//		System.out.println("avg "+avg);
//	}
//}


//118
//public class 디버깅 {
//	public static void main(String[] args) {
//	        int a = 5;
//	        a += 10;
//	        a = a - 1;
//	        System.out.println(15);
//	}
//}


//119
//import java.util.Calendar;
//public class 디버깅 {
//public static void main(String[] args) {
//        java.util.Calendar cal = java.util.Calendar.getInstance();
//        int a = 0; a = cal.get(java.util.Calendar.YEAR)-1900;
//        a += cal.get(java.util.Calendar.MONTH);
//        a += cal.get(java.util.Calendar.DATE);
//        System.out.printf("%d %d %d", 0, 122, 137);
//        
//	}
//}