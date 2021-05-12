package javamockpractice;
class A{
	public int x,y;
	public A(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class B extends A{
	public int x,y;
	public B() {
		this(0,0);
	}
	public B(int x,int y) {
		super(x+1,y+1);
		this.x=x;
		this.y=y;
	}
	public void print() {
//		System.out.println("Base Class:{"+x+", "+y+"}");
		System.out.println("Super Class:{"+super.x+", "+super.y+"}");
	}
	
}

public class Point {

	public static void main(String[] args) {
		B o1=new B();
		 System.out.println(o1.x);
		 System.out.println(o1.y);
		o1=new B(3,2);
		System.out.println(o1.x);
		System.out.println(o1.y);
		o1.print();
		A a=new A(1,1);
		System.out.println(a.x);
		System.out.println(a.y);
		
		
	}

}
