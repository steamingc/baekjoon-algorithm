package alone;

//1157 단어에서 최대빈도 알파벳 찾기
import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		s = s.toUpperCase(); // 대문자로 변환

		int[] arr = new int[26]; // 알파벳 개수 사이즈의 배열 생성. 각 배열 요소들의 초기화 값은 0

		// 입력받은 단어 돌면서 알파벳 검토하면서 알파벳 수 늘리기
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 65]++;
		}

		// 최대값을 저장해줄 임시 변수
		int max = 0;

		// 몇 번 바뀌었는지 저장해줌
		int count = 0;

		// 최종적으로 저장할 인덱스
		int idx = 0;

		// 반복문을 돌면서 각 배열요소 값중에 가장 큰 값을 반환
		for (int i = 0; i < arr.length; i++) {
			
			//알파벳이 1개 이상인 경우
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
