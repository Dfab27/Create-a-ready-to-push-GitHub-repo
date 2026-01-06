/**
 * These exercise come from problem you see in Neetcode.io
 */
public class ArrayExcercise {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 3, 4 };

		toString(nums);
		

		System.out.println(removeElement(nums, 1));
		
		toString(nums);

	}

	public static int removeDuplicates(int[] nums) {
		// sets the number of unique value.
		if (nums.length == 0)
			return 0;

		// elements starts at one.
		int k = 1;

		// loop that traverses the array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[k] = nums[i];
				k++;
			}

		}

		return k;

	}

	public static void toString(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	/**
	 * 
	 * @param nums is an array that contains int values
	 * @param val the value to be removed
	 * @return the number of time val does not appear
	 */
	public static int removeElement(int[] nums, int val) {
		
		if(nums.length == 0) return 0;
		
		//counts
		// how many different 
		int k = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		} 
		
		return k;

	}

}
