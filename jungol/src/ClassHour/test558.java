package ClassHour;

import java.util.Scanner;

public class test558 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		//�Է¹��� ���� �迭 ��ҷ� �Է�. 0�� ������ �������´�
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();

			if(arr[i]==0) {
				count = i;	//0�� ���� �ε�����
				sc.close();
				break;
			}
		}
		
		//�迭�� �Ųٷ� ���
		for(int j=count-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
