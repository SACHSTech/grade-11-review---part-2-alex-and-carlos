package gr11review.part2;

public class Utility {
  public static int StringCombinedInt(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
    
    String strAll = strWord;
    int intCount;
    int intTotalChar = strAll.length();
    int intCounter = 0;
    int intCounter2 = 0;
    int intCombined = 0;
    String strTempChar1;
    String strTempChar2;
    String strCombinedChar;
    char Char1;
    char Char2;
    String strChar1;
    String strChar2;

    System.out.print("There is a total of: " + intTotalChar + " characters in these string of letters.");

    for (intCount = 1; intCount <= intTotalChar; intCount++) {
      intCount = intCount + intCounter;
      // clear temporary variables
      strTempChar1 = "";
      strTempChar2 = "";

      Char1 = strAll.charAt(intCount); //String return char

      if (Character.isDigit(Char1)) {
        while (Character.isDigit(Char1)) {
          intCounter = 1;

          intCounter2 = intCounter + intCount; //1+1 = 2
          
          // preregistering the temporary Variables
          strChar1 = Character.toString(Char1);
          strTempChar1 = Character.toString(Char1);

          Char2 = strAll.charAt(intCounter2);
          strTempChar2 = Character.toString(Char2);

          System.out.print(strChar1);

          while (Character.isDigit(Char2)) {
            intCounter++;

            intCounter2 = intCounter + intCount;

            Char2 = strAll.charAt(intCounter2);
            strChar2 = Character.toString(Char2);
            strTempChar2 = strTempChar2 + strChar2;

            if (Char2 < '0' || Char2 > '9') {
              intCounter--;
              break;
            }
          }
          intCount = intCounter2;
          // combine the temporary variables
          strCombinedChar = strTempChar1 + strTempChar2;
          intCombined = Integer.parseInt(strCombinedChar);
          System.out.println(intCombined);

          if (intCount > intTotalChar) {
            intCount = intTotalChar;
            break;
          }
        }
      }
    }
   return intCombined;
  }
  public static 
}