package ClassHour;

import java.util.Scanner;

public class B10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		RunStack rs = new RunStack(n);
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			
			switch (input) {
			case "push":
				int p = sc.nextInt();
				rs.push(p);
				break;

			case "pop":
				rs.pop();
				break;
				
			case "size":
				rs.size();
				break;
				
			case "empty":
				rs.empty();
				break;
				
			case "top":
				rs.top();
				break;
			}
		}
		
		
		sc.close();
	}
}

class RunStack {
	int[] arr;
	int count = 0;			//배열 인덱스
	boolean in = false;		//push 사용 여부 (정수가 배열에 들어갔는지)
	
	public RunStack(int n) {
		arr = new int[n];
	}
	
	public void push(int p) {
		arr[count] = p;
		count ++; 
		in = true;
	}
	
	public void pop() {
		if(in == false) {
			System.out.println(-1);
			in = false;
			count = 0;
		} else {
			System.out.println(arr[count]);
			count--;
			if(count==-1) {
				in = false;
			}
		}
	}
	
	public void size() {
		if(in) System.out.println(count);
		else System.out.println(count);
	}
	
	public void empty() {
		if(in) System.out.println(0);
		else System.out.println(1);
	}
	
	public void top() {
		if(in) {
			System.out.println(arr[count-1]);
		} else System.out.println(-1);
	}
	
	
}