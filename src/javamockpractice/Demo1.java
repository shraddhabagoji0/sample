package javamockpractice;

public class Demo1 {
	public static void fibo(int fib1,int fib2) {
		int fib3;
		System.out.println("{"+fib1+" "+fib2+"}");
		for(int i=1;i<=5;i++) {
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}

	public static void main(String[] args) {
		fibo(6,7);

	}

}
