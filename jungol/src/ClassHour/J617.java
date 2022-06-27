package ClassHour;

import java.util.Scanner;

public class J617 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1차원 객체 배열 생성
		Person617[] arr = new Person617[5];
		
		//최소 키를 저장할 변수
		int min = 300;
		
		//최소 키를 가진 사람의 인덱스를 저장할 변수
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Person617(sc.next(), sc.nextInt());
			if(min>arr[i].getHeight()) {
				min = arr[i].getHeight();
				idx = i;
			}
		}
		sc.close();
		
		System.out.println(arr[idx].getName()+" "+arr[idx].getHeight());
	}
}

class Person617{
	private String name;
	private int height;

	//생성자
	public Person617(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
}