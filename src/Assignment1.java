
public class Assignment1 {

	public static void main(String[] args) {
		int[] arr= {1,10,3,8,99};
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(max<arr[j]) {
					max=arr[j];
				}

			}
		}
		System.out.println(max);

	}

}
