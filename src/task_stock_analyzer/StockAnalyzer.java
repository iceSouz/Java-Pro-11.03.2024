package task_stock_analyzer;

public class StockAnalyzer {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int currentProfit = currentPrice - minPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}
