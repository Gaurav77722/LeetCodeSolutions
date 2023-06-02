package Medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        nums = reverse(nums,0, nums.length-1);
        nums = reverse(nums,0,0+k-1);
        nums = reverse(nums, k, nums.length-1);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }

    public static int[] reverse(int []nums, int begin, int end){

        int a = begin;
        int b = end;
        while (a <= b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }

        return nums;
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2}, 3);
    }

}
