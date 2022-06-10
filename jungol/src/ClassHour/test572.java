package ClassHour;

import java.util.Scanner;

public class test572 {
	public static void print(double r) {
		double PI = 3.14;
		double o = Math.round(r * r * PI*100)/100.0;
		System.out.printf("%.2f", o);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		print(r);
		sc.close();
	}
}
