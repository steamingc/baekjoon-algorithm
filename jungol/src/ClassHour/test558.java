package ClassHour;

import java.util.Scanner;

public class test558 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		//입력받은 값을 배열 요소로 입력. 0을 만나면 빠져나온다
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();

			if(arr[i]==0) {
				count = i;	//0을 넣은 인덱스값
				sc.close();
				break;
			}
		}
		
		//배열을 거꾸로 출력
		for(int j=count-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
