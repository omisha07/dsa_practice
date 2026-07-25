package two_pointers;

public class remove_duplicates {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		if (nums.length==0) 
			System.out.println("Empty array");
		int slow =0;
		for(int fast=1; fast<nums.length; fast++) {
			if(nums[fast] != nums[slow]) {
				
				slow++;
				nums[slow]=nums[fast];
			}
		}
		for (int i=0; i<=slow;i++) {
			System.out.println(nums[i]+ " ");
			
		}
		System.out.println("\n Length = " + (slow+1));
	}

}
