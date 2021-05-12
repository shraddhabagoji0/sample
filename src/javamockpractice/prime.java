package javamockpractice;

public class prime {
	public static void primeNo(int no) {
		boolean flag=true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("it is a prime number"+no);
			
		}
	}

	public static void main(String[] args) {
		for(int j=2;j<=10;j++) {
			primeNo(j);
		}
		

	}

}
