package javamockpractice;

public class prr {

	public static void main(String[] args) {
		String s1="this is software testing course";
//		String[] s2 = s1.split(" " );
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		
		
	
		
		
	}

}
