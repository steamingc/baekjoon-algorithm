package ClassHour;

import java.util.Scanner;

public class test529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int iO = w + 100 - h;
		
		System.out.println("Ű = " + h);
		System.out.println("������ = " + w);
		System.out.println("�񸸵� = " + iO);
		if(iO > 0) System.out.println("Obesity");
		
		sc.close();
	}
}
