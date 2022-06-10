package ClassHour;

import java.util.Scanner;
public class J539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		for(;;) {
			int i = sc.nextInt();
			sum += i;
			count ++;
			
			if(i>=100) {
				sc.close();
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(Math.round((double)sum/count*10)/10.0);
	}
}
