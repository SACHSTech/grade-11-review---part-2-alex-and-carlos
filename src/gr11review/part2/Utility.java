package gr11review.part2;

public class Utility {
  public static int sumNumbers(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
  
    int intCount;
    int intCount2 = 0;
    int intTotal;
    int intCombined = 0;
    String strAll = strWord;
    String strSub;
    int intNum = 0;
    int intNumCombined = 0;
    char Char1;
    char Char2;

    intTotal = strAll.length();

    for (intCount = 0; intCount <= intTotal; intCount++) {

      intCount = intCount + intCount2;

      Char1 = strAll.charAt(intCount);

      while (Character.isDigit(Char1)) {

        intCount2++;

        Char2 = strAll.charAt(intCount + intCount2);

        if (Character.isDigit(Char2)) {

          strSub = strAll.substring(intCount, intCount2);
          System.out.print(strSub);

          intNum = Integer.parseInt(strSub);

        }else if (!Character.isDigit(Char2)) {

          intCount = intCount + intCount2;
          strSub = strAll.substring(intCount, intCount2);
          break;

        }
      }

      intCombined = intCombined + intNum;

      if (intCount > intTotal) {

        intCount = intTotal;

      }

    }
  return intCombined;
  }
  public static String alphaWord(String filenametxt) {

    return "gay";
  }
}