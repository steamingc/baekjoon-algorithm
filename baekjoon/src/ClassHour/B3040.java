package ClassHour;

import java.util.Scanner;

public class B3040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int sum = 0;

		// �迭�� �Է¹��� 9���� ���ڵ��� �ְ� 9�� ������ ���� ���ϱ�
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}

		// ���տ��� 100 ���ֱ� (�����̰� �ƴ� �� ����� ��)
		int d = sum - 100;

		// �����̰� �ƴ� ����� �ε����� ������ ����
		int idx1 = 0;
		int idx2 = 0;

		// ���߹ݺ��� ���鼭 �� ���� ���� d�� ��� ã��
		loop1 :
		for (idx1 = 0; idx1 < num.length; idx1++) {
			for (idx2 = 0; idx2 < num.length; idx2++) {
				// ���� ���� ������ �ʰ� �ϱ� ���� ���� && �� ���� ���� d�� ���
				if (idx1 != idx2 && num[idx1] + num[idx2] == d) {
					break loop1;
				}
			}
		}

		// �ش� ���� 2���� �����ϰ� ���
		for (int i = 0; i < num.length; i++) {
			if (i != idx1 && i != idx2)
				System.out.println(num[i]);
		}

//		System.out.println(d);
//		System.out.println(num[idx1]+num[idx2]);
//		System.out.print(idx1 + " " + idx2);

		sc.close();
	}
}

