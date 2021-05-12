package javamockpractice;

public class M2 {
	public int x,y;
	public M2(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class Example2 extends M2{
	public int x,y;
	Example2(){
		this(0, 0);
	}
	public  Example2(int x,int y) {
		super(x+1,y+1);
		this.x=x;
		this.y=y;
	}
	public void sony() {
		System.out.println("b : {" +x+ "," +y+  "}");
		System.out.println("c : {" +x+ "," +y+  "}");
	}

	public static void main(String[] args) 
	{
		M2 m=new M2(1,2);
		System.out.println(m.x);
		System.out.println(m.y);
		Example2 e2=new Example2();
		e2.sony();
		e2=new Example2(2,3);
		e2.sony();
}
	
	

}
