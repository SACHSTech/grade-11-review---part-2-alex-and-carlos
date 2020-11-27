package gr11review.part2;

public class Utility {
  public static int StringCombinedInt(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
    
    String strAll = strWord;
    int intCount = 0;
    int intCountWords;
    int intTotalChar = strAll.length();
    int intCounter = 0;
    int intNumbers;
    int intCombined = 0;
    String strTempChar;
    String strChar;
    char Characters;

    System.out.print(intTotalChar);

    while (intCount != intTotalChar) {

      Characters = strAll.charAt(intCount);
      
      while (Characters >= '0' && Characters <= '9') {
        intCount++;

        strTempChar = Character.toString(Characters);

        intCountWords = intCount + intCounter;
        Characters = strAll.charAt(intCountWords);

        if (Characters >= '0' && Characters <= '9') {
          strChar = Character.toString(Characters);
          strTempChar = strTempChar + strChar;
        }else if (Characters > '9' || Characters < '0') {
          intNumbers = Integer.parseInt(strTempChar);
          intCombined = intCombined + intNumbers;
          intCount = intCount + intCountWords;
        }
        if (intCount >= intTotalChar) {
          break;
        }
      }
      if (intCount >= intTotalChar) {
        intCount--;
        break;
      }
    }
   return intCombined;
  }
}