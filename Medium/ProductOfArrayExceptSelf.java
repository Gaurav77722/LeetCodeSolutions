package Medium;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1,2,3,4}));
    }
    public static int[] productExceptSelf(int[] nums) {
        int arrLength = nums.length;

        int []output = new int[arrLength];

        output[0] = 1;

        for(int i=1; i<arrLength; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        int R = 1;

        for(int i=arrLength-1; i>=0; i--){
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }


}
