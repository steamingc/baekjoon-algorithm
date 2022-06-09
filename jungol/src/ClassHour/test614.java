package ClassHour;

import java.util.Scanner;

class Student{
	String school;
	int grade;
	
	public Student() {
		this.school = "æ»∏ª√ ";
		this.grade = 6;
	}
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
}

public class test614 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int g = sc.nextInt();
		sc.close();
		
		Student st1 = new Student("Jejuelementary", 6);
		Student st2 = new Student(s, g);
		
		System.out.println(st1.grade+" grade in "+st1.school+" School");
		System.out.println(st2.grade+" grade in "+st2.school+" School");
		
	}
}
