package ClassHour;

//1. Stack ���

//import java.util.Scanner;
//import java.util.Stack;
//
//public class B9012 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Stack<Character> stk = new Stack<Character>();
//		int T = sc.nextInt();
//		
//		//�׽�Ʈ���̽� Ƚ����ŭ �ݺ��ϸ鼭 ���ڿ��� 
//		for(int i=0; i<T; i++) {
//			Boolean b = true;
//			String inp = sc.next();
//			stk.clear();	//���� ���� ���¸� �����
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

//2. ���� ��� �� �ϰ� �ϱ�
//import java.util.Scanner;
//
//public class B9012 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//
//		// �׽�Ʈ���̽� Ƚ����ŭ �ݺ��ϸ鼭 ���ڿ��� �Ľ��ؼ� ���� ��ȣ ���� ��ȣ �˻�
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
