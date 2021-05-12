package javamockpractice;

public class ParameterizedConstructor {
	int a=0;
	int b=0;
	ParameterizedConstructor(int x,int y){
		a=x;
		b=y;
		
	}
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor(10,12);
		System.out.println(p.a);
		System.out.println(p.b);
	}

}
