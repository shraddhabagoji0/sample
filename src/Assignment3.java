
public class Assignment3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,3,4};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
