package ClassHour;

//1. 스캐너 사용
import java.util.Scanner;
public class B10828_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SStack stk = new SStack();

		int N = sc.nextInt();
//      System.out.println(N);
		for (int i = 0; i < N; i++) {
			String s = sc.next();
//         System.out.println(s);

			switch (s) {
			case "push":
				int num = sc.nextInt();
//            System.out.println(num);
				stk.push(num);
				break;
			case "top":
				stk.top();
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				System.out.println(stk.empty());
				break;
			case "pop":
				stk.pop();
				break;
			}
		}
		sc.close();
	}
}

class SStack {
	int[] ar;
	int top;

	public SStack() {
		ar = new int[10000];
		top = -1;
	}

	void push(int x) {
		ar[++top] = x;
	}

	void pop() {
		if (top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(ar[top--]);
		}
	}

	int size() {
		return top + 1;
	}

	int empty() {
		if (top == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	void top() {
		if (top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(ar[top]);
		}
	}
}

//2. BufferedReader 사용
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class B10828_2 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		SJStack stk = new SJStack();
//
//		int N = Integer.parseInt(br.readLine());
//		for (int i = 0; i < N; i++) {
//			String inp = br.readLine();
//
//			StringTokenizer st = new StringTokenizer(inp);
//			if (st.countTokens() == 2) {
//				String cmd = st.nextToken();
//				int num = Integer.parseInt(st.nextToken());
//				stk.push(num);
//			} else {
//
//				switch (inp) {
//				case "pop":
//					System.out.println(stk.pop());
//					break;
//				case "top":
//					stk.top();
//					break;
//				case "size":
//					System.out.println(stk.size());
//					break;
//				case "empty":
//					System.out.println(stk.empty());
//					break;
//				}
//			}
//		}
//	}
//}
//
//class SJStack {
//	private int[] ar;
//	private int top;
//
//	public SJStack() {
//		ar = new int[10000];
//		top = -1;
//	}
//
//	public void push(int x) {
//		ar[++top] = x;
//	}
//
//	public int pop() {
//		if (empty() == 1) {
//			return -1;
//		} else {
//			return ar[top--];
//		}
//	}
//
//	public int size() {
//		return top + 1;
//	}
//
//	public int empty() {
//		if (top == -1) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
//
//	public void top() {
//		if (empty() == 1) {
//			System.out.println("-1");
//		} else {
//			System.out.println(ar[top]);
//		}
//	}
//}

//3. Stack<> 사용
//import java.util.Scanner;
//import java.util.Stack;
//
//public class B10828_2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		String inp[] = new String[N + 1];
//		for (int i = 0; i <= N; i++) {
//			inp[i] = sc.nextLine();
//		}
//		sc.close();
//
//		Stack<Integer> stk = new Stack<Integer>();
//		for (int i = 1; i <= N; i++) {
//			if (inp[i].equals("pop")) {
//				if (!stk.isEmpty()) {
//					System.out.println(stk.pop());
//				} else {
//					System.out.println("-1");
//				}
//			} else if (inp[i].equals("top")) {
//				if (!stk.isEmpty()) {
//					System.out.println(stk.peek());
//				} else {
//					System.out.println("-1");
//				}
//			} else if (inp[i].equals("size")) {
//				System.out.println(stk.size());
//			} else if (inp[i].equals("empty")) {
//				if (!stk.isEmpty()) {
//					System.out.println("0");
//				} else {
//					System.out.println("1");
//				}
//			} else {
//				String str = "";
//				for (int j = 5; j < inp[i].length(); j++) {
//					str += inp[i].charAt(j);
//				}
//				stk.push(Integer.parseInt(str));
//			}
//		}
//	}
//}