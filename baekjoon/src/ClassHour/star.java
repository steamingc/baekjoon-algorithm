package ClassHour;

//2438 별찍기1
//import java.util.Scanner;
//public class star {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();
//	}
//}


//2439 별찍기2
import java.util.Scanner;
public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//이중for문에서 바깥for는 행을 의미
		//이중for문에서 안쪽for는 열을 의미
		for(int i=0; i<num; i++) {	
			for(int j=num-1; j>i; j--) {	//공백을 출력하는 반복문
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {		//별을 출력하는 반복문
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//2440 별찍기3
//import java.util.Scanner;
//public class star {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		sc.close();
//	}
//}


//2441 별찍기4
//import java.util.Scanner;
//public class star {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		sc.close();
//	}
//}


//2442 별찍기5
//import java.util.Scanner;
//public class star {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i=0; i<num; i++) {
//			
//			for(int j=num; j>i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<i*2+1; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		sc.close();
//	}
//}