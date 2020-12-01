package gr11review.part2;
import java.io.*;

public class Utility {
  public static int sumNumbers(String strWord) {

    // Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    int intCount;
    int intCount2;
    int intLength;
    char charSub;
    char charSub2;
    boolean isNum;
    int intNum;
    int intTotal;
    String strNum;
    String strNum2;

    intLength = strWord.length();
    intTotal = 0;
    
    for(intCount = 0; intCount < intLength; intCount++){
      charSub = strWord.charAt(intCount);
      
      isNum = Character.isDigit(charSub);

      if(isNum == true){
        strNum = Character.toString(charSub);

        for (intCount2 = intCount + 1; intCount2 < intLength; intCount2 ++ ) {
          charSub2 = strWord.charAt(intCount2);
          isNum = Character.isDigit(charSub2);
          if (isNum == true){
            strNum2 = Character.toString(charSub2);
            strNum = strNum + strNum2;
            
          }else if(isNum == false) {
            break;
          }
        }
        
         intCount = intCount2;
        
         intNum = Integer.parseInt(strNum);
         System.out.println("strNum = " + strNum);
        
         intTotal = intTotal + intNum;
         System.out.println("Total: "  + intTotal);
      }
      
      
    }
    return intTotal;
  }
  
  public static String alphaWord(String filenametxt) throws IOException {

   // Write a method alphaWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the word that is alphabetically first.
  
    // I bring the meme into my work, what is wrong with me.

    BufferedReader fileIn = new BufferedReader(new FileReader(filenametxt));

    String strWord;
    String strAlpha;
    int intCheck;

    strAlpha = "Lorem";
    strWord = "";

    while(strWord != null){
      strWord = fileIn.readLine();
      if(strWord == null){
        break;
      }
      intCheck = strAlpha.compareToIgnoreCase(strWord);
      if(intCheck > 0){
        strAlpha = strWord;
      }
      
    }
    return strAlpha;
  }
  public static int[] notAlone(int[] nums, int value) {

    // We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

    int[] intReturn;
    int intCount;
    int intLength;
    int intSub;
    int intLeft;
    int intRight;

    intLength = nums.length;
    intReturn = new int[intLength];

    for(intCount = 1; intCount < intLength - 1; intCount++){
      intSub = nums[intCount];
      if(intSub == value){
        // check the numbers to its left and right
        intLeft = nums[intCount - 1];
        intRight = nums[intCount + 1];
        // see which one is higher
        if(intLeft < intRight){
          // replace nums[intCount] with the higher number
          intReturn[intCount] = intRight;
        }else{
          intReturn[intCount] = intLeft;
        }
        
      }else{
        intReturn[intCount] = nums[intCount];
      }
    }

    return intReturn;
  }
  public static boolean canBalance(int[] nums) {

    // Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
    
    int intCount;
    int intCombined = 0;
    int[] intArray = nums;
    boolean returnTrue;
    returnTrue = true;

    for (intCount = 0; intArray != null; intCount++) {
      intCombined = intCombined + nums[intCount];

      if (intCombined % 2 != 0) {
      returnTrue = false;
      }else if (intCombined % 2 == 0) {
      returnTrue = true;
      }
    }
    return returnTrue;
  }

  public static void diagonal(int n) throws IOException {
  // Given an integer n, write a method diagonal(int n) that outputs to a text file diagonalOut.txt, a two-dimensional array of size (n×n) populated as follows, with a comma between each number:

  // The positions on the minor diagonal (from the upper right to the lower left corner) receive 1 .
  // The positions above this diagonal receive 0 .
  // The positions below the diagonal receive 2 .

  int[][] intDiagonal;
  int intCount;
  int intCount2;
  int intLine = 0;

  intDiagonal = new int[n][n];

// column number start from furthest right
  for(intCount = n - 1; intCount >= 0; intCount --){
    // Row number start from top
    for(intCount2 = 0; intCount2 < n; intCount2 ++){
      intDiagonal[intLine][intCount] = 1;
      if(intCount2 > intLine){
        intDiagonal[intCount2][intCount] = 2;
      }else if(intCount2 < intLine){
        intDiagonal[intCount2][intCount] = 0;
      }
    }
    intLine = intLine + 1;
  }

  PrintWriter Output = new PrintWriter(new FileWriter("src/gr11review/part2/diagonalOut.txt"));

  for(intCount2 = 0; intCount2 < n; intCount2++){
    for(intCount = 0; intCount < n; intCount++){
      Output.print(intDiagonal[intCount2][intCount] + ", ");
    }
    Output.println("");
  }

  Output.close();

  }
}
