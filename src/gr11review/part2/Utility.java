package gr11review.part2;

public class Utility {
  public static int sumNumbers(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.
  
    int intCount;
    int intCount2 = 0;
    int intTotal;

    String strAll = strWord;
    String strSub;
    int intNum = 0;
    int intNumCombined = 0;
    char Char1;
    char Char2;

    intTotal = strAll.length();
    System.out.println("There is " + intTotal + " words in the string.");

    for (intCount = 0; intCount <= intTotal; intCount++) {
      
      intCount2 = 0;

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

      intNumCombined = intNumCombined + intNum;

      if (intCount > intTotal) {

        intCount = intTotal;

      }

    }
  return intNumCombined;
  }
  public static String alphaWord(String filenametxt) {
   // Write a method alphaWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the word that is alphabetically first.
  
    // I bring the meme into my work, wtf is wrong with me.

    int intLineNum = 0;
    int intCount;

    BufferedReader fileIn = new BufferedReader(new FileReader("words.txt"));

    while (!fileIn.eof()) {
      intLineNum++;
    }


    return "Happy";
  }
}