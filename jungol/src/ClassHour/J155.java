package ClassHour;

import java.util.Scanner;

//public class J155 {
//	static boolean run = false;	//run�޼��尡 �����ߴ���.
//	static int idx;				//�ε��� ���� �����ϴ� ����
//	
//	//run�޼���
//	public static void run() {
//		run = true;
//		System.out.println(idx);
//	}
//	
//	public static void main(String[] args) {
//		//6���� ���� �迭 ����� �ʱ�ȭ
//		char[] arr = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
//		
//		//���� �� �� �Է� �ޱ�
//		Scanner sc = new Scanner(System.in);
//		char a = sc.next().charAt(0);
//		sc.close();
//		
//		//�Է¹��� ���ڰ� �迭�� �ִ��� Ȯ��
//		//�迭 ��� �� �ϳ��� ������ ��ġ�� ���. �ƴϸ� none ���
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
		//6���� ���� �迭 ����� �ʱ�ȭ
		char[] arr = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
		
		//���� �� �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();

		boolean b = false;	//���� ���ڰ� �ִ��� Ȯ���ϴ� �뵵�� ����
		
		//�Է¹��� ���ڰ� �迭�� �ִ��� Ȯ��
		//�迭 ��� �� �ϳ��� ������ ��ġ�� ���. �ƴϸ� none ���
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
