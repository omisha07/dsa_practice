package two_pointers;

public class sorted_square {
	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		int n= nums.length-1;
		int[] result= new int[n];
		int pos= n-1;
		int left=0;
		int right=n-1;
		while(left<=right) {
			int leftsq = nums[left]*nums[left];
			int rightsq = nums[right]* nums[right];
			if(leftsq > rightsq) {
				result[pos]= leftsq;
				left++;
			} else {
				result[pos] = rightsq;
				right--;
			}
			pos--;
		}
		for(int i=0;i<n;i++) {
		System.out.println(result[i]+ " ");
		}
	}

}
