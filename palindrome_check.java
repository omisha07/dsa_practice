package two_pointers;

public class palindrome_check {
	public static void main(String[] args) {
		String  s = "A man, a plan, a canal: Panama";
		int left=0;
		int right= s.length()-1;
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				System.out.println("not palindrome");
			}
			left++;
			right--;
		}
		System.out.println("palindrome");
	}

}
