import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BuyAndSellStock {
    // Create a left pointer and right pointer.
    // Start iterating and update left pointer to right pointer
    // If left pointer is greater than right pointer
    // Otherwise calculate profit
    public static int maxProfit(int[] prices) {
        int left=0;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0;i< prices.length;i++){
            int profit = 0;
            if(prices[left] < prices[i]){
                profit = prices[i] - prices[left];
            }
            else{
                left = i;
            }
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
