
public class prog3 {

	public static void main(String[] args) {
		int no=89;
		int temp=1;
		int binary=0;
		while(no!=0) {
			int rem=no%10;
			binary=binary+rem*temp;
			temp=temp*10;
			no=no/2;
		}
		System.out.println(binary);
	}

}
