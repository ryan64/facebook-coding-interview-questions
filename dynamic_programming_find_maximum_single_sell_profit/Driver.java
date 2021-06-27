public class Driver {
    public static void main(String[] args){
        int[] prices = {8, 5, 12, 9, 19, 1};
        Tuple result = null;
        result = Solution.findMaxProfit(prices);
        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result.buy, result.sell));
    }
}