package javamockpractice;

public class Fibo {
	public static void fibo(int fib1,int fib2) {
		int fib3;
		System.out.println(fib1+" "+fib2);
		for(int i=2;i<20;i++) {
			fib3=fib1+fib2;
			System.out.println("3rd value:"+fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
		
	}

	public static void main(String[] args) {
		
		fibo(0,1);
		

	}

}
