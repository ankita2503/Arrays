package leetcodeSample;

public class segregateElements {

	public static void main(String[] args) {
		int temp=0;
		int c=0;
		int n=0;
		int [] arr = {-5,7,-3,-4,9,10,-1,11};
		int i=0;
		int j=0;
		while(n<=arr.length || arr[arr.length-1]>0) {
			if(arr[j]<0) {
				j++;
			}
			else {
				while(i<j) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					i++;
					//j++;
				}
				c++;
				i=c;
			}
			n++;
		}
		
		
		System.out.println(i);
		System.out.println(j);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		

	}

}
