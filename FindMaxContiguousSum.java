package leetcodeSample;

public class FindMaxContiguousSum {

	public static void main(String[] args) {
	
		
//		long maxSum=0;
//		long currSum=Long.MIN_VALUE;
//		int [] arr = {1,2,3,-2,5};
//		
//		for(int i=0;i<arr.length;i++) {
//			maxSum+=arr[i];
//			if(currSum<maxSum) {
//				currSum=maxSum;
//			}
//			if(maxSum<0) {
//				maxSum=0;
//			}
//		}
//		System.out.println(currSum);
		
		int [] arr = {-1,-2,-3,-4};
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum>=maxSum) {
					maxSum=sum;
				}
			}
			
		}
		System.out.println(maxSum);
	}

}
