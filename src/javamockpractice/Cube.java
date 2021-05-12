package javamockpractice;

public class Cube {
	public static void main(String[] args) {
		int num=234;
		int copy=num;
		int sum=0;
		
		while(num!=0){
			
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println(sum);
		if(sum==copy) {
			System.out.println("its a amstrong number");
		}else {
			System.out.println("its not a amstrong number");
		}
	}

}
