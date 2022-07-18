package leetcodeSample;

public class SortArrayWith012 {

	public static void main(String[] args) {
		int count0=0;
		int count1=0;
		int count2=0;
		int count=0;
		int [] arr = {0,1,0,2,1,0,1,2};
		int [] newArr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					count0++;
				}
				if(arr[i]==1) {
					count1++;
				}
				if(arr[i]==2) {
					count2++;
				}
			}
			
			while(count0>0) {
				newArr[count++]=0;
				count0--;
			}
			
			while(count1>0) {
				newArr[count++]=1;
				count1--;
			}
			
			while(count2>0) {
				newArr[count++]=2;
				count2--;
			}
			
			for(int i=0;i<newArr.length;i++) {
				System.out.println(newArr[i]);
			}
		
		

	}

}
