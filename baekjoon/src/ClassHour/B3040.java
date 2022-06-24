package ClassHour;

import java.util.Scanner;

public class B3040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int sum = 0;

		// 배열에 입력받은 9개의 숫자들을 넣고 9개 정수의 총합 구하기
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}

		// 총합에서 100 빼주기 (난쟁이가 아닌 두 놈들의 합)
		int d = sum - 100;

		// 난쟁이가 아닌 놈들의 인덱스를 저장할 변수
		int idx1 = 0;
		int idx2 = 0;

		// 이중반복문 돌면서 두 수의 합이 d인 경우 찾기
		loop1 :
		for (idx1 = 0; idx1 < num.length; idx1++) {
			for (idx2 = 0; idx2 < num.length; idx2++) {
				// 같은 수를 더하지 않게 하기 위한 조건 && 두 수의 합이 d인 경우
				if (idx1 != idx2 && num[idx1] + num[idx2] == d) {
					break loop1;
				}
			}
		}

		// 해당 정수 2개를 제외하고 출력
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

