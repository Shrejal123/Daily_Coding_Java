package com.dsa.day1;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;

        for(int i=1;i<n;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]>min){
                profit = Math.max(profit,prices[i]-min);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int profit = maxProfit(arr);
        System.out.println(profit);

    }
}
