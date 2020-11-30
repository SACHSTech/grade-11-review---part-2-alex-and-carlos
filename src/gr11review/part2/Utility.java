package gr11review.part2;

public class Utility {
  public static int StringCombinedInt(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
    
    String strAll = strWord;
    int intCountWords;
    int intTotalChar = strAll.length();
    int intCounter = 0;
    int intChar1;
    int intChar2;
    int intCombined = 0;
    String strTempChar;
    String strChar;
    char Char1;
    char Char2;
    String strChar1;
    String strChar2;

    System.out.print("There is a total of: " + intTotalChar + "characters in the string of lettres.");

    for (int intCount = 1; intCount <= intTotalChar; intCount++) {
      
      Char1 = strAll.charAt(intCount); //String return char

      while (Char1 >= '0' && Char1 <= '9') {
        intCounter = 1;

        int intCounter2 = intCounter + intCount;
        
        strChar1 = Character.toString(Char1);

        strTempChar = Character.toString(Char1);
        Char2 = strAll.charAt(intCounter2);

        if (Char2 < '0' || Char2 > '9') {
          intChar1 = Integer.parseInt(strChar1);
        }else if (Char2 >= '0' && Char2 <= '9') {
          strChar2 = Character.toString(Char2);
          str
        }
      }
    }

   return intCombined;
  }
}