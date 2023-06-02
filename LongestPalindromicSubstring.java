import java.util.Stack;

public class LongestPalindromicSubstring {


    public static void main(String[] args) {
        System.out.println(longestPalindrome("abb"));
    }

    public static String longestPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        char[] carr = s.toCharArray();
        //int markIndex = 0;
        String longestsub = "";
        for(int i = 0; i < carr.length; i++){

            String sub = helper(s, i, i);
            if (sub.length() > longestsub.length()){
                longestsub = sub;
            }
            sub = helper(s, i, i+1);
            if (sub.length() > longestsub.length()){
                longestsub = sub;
            }
        }
        return longestsub;

    }

    private static String helper(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }


}
