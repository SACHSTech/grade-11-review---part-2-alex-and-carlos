package gr11review.part2;

public class Utility {
  public static int StringCombinedInt(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
  
    int intCount;
    int intCount2;
    int intTotal;
    int intCombined;
    String strAll = strWord;
    String strSub;
    int intNum;
    int intNumCombined;
    char Char1;
    char Char2;

    intTotal = strAll.length();

    for (intCount = 0; intCount <= intTotal; intCount++) {
      intCount2 = 0;

      Char1 = strAll.charAt(intCount);

      while (Charactor.isDigit(Char1)) {
        intCount2++;

        Char2 = strAll.charAt(intCount + intCount2);

        if (Character.isDigit(Char2)) {

          strSub = strAll.substring(intCount, intCount2);
          break;
        }else if (!Character.isDigit(Char2)) {
          intCount2--;

          intCount = intCount + intCount2;
          break;
        }
        System.out.print(strSub);
        
      }


    }

  }
  return intCombined;
}
  public static int sumNumbers(String str) {
    // Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    return 69;
  }
}