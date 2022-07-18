package leetcodeSample;

public class CycleRotate {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int count=4;
		while(count>=0) {
		int n=arr.length-1;
		int temp=0;
		int i=0;
		int j=arr.length-1;	
		temp = arr[arr.length-1];
		while(i!=j) {
			arr[n-i]=arr[n-i-1];
			i++;
		}
		arr[0]=temp;
		count--;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
		
	}
}
