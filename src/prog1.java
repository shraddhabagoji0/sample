
public class prog1 {
	public static void main(String[] args) {
		String s1="shraddha Bagoji";
		String rev=" ";
		for(int i=1;i<=s1.length();i++) {
			char ch=s1.charAt(s1.length()-i);
			rev=rev+ch;
		}
			
		System.out.println(rev);
		
	}

}
