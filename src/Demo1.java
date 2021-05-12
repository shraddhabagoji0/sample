
public class Demo1 {

	public static void main(String[] args) {
		String s1="hey this is shraddha";
		String[] s=s1.split(" ");
		 String rev=" ";
		 for(int i=s.length-1;i>=0;i--) {
			 rev=rev+s[i]+" ";
			 
		 }
		 System.out.println(rev);

	}

}
