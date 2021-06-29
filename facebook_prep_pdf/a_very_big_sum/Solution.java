import java.util.*;

public class Solution {
  public static long aVeryBigSum(List<Long> arr){
    long sum = 0; 
    for (int i = 0; i < arr.size(); i++){
      sum = sum + arr.get(i);
    }
    return sum; 
  }
}