package javamockpractice;

public class Exam3 {
	int a,b;
	String m,n;
	Exam3(int x,int y){
		a=x;
		b=y;
	}
	Exam3(String c,String d){
		m=c;
		n=d;
	}
	public static void main(String[] args) {
		Exam3 e=new Exam3("a","b");
		System.out.println(e.m);
		System.out.println(e.n);
		e=new Exam3(2,5);
		System.out.println(e.a);
		System.out.println(e.b);
	}

}
