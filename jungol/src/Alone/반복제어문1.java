package Alone;

//536
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		int i=1;
//		while(i<=15) {
//			System.out.print(i+" ");
//			i++;
//		}
//	}
//}


//537
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		int i = 1;
//		int sum=0;
//		
//		while(i<=num) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
//	}
//}


//540
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int num = sc.nextInt();
//			if(num%3==0) {
//				System.out.println(num/3);
//			}
//			
//			if(num==-1) {
//				sc.close();
//				break;
//			}
//			
//		}
//	}
//}


//633
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("1. Korea");
//			System.out.println("2. USA");
//			System.out.println("3. Japan");
//			System.out.println("4. China");
//			System.out.print("number? ");
//			int num = sc.nextInt();
//			
//			switch (num) {
//			case 1:
//				System.out.println("");
//				System.out.println("Seoul");
//				System.out.println("");
//				break;
//				
//			case 2:
//				System.out.println("");
//				System.out.println("Washington");
//				System.out.println("");
//				break;
//
//			case 3:
//				System.out.println("");
//				System.out.println("Tokyo");
//				System.out.println("");
//				break;
//				
//			case 4:
//				System.out.println("");
//				System.out.println("Beijing");
//				System.out.println("");
//				break;
//				
////			default:
////				System.out.println("");
////				System.out.println("none");
////				break;
//			}
//			
//			if(num<1||num>4) {
//				System.out.println("");
//				System.out.println("none");
//				sc.close();
//				break;
//			}
//		}
//	}
//}

//125
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		for(int i=1; i<=a; i++) {
//			System.out.print(i + " ");
//		}
//		sc.close();
//	}
//}


//126
import java.util.Scanner;
public class 반복제어문1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd_num=0;
		int even_num=0;
	
		while (true) {
			int i = sc.nextInt();
			
			if (i % 2 == 0) {
				even_num++;
			} else if (i % 2 == 1 ){
				odd_num++;
			} else if (i == 0){
				break;
			}
		}
		sc.close();
		
		System.out.println("odd : "+odd_num);
		System.out.println("even : "+even_num);
	}
}