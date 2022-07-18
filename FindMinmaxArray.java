package leetcodeSample;

public class FindMinmaxArray {

	public static void main(String[] args) {
	
		long min=Long.MAX_VALUE;
		long max=Long.MIN_VALUE;
		// TODO Auto-generated method stub
		int [] arr = {8,10,6,8,4,4,2,3,2,2,7};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			if(arr[i]<=min) {
				min=arr[i];
			}
		}
		System.out.println("min = "+min+", max = "+max);
		

	}

}
