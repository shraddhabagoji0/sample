package javamockpractice;

public class Demo3 {
	public static void primeNo(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
		
	}
	public static void main(String[] args) {
		primeNo(13);

	}

}
