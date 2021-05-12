package javamockpractice;

class Demo{

	public static void main(String[] args) {
		int[] a= {10,3,78,98};
		int temp;
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}

			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);

		}

	}

}
