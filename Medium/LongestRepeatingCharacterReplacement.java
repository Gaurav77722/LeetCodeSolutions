package Medium;

/*
Sliding window
i,j
AABA
charCount array
get Max frequency character after every j increment
if window length - maxFrequent character > k decrement the character at i pointer and increment i pointer
get max sequence length everytime (check against the current window length)
increment j pointer
 */

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int []charCounts = new int[26];
        int maxFrequency = 0;
        int maxSequenceLength = 0;

        int i=0;
        int j=0;

        while(j<s.length()){
            charCounts[s.charAt(j) - 'A']++;
            maxFrequency = Math.max(maxFrequency,charCounts[s.charAt(j) - 'A']);

            if(((j-i+1)-maxFrequency)  > k){
                charCounts[s.charAt(i) - 'A']--;
                i++;
            }
            maxSequenceLength = Math.max(maxSequenceLength, j-i+1);
            j++;
        }

        return maxSequenceLength;
    }
}
