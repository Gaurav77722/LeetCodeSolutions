public class RemoveDuplicatesSortedArray {
    // Use a left pointer(k) and right pointer(for loop) and if current element is not
    // equal to previous element then replace the current element with the element at
    // left pointer and increment the left pointer
    public static int removeDuplicates(int[] nums) {
        // Left pointer
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,2,3,3,4,4,5}));
    }
}
