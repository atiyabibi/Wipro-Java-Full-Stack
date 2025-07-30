package day6;
class Point2 {
	int x;
	int y;
	void set_X(int x) {
		x=(x>79?79:(x<0?0:x));
	}
	void set_Y(int y) {
		y=(y>24?24:(y<0?0:y));
	}
	int get_X() {
		return x;
	}
	int get_Y() {
		return y;
	}
}
public class Point_1 {
	public static void main(String args[]) {
		Point2 p=new Point2();
		p.set_X(88);
		p.set_Y(0);
		System.out.println("The value of x is "+p.get_X());
		System.out.println("The value of y is "+p.get_Y());
	}
}
