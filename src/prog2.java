
public class prog2 {
	public static void revNo(int no) {
		int copy=no;
		int rev=0;
		while(no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==copy) {
			System.out.println("it is a pallindrome "+copy);
		}
	}
	public static void main(String[] args) {
		for(int i=10;i<=45;i++) {
		revNo(i);
		}
		
	
	}

}
