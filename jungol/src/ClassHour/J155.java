package ClassHour;

import java.util.Scanner;

//public class J155 {
//	static boolean run = false;	//run메서드가 동작했는지.
//	static int idx;				//인덱스 값을 저장하는 변수
//	
//	//run메서드
//	public static void run() {
//		run = true;
//		System.out.println(idx);
//	}
//	
//	public static void main(String[] args) {
//		//6개의 문자 배열 만들고 초기화
//		char[] arr = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
//		
//		//문자 한 개 입력 받기
//		Scanner sc = new Scanner(System.in);
//		char a = sc.next().charAt(0);
//		sc.close();
//		
//		//입력받은 문자가 배열에 있는지 확인
//		//배열 요소 중 하나로 있으면 위치를 출력. 아니면 none 출력
//		for(idx=0; idx<arr.length; idx++) {
//			if(a==arr[idx]) {
//				run();
//				break;
//			}			
//		}//for
//		
//		if(run==false) {
//			System.out.println("none");
//		}
//		
//	}//main
//}


public class J155 {
	public static void main(String[] args) {
		//6개의 문자 배열 만들고 초기화
		char[] arr = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
		
		//문자 한 개 입력 받기
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();

		boolean b = false;	//같은 문자가 있는지 확인하는 용도의 변수
		
		//입력받은 문자가 배열에 있는지 확인
		//배열 요소 중 하나로 있으면 위치를 출력. 아니면 none 출력
		for(int idx=0; idx<arr.length; idx++) {
			if(a==arr[idx]) {
				System.out.println(idx);
				b = true;
				break;
			}			
		}//for
		
		if(b==false) {
			System.out.println("none");
		}
		
	}//main
}
