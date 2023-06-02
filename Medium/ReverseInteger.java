package Medium;

public class ReverseInteger {

    public static int reverse(int x){

        int result = 0;

        while (x!=0) {
            int lastDigit = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            result = (result * 10) + lastDigit;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse(120));
    }

}
