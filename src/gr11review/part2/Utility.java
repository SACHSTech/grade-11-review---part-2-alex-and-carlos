package gr11review.part2;

public class Utility {
  public static int R7(String strWord) {
    
    String strAll = strWord;
    String strReadAll;
    int intCount = 0;
    int intCountWords;
    int intTotalChar = strAll.length();
    int intCounter = 0;
    int intNumbers;
    int intCombined;
    String strTempChar;
    String strChar;
    char Characters;

    while (intCount != intTotalChar) {

      Characters = strTheSentence.charAt(intCount);
      intCount++;

      while (Characters >= '0' && Characters <= '9') {
        intCounter++;

        strTempChar = Character.toString(Characters);

        intCountWords = intCount + intCounter;
        Characters = strTheSentence.charAt(intCountWords);

        if (Characters >= '0' && Characters <= '9') {
          strChar = Character.toString(Characters);
          strTempChar = strTempChar + strChar;
        }else if (Characters > '9' || Characters < '0') {
          intNumbers = Integer.parseInt(strTempChar);
        }
      }

      intCombined = intCombined + intNumbers;
      intCount = intCount + intCountWords;

      if (intCount >= intLength && Characters > '9') {
        intCount--;
        return intCombined;
        break;
      }
    }
  }
}