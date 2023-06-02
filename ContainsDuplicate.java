import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsHS = new HashSet<>();
        for(int i:nums){
            numsHS.add(i);
        }
        if(numsHS.size()<nums.length){
            return true;
        }
        return false;
    }
}
