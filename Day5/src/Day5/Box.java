package Day5;

public class Box {
	double d,w,h;
	Box(double d,double w,double h){
		this.w=w;
		this.d=d;
		this.h=h;
	}
	double volume() {
		return (w*h*d);
	}
	public static void main(String args[]) {
		Box b=new Box(2,4,2);
		System.out.println(b.volume());
	}
}
