package two_pointers;

public class sum_target {
	public static void main(String[] args) {
		int[] numbers= {2,7,11,15};
		int target = 9;
		int left=0;
		int right= numbers.length-1;
		while (left < right) {
			int sum= numbers[left] + numbers[right];
			if(sum < target) {
				left++;
			}
			else if(sum>target) {
				right--;
			}
			else {
				System.out.println(left+ "," +right);
				break;
			}
		}
	}

}

