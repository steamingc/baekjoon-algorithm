package ClassHour;

import java.util.Scanner;

//public class J616 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Triangle tri = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//		System.out.println("("+tri.t_x()+", "+tri.t_y()+")");
//		
//		sc.close();
//	}
//}
//
//class Triangle{
//	int x1, x2, x3, y1, y2, y3;
//	
//	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//		this.x3 = x3;
//		this.y3 = y3;
//	}
//	
//	public double t_x() {
//		return Math.round((double)(this.x1+this.x2+this.x3)/3.0*10)/10.0;
//	}
//	
//	public double t_y() {
//		return Math.round((double)(this.y1+this.y2+this.y3)/3.0*10)/10.0;
//	}
//}


//¼±»ý´Ô ÄÚµå
public class J616 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[6];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		Triangle tri = new Triangle(inp);

		tri.getCoG();
	}
}

class Triangle {
	private Point[] p;

	public Triangle(int[] xy) {
		p = new Point[3];
		for (int i = 0, j = 0; i < p.length; i++, j += 2) {
			p[i] = new Point(xy[j], xy[j + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void getCoG() {
		double cgx = 0.0, cgy = 0.0;

		for (int i = 0; i < p.length; i++) {
			cgx += p[i].getX();
			cgy += p[i].getY();
		}
		System.out.printf("(%.1f, %.1f)\n", ((double) cgx / 3), ((double) cgy / 3));
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " " + y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}