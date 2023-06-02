package Medium;

public class FirstAndLastPositionInSortedArray {

    public static void main(String[] args) {
        int []temp = searchRange(new int[]{5,7,7,8,8,8,8,10}, 8);

        for(int i:temp){
            System.out.print(i + " ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int leftIndex = binSearch(nums,target,true);
        int rightIndex = binSearch(nums,target,false);

        return new int[]{leftIndex,rightIndex};
    }

    public static int binSearch(int []nums, int target, boolean leftIndex){
        int index = -1;
        int left = 0;
        int right = nums.length - 1;



        while (left <= right){
            int midpoint = (left + right)/2;
            if(nums[midpoint] > target){
                right = midpoint - 1;
            }
            else if(nums[midpoint] < target){
                left = midpoint + 1;
            }
            else{
                index = midpoint;
                if(leftIndex){
                    right = midpoint - 1;
                }
                else{
                    left = midpoint + 1;
                }
            }
        }

        return index;

    }
}
