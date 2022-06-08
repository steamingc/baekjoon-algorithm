package ClassHour;
import java.util.Scanner;

class Info{
	private String name;
	private String school;
	private int grade;

	//기본 생성자
	public Info() {
		this.name = "홍길동";
		this.school = "그린초";
		this.grade = 6;
	}
	
	//생성자
	public Info(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void show() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class test613 {
	public static void main(String[] args) {
		System.out.println("이름, 학교명, 학년을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Info inf = new Info(name, school, grade);
		inf.show();
	}//main
}//class of test613
