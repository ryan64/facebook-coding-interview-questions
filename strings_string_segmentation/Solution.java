import java.util.Set;

public class Solution{
  /*public static boolean canSegmentString(String s, Set <String> dictionary) {
    int lengthOfWord = s.length();
    for (int i = 1; i <= lengthOfWord; i++) {
      String first = s.substring(0, i);
      if (dictionary.contains(first)) {
        String second = s.substring(i);

        if (second.length() == 0 || dictionary.contains(second) || canSegmentString(second, dictionary)) {
          return true;
        }

      }
    }
    return false;
  }*/

  public static boolean canSegmentString(String s, Set<String> dictionary) {
    int size = s.length();
         
    if (size == 0) {
      return true; 
    }
      
    for (int i = 1; i <= size; i++) {
        if (dictionary.contains(s.substring(0,i)) && canSegmentString(s.substring(i,size), dictionary)) {
          return true; 
        }
    }
      
    return false;
  }
}
