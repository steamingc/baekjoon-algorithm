package ClassHour;

//1. Stack 사용

//import java.util.Scanner;
//import java.util.Stack;
//
//public class B9012 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Stack<Character> stk = new Stack<Character>();
//		int T = sc.nextInt();
//		
//		//테스트케이스 횟수만큼 반복하면서 문자열을 
//		for(int i=0; i<T; i++) {
//			Boolean b = true;
//			String inp = sc.next();
//			stk.clear();	//현재 스택 상태를 비워줌
//			
//			for(int j=0; j<inp.length(); j++) {
//				char c = inp.charAt(j);
//				if(c == '(') {
//					stk.push(c);
//				} else {
//					if(stk.size() > 0) {
//						stk.pop();
//					} else {
//						b = false;
//						break;
//					}
//				}
//			}
//			if(stk.size() == 0 && b == true) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//		
//		sc.close();
//	}
//}

//2. 스택 사용 안 하고 하기
//import java.util.Scanner;
//
//public class B9012 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//
//		// 테스트케이스 횟수만큼 반복하면서 문자열을 파싱해서 좌측 괄호 우측 괄호 검사
//		for (int i = 0; i < T; i++) {
//			String inp = sc.next();
//			int res = 0;
//			boolean b = true;
//
//			for (int j = 0; j < inp.length(); j++) {
//				char c = inp.charAt(j);
//				if (c == '(') {
//					res++;
//				} else {
//					res--;
//					if (res < 0) {
//						b = false;
//						break;
//					}
//				}
//			}
//			if (res == 0 && b == true) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//
//		sc.close();
//	}
//}
