import java.util.Set;
import java.util.HashSet;

public class Driver {
   public static void main(String[] args) {
    Set<String> dictionary = new HashSet<String>();
    String applePie = "applepie";
    String applePeer = "applepeer";

    dictionary.add("apple");
    dictionary.add("apple");
    dictionary.add("pear");
    dictionary.add("pie");

    if (Solution.canSegmentString(applePie, dictionary)) {
      System.out.println("String Can be Segmented");
    } else {
      System.out.println("String Can NOT be Segmented");
    }

    if (Solution.canSegmentString(applePeer, dictionary)) {
      System.out.println("String Can be Segmented");
    } else {
      System.out.println("String Can NOT be Segmented");
    }
  }
}