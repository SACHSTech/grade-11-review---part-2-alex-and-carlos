package gr11review.part2;

import java.io;
import java.io.BufferedReader;

import org.graalvm.compiler.core.common.util.TypeWriter;

public class Utility {
  public static int sumNumbers(String strWord) {

    // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.

    // I know, it's a pretty good idea, but it just don't work.

    // all of these didn't work just because the charAt is broke AH
  
    int intCount;
    int inCount2;
    int intLength;

    String strSub1;
    String strSub2;

    char Char1;
    char Char2;

    intLength = strWord.length();
    System.out.print("There is " + intLength + " letters in this syntax");

    for (intCount = 0; intCount < intLength; intCount++){
      
      strSub1 = strWord.substring(intCount , intCount + 1); 
      
      Char1 = strSub1.charAt(intCount);
      System.out.print(Char1);

      
    }
  }
  public static String alphaWord(String filenametxt) {

   // Write a method alphaWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the word that is alphabetically first.
  
    // I bring the meme into my work, what is wrong with me.

    int intLineNum = 0;
    int intCount;

    BufferedReader fileIn = new BufferedReader(new FileReader("src/gr11review/part2/words.txt"));

    while (!fileIn.eof()) {

      intLineNum++;

    }

    fileIn.close();
    fileIn = new BufferedReader(new FileReader("src/gr11review/part2/words.txt"));

    for (intCount = 1; intCount < intLineNum; intCount++) {

      String strLetter = FileIn.readLine();
      charLetter = strLetter.charAt(intCount);

    }

    return "Happy";
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

    for (intCount = 0; intArray != null; intCount++) {
      intCombined = intCombined + num[intCount];
    }

    if (intCombined %2 != 0) {
      return false;
    }else if (intCombined %2 == 0) {
      return true;
    }
  }
  public static void diagonal(int n) {
    
    /* Given an integer n, write a method diagonal(int n) that outputs to a text file diagonalOut.txt, a two-dimensional array of size (n×n) populated as follows, with a comma between each number: */

    // The positions on the minor diagonal (from the upper right to the lower left corner) receive 1 .
    // The positions above this diagonal receive 0 .
    // The positions below the diagonal receive 2 .
    // Signature public static void diagonal(int n) 

    PrintWriter theout = new PrintWriter(new FileWriter("diagonalOut.txt", true));

    String[][] strNum;

    strNum
    

  }
  
}