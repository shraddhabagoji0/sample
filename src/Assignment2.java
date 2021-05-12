
public class Assignment2 {

	public static void main(String[] args) {
		 int temp, size;
	      int arr[] = {1,10,0,9,2};
	      size = arr.length;

	      for(int i = 0; i<size-1; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(arr[i]>arr[j]){
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      System.out.println("2nd Smallest element of the array is:: "+arr[1]);
	      for(int k=0;k<size;k++) {
	    	  System.out.println(arr[k]);
	      }
	   }

}
