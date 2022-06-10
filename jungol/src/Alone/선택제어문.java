package Alone;


//530
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age>=20) System.out.println("adult");
//		else System.out.println((20-age)+" years later");
//		
//		sc.close();
//	}
//}


//531
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double w = sc.nextDouble();
//		
//		if(w>88.45) {
//			System.out.println("Heavyweight");
//		} else if(w>72.57) {
//			System.out.println("Cruiserweight");
//		} else if(w>61.23) {
//			System.out.println("Middleweight");
//		} else if(w>50.80) {
//			System.out.println("Lightweight");
//		} else System.out.println("Flyweight");
//		
//		sc.close();
//	}
//}


//532
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		
//		if(a>=4.0&&b>=4.0) {
//			System.out.println("A");
//		} else if(a>=3.0&&b>=3.0) {
//			System.out.println("B");
//		} else System.out.println("C");
//		
//		sc.close();
//	}
//}


//533
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String gdr = sc.next();
//		int age = sc.nextInt();
//		
//		if(gdr.equals("F")) {
//			if(age>=18) System.out.println("WOMAN");
//			else System.out.println("GIRL");
//		} else if(gdr.equals("M")) {
//			if(age>=18) System.out.println("MAN");
//			else System.out.println("BOY");
//		} else System.out.println("다시 입력하여 주십시오.");
//		
//		sc.close();
//	}
//}


//534
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char apb = sc.next().charAt(0);
//		sc.close();
//		
//		if(apb=='A') {
//			System.out.println("Excellent");
//		} else if(apb=='B') {
//			System.out.println("Good");
//		} else if(apb=='C') {
//			System.out.println("Usually");
//		} else if(apb=='D') {
//			System.out.println("Effort");
//		} else if(apb=='F') {
//			System.out.println("Failure");
//		} else {
//			System.out.println("error");
//		}
//	}
//}


//535
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int grade = (int)sc.nextDouble();
//		sc.close();
//
//		switch (grade) {
//			case 4:
//				System.out.println("scholarship");
//				break;
//			case 3:
//				System.out.println("next semester");
//				break;
//			case 2:
//				System.out.println("seasonal semester");
//				break;
//			default:
//				System.out.println("retake");
//				break;
//		}
//	}
//}


//632
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		int min = (a<b&&a<c)? a : (b<c)? b : c;
//
//		System.out.println(min);
//	}
//}


//120
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//
//		System.out.println(a>b? a-b : b-a);
//	}
//}


//121
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		sc.close();
//
//		System.out.println(a>0? "plus" : a==0? "zero" : "minus");
//	}
//}


//122
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		sc.close();
//		
//		//윤년
//		if(y%400==0 || (y%4==0 && y%100!=0)) System.out.println("leap year");
//		//평년
//		else System.out.println("common year");
//	}
//}


//123
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		System.out.print("Number? ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		sc.close();
//		
//		switch (a) {
//		case 1:
//			System.out.println("dog");
//			break;
//		
//		case 2:
//			System.out.println("cat");
//			break;
//		
//		case 3:
//			System.out.println("chick");
//			break;
//			
//		default:
//			System.out.println("I don't know.");
//			break;
//		}
//	}
//}


//124
//import java.util.Scanner;
//public class 선택제어문 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		sc.close();
//		
//		switch (a) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			System.out.println(31);
//			break;
//		
//		case 2:
//			System.out.println(28);
//			break;
//		
//		case 4: case 6: case 9: case 11:
//			System.out.println(30);
//			break;
//		}
//	}
//}