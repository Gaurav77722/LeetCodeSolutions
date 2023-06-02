package Easy;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> values = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if(values.containsKey(diff)){
                return new int[]{values.get(diff), i};
            }
            values.put(nums[i], i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        two.twoSum(new int[]{2,7,11,15}, 9);
    }
}