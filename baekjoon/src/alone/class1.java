package alone;

//1157 �ܾ�� �ִ�� ���ĺ� ã��
import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		s = s.toUpperCase(); // �빮�ڷ� ��ȯ

		int[] arr = new int[26]; // ���ĺ� ���� �������� �迭 ����. �� �迭 ��ҵ��� �ʱ�ȭ ���� 0

		// �Է¹��� �ܾ� ���鼭 ���ĺ� �����ϸ鼭 ���ĺ� �� �ø���
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 65]++;
		}

		// �ִ밪�� �������� �ӽ� ����
		int max = 0;

		// �� �� �ٲ������ ��������
		int count = 0;

		// ���������� ������ �ε���
		int idx = 0;

		// �ݺ����� ���鼭 �� �迭��� ���߿� ���� ū ���� ��ȯ
		for (int i = 0; i < arr.length; i++) {
			
			//���ĺ��� 1�� �̻��� ���
			if (max < arr[i]) {
				max = arr[i];
				count++;
				idx = i;
			}
			
		}

		if (count == 1) {
			System.out.println((char) (idx + 65));
		} else {
			System.out.println("?");
		}
	}
}
