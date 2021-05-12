package javamockpractice;

public class ReversingNumber {

	public static void main(String[] args) {
		int no=123;
		int copy=no;
		int rev=0;
		while(no!=0) {
			
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;	
		}
		System.out.println(rev);
		if(copy==no) {
			System.out.println("it is a pallindrome");
		}else {
			System.out.println("it is not a pallindrome");
		}

	}

}
