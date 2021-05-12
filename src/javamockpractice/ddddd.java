package javamockpractice;

public class ddddd {

	public static void main(String[] args) {
		int[] a= {10,15,8,9,1};
		for(int i=0;i<a.length-1;i++) {
			int smallest=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<smallest) {
					smallest=a[j];
					int temp=a[i];
					a[i]=smallest;
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}

	}

}
