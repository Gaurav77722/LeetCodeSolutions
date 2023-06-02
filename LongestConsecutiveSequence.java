import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int i: nums){
            numSet.add(i);
        }

        for(int i: numSet){
            if(!numSet.contains(i-1)){
                int seqLength = 0;
                while(numSet.contains(i+seqLength)){
                    seqLength++;
                }
                longestSequence = Math.max(seqLength,longestSequence);
            }
        }
        return longestSequence;

    }
}
