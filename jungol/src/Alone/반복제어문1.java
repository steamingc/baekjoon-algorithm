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

//선생님 풀이
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int inp = 0;
//		
//		do {
//			System.out.println("1. Korea");
//			System.out.println("2. USA");
//			System.out.println("3. Japan");
//			System.out.println("4. China");
//			System.out.print("number? ");
//			inp = sc.nextInt();
//			
//			switch (inp) {
//			case 1:
//				System.out.println();
//				System.out.println("Seoul");
//				System.out.println();
//				break;
//				
//			case 2:
//				System.out.println();
//				System.out.println("Washington");
//				System.out.println();
//				break;
//				
//			case 3:
//				System.out.println();
//				System.out.println("Tokyo");
//				System.out.println();
//				break;
//				
//			case 4:
//				System.out.println();
//				System.out.println("Beijing");
//				System.out.println();
//				break;
//				
//			default: 
//				System.out.println();
//				System.out.println("none");
//				System.out.println();
//			}
//			
//			
//		} while(1<=inp && inp <= 4);
//		
//		sc.close();
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
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int odd_num = 0;
//		int even_num = 0;
//	
//		while (true) {
//			int i = sc.nextInt();
//			
//			if (i % 2 == 0) {
//				even_num++;
//			} else if (i % 2 == 1 ){
//				odd_num++;
//			} else if (i == 0){
//				break;
//			}
//		}
//		sc.close();
//		
//		System.out.println("odd : "+odd_num);
//		System.out.println("even : "+even_num);
//	}
//}


//127
import java.util.Scanner;
public class 반복제어문1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		while(true) {
			int a = sc.nextInt();
			
			//100보다 크면 종료
			if(a>100) {
				sc.close();
				break;
			}
			sum += a;
			count++;
		}
		
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f", (double)sum/count);
	}
}


//128
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		
//		while(true) {
//			int a = sc.nextInt();
//			
//			//0이면 종료
//			if(a==0) {
//				sc.close();
//				break;
//			}
//			
//			if(a%3!=0 && a%5!=0) {
//				count ++;
//			}
//		}
//		
//		System.out.println(count);
//	}
//}


//129
//import java.util.Scanner;
//public class 반복제어문1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Base = ");
//		System.out.println();
//		System.out.print("Height = ");
//		
//		
//		sc.close();
//	}
//}