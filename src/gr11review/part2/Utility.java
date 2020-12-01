package gr11review.part2;

import java.io.*;

import org.graalvm.compiler.core.common.util.TypeWriter;

public class Utility {
  public static int sumNumbers(String strWord) {

     // here is what I'll do: 
    // create a loop that read entire sentence, when it finds a char that is a int, it registers into string variable to create a strings of integers. Then it starts to loop again but begins at the last time it read, if it finds a integer char variable, it'll start to loop and register the char variables behind.

    // I know, it's a pretty good idea, but it just don't work.

    // I tried using 

    // all of these didn't work just because the charAt is broke Aas Hecc
  
    int intCount;
    int inCount2;
    int intLength;

    String strSub1;
    String strSub2;

    char Char1;
    char Char2;

    intLength = strWord.length();
    System.out.print("There is " + intLength + " letters in this syntax");

    Char1 = strWord.charAt(intLength - 1);
    System.out.print(Char1);

  }
  public static String alphaWord(String filenametxt) {

   // Write a method alphaWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the word that is alphabetically first.
  
    // I bring the meme into my work, what is wrong with me.

    BufferedReader fileIn = new BufferedReader(new FileReader(filenametxt));

    String strWord;
    String strAlpha;
    int intCount;
    int intCheck;

    intLength = 0;
    strAlpha = "z";
    strWord = "";

    while(strWord != null){
      strWord = fileIn.readLine();
      intCheck = strAlpha.compareTo(strWord);
      if(intCheck < 0){
        strAlpha = strWord;
      }
    }

    fileIn.close();

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

    //Creat a for loop that create the first 

    int intArrayNum0;
    int intArrayNum1;
    int intArrayNum2;
    int intCount1;
    int intCount2;
    String strZeros = "0, ";
    String strOne = "1, ";
    String strTwos = "2, ";
    String strCombined = "";

    PrintWriter theout = new PrintWriter(new FileWriter("diagonalOut.txt", true));

    String[][] strNum = new String[n][0];

        //Thinking that String [0][0] is 0001, AN0 - 1
       // so [1][0] would be 0012, AN0 - 2
      // [2][0] would be 0122, AN0 - 3
     //Create the first loop just to read the entire array
    // set each individual arrays with their combined string.

      for (int intCount = 0; intCount < n; intCount++) {
        for (intCount1 = 0; intCount < n; intCount++) {

          intArrayNum0 = n - (intCount1 + 1);
          intArrayNum2 = n - (intCount1 - 1);

          for (intCount2 = 0; intCount < intArrayNum0; intCount2++){
            strCombined = strCombined + strZeros;
          }

          strCombined = strCombined + strOne;

          for (intCount2 = 0; intCount < intArrayNum2; intCount2++){
              strCombined = strCombined + strTwos;
            }
          }
        }
        strNum[inCount][0] = strCombined;
      }
    }
  }
}