/**
 * Say you have an array for which the ith elements is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * 
 * Note that you cannot sell a stock before you buy one.
 */
public class maxProfit {
    
    public static int getMaxProfit(int[] prices){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(a));

    }
}
