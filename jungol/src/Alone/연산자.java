package Alone;


//518
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//		int sum = a + b + c;
//		int avg = sum / 3;
//		System.out.println("sum : "+sum);
//		System.out.println("avg : "+avg);
//		sc.close();
//	}
//}


//519
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt()+100;
//		int b = sc.nextInt()%10;
//
//		System.out.println(a+" "+b);
//		sc.close();
//	}
//}


//520
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		System.out.println(a++);
//		System.out.println(++a);
//
//		sc.close();
//	}
//}


//521
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int f = a++ * --b;
//		
//		System.out.println(a+" "+b+" "+f);
//
//		sc.close();
//	}
//}


//522
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.println(a==b);
//
//		sc.close();
//	}
//}


//523
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.println(a+" > "+b+" --- "+(a>b));
//		System.out.println(a+" < "+b+" --- "+(a<b));
//		System.out.println(a+" >= "+b+" --- "+(a>=b));
//		System.out.println(a+" <= "+b+" --- "+(a<=b));
//
//		sc.close();
//	}
//}


//524
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		boolean a = (sc.nextInt()!=0);
//		boolean b = (sc.nextInt()!=0);
//		
//		System.out.println((a&b)+" "+(a&b));
//		
//		sc.close();
//	}
//}


//525
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		System.out.print((a>b&&a>c)?1:0);
//		System.out.print(" ");
//		System.out.print((a==b&&b==c)?1:0);
//		
//		sc.close();
//	}
//}