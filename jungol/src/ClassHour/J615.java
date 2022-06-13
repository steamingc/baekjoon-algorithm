package ClassHour;
import java.util.Scanner;

//public class J615 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		Student2 s1 = new Student2(sc.next(), sc.nextInt(), sc.nextInt());
//		Student2 s2 = new Student2(sc.next(), sc.nextInt(), sc.nextInt());
//		s1.print();
//		s2.print();
//		System.out.println("avg "+(s1.kor+s2.kor)/2+" "+(s1.eng+s2.eng)/2);
//		
//		sc.close();
//	}
//}
//
//class Student2 {
//	public String name;
//	public int kor;
//	public int eng;
//	
//	public Student2 (String name, int kor, int eng) {
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//	}
//	
//	public void print() {
//		System.out.print(name+" "+kor+" "+eng);
//		System.out.println();
//	}
//}



public class J615 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] ar = new Person[2];
		for(int i=0; i<ar.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			ar[i] = new Person(name, kor, eng);
		}
		sc.close();
		
		for(int i=0; i<ar.length; i++) {
			ar[i].print();
		}
	}
}

class Person {
	public String name;
	public int kor;
	public int eng;
	
	public Person (String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.print(name+" "+kor+" "+eng);
		System.out.println();
	}
}