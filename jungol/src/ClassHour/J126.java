package ClassHour;

import java.util.Scanner;

public class J126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd_num = 0;
		int even_num = 0;
		
		for(;;) {
			int a = sc.nextInt();
			
			if(a%2==0 && a!=0) {
				even_num++;
			} else if(a%2!=0 && a!=0){
				odd_num++;
			}
			
			if(a==0) {
				sc.close();
				break;
			}
		}
		
		System.out.println("odd : "+odd_num);
		System.out.println("even : "+even_num);
		
	}
}
