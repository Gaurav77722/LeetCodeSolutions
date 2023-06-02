package Medium;

/*
Write logic for normal binary search
check if leftmost number is less than or equal to midpoint
If it is, left side is sorted
If left side is sorted check if target is less than left number or target is greater than midpoint number i.e,
it lies outside the left sorted array
If it does put left pointer as midpoint + 1
else right as midpoint - 1
Same thing for right sorted array
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int midpoint = (left + right)/2;

            if(nums[midpoint] == target) return midpoint;

            if(nums[left] <= nums[midpoint]){ // left sorted
                if(target < nums[left] || target > nums[midpoint]){
                    left = midpoint + 1;
                }
                else{
                    right = midpoint - 1;
                }
            }
            else{   // right sorted
                if(target > nums[right] || target < nums[midpoint]){
                    right = midpoint - 1;
                }
                else{
                    left = midpoint + 1;
                }
            }
        }
        return -1;

    }

}
