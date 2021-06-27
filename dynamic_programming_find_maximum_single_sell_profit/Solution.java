public class Solution{
    public static Tuple findMaxProfit(int[] array){
    int current_buy = array[0];
    int global_sell = array[1];
    int global_profit = global_sell - current_buy;

    int current_profit = Integer.MIN_VALUE; 

    for (int i = 1; i < array.length; i++){
      current_profit = array[i] - current_buy;

      if (current_profit > global_profit){
        global_profit = current_profit;
        global_sell = array[i];
      }

      if (current_buy > array[i]){
        current_buy = array[i];
      }
    }

    Tuple result = new Tuple(global_sell - global_profit, global_sell); 
    return result; 
    }
}