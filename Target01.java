/**
 * 
 */
package twopointer;

public class Target01 {
public static void main(String[] args) {
	int[] numbers= {2,7,11,15};
	int target=9;
	int left=0;
	int right= numbers.length-1;
	while(left<right) {
		int sum= numbers[left]+ numbers[right];
		if(sum==target) {
			System.out.println(left + " " + right);
		 return;
		}else if(sum > target){
			right--;
		}else {
			left++;
		}
	}
	System.out.println("Not found elements.");
}
}
