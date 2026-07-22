package two_pointers;

public class move_zeroes {
	public static void main(String[] args) {
		int[] nums = {1,3,0,0,7,5};
		int slow = 0;
		for(int fast=0;fast < nums.length;fast++) {
			if(nums[fast]!= 0 ) {
				nums[slow] = nums[fast];
				slow++;
			}
		}
		while(nums.length > slow) {
			nums[slow] = 0;
			slow++;
		}
		for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i] + " ");
		}
	}

}
