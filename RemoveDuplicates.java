package leetcodeSample;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,1};
		removeDuplicates(nums);
		
	}
	

	public static int removeDuplicates(int[] nums) {
		int[] copy = new int[nums.length];
		for (int i = 0; i < nums.length-1; i++) {
				copy[i] = nums[i];
		}
		nums = new int[nums.length];
		int j = 0;
		for (int i = 0; i < copy.length-1; i++) {
			if (copy[i + 1] != copy[i]) {
				nums[j] = copy[i];
				j++;
			}
		}
		for (int i = 0; i < nums.length-1; i++) {
			System.out.println(nums[i]);
			}
		
		System.out.println("-----------");
	for (int i = 0; i < copy.length-1; i++) {
		System.out.println(copy[i]);
		}
	
		return nums.length;
	}

}
