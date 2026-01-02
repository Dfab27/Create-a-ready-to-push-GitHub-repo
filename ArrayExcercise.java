/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates 
 * in-place such that each unique element appears only once. The relative order of the elements 
 * should be kept the same. Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing 
 * duplicates, return the number of unique elements k. The first k elements of nums should contain
 *  the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 */
public class ArrayExcercise {

	public static void main(String[] args) {
		int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

		toString(nums);

		int n = removeDuplicates(nums);
		System.out.println(n);

		toString(nums);

	}

	public static int removeDuplicates(int[] nums) {
		// sets the number of unique value.
		int k = 0;

		// loop that traverses the array
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != -1) k++;
			for (int n = i + 1; n < nums.length; n++) {
				if ((nums[i] == nums[n])) {
					nums[n] = -1;

				} else if (nums[i] == -1) {
					nums[i] = nums[n];
					nums[n] = -1;
				} else {
					k++;
					break;
				}
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

}