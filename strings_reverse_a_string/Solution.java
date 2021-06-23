public class Solution {
  public static String reverse(String stringToReverse){
    int sizeOfString = stringToReverse.length();
    char[] reversedStringCharacters = new char[sizeOfString];

    for (int i = 0; i <= sizeOfString - 1; i++){
      reversedStringCharacters[i] = stringToReverse.charAt(sizeOfString - 1 - i);
    }

    return String.valueOf(reversedStringCharacters);

  }
}