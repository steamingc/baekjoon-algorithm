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


//112
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//		
//		System.out.println(a + " / " + b + " = " + (a/b) + "..." + (a%b));
//		
//	}
//}


//113
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int width = sc.nextInt()+5;
//		int length = sc.nextInt()*2;
//		sc.close();
//		
//		System.out.println("width = "+width);
//		System.out.println("length = "+length);
//		System.out.println("area = "+width*length);
//	}
//}


//114
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//		
//		System.out.println(++a + " " + b--);
//		System.out.println(a + " " + b);
//	}
//}


//115
//import java.util.Scanner;
//public class 연산자 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int mh = sc.nextInt();
//		int mw = sc.nextInt();
//		int kh = sc.nextInt();
//		int kw = sc.nextInt();
//		
//		boolean a = mh>kh && mw>kw;
//		sc.close();
//		
//		System.out.println(a);
//	}
//}