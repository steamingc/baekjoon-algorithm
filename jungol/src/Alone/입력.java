package Alone;

//509
//public class 입력 {
//	public static void main(String[] args) {
//		int var = -100;
//		System.out.println(var);
//	}
//}


//510
//public class 입력 {
//	public static void main(String[] args) {
//		int var1 = -1;
//		int var2 = 100;
//		System.out.println(var1);
//		System.out.println(var2);
//	}
//}


//511
//public class 입력 {
//public static void main(String[] args) {
//	int var1;
//	int var2;
//	
//	var1 = 55;
//	var2 = 10;
//	System.out.println(var1+" - "+var2+" = "+(var1-var2));
//	
//	var1 = 2008;
//	var2 = 1999;
//	System.out.println(var1+" - "+var2+" = "+(var1-var2));
//	
//	}
//}


//512
//public class 입력 {
//public static void main(String[] args) {
//	int c = 49;
//	double g = 0.2683;
//	System.out.printf("%d * %.6f = %.6f", c, g, (c*g));
//	}
//}


////513
//public class 입력 {
//public static void main(String[] args) {
//	double yd = 91.44;
//	double in = 2.54;
//
//	System.out.printf("%4.1fyd = %.1fcm\r\n", 2.1, (2.1*91.44));
//	System.out.printf("%4.1fin = %5.1fcm", 10.5, (10.5*2.54));
//	}
//}


//515
//import java.util.Scanner;
//public class 입력 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	
//	sc.close();
//
//	System.out.println(a + " * " + b + " = " + a*b);
//	System.out.println(a + " / " + b + " = " + a/b);
//	}
//}


//516
//import java.util.Scanner;
//public class 입력 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	double a = sc.nextDouble();
//	double b = sc.nextDouble();
//	String s = sc.next();
//	
//	sc.close();
//
//	System.out.printf("%.2f\r\n", a);
//	System.out.printf("%.2f\r\n", b);
//	System.out.println(s);
//	}
//}


//517
//import java.util.Scanner;
//public class 입력 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	double a = sc.nextDouble();
//	double b = sc.nextDouble();
//	double c = sc.nextDouble();
//	
//	sc.close();
//
//	System.out.printf("%.3f\r\n", a);
//	System.out.printf("%.3f\r\n", b);
//	System.out.printf("%.3f", c);
//	}
//}


//106
//public class 입력 {
//public static void main(String[] args) {
//	int a=10, b=20, c=30;
//		
//	System.out.println(a+" + "+b+" = "+c);
//	}
//}


//107
//public class 입력 {
//public static void main(String[] args) {
//	double a = 80.5;
//	double b = 22.34;
//	double ab = a + b;
//	
//	System.out.printf("%10.2f%10.2f%10.2f", a, b, ab);
//	}
//}


//108
//public class 입력 {
//public static void main(String[] args) {
//		double a = 100.12;
//		int b = 50;
//		double ab = a*b;
//		System.out.println(a+" * "+b+" = "+(Math.round(ab)));
//	}
//}


//109
//import java.util.Scanner;
//public class 입력 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int sum = a + b + c;
//		sc.close();
//		System.out.println("sum = " + sum);
//	}
//}


//110
//import java.util.Scanner;
//public class 입력 {
//	public static void main(String[] args) {
//		System.out.print("yard? ");
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double yd = Math.round(a * 91.44 * 10) / 10.0;
//		sc.close();
//		System.out.println(a+"yard = " + yd + "cm");
//	}
//}