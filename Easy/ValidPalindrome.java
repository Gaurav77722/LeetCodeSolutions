package Easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            Character a = s.charAt(left);
            Character b = s.charAt(right);

            if(!Character.isLetter(a) && !Character.isDigit(a)){
                left++;
                continue;
            }
            if(!Character.isLetter(b) && !Character.isDigit(b)){
                right--;
                continue;
            }
            if(Character.toLowerCase(a) != Character.toLowerCase(b)){
                return false;
            }

            left++;
            right--;
        }

        return true;

    }

}
