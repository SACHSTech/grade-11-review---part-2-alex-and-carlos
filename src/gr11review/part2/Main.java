package gr11review.part2;

import java.io.*;

public class Main{
  public static void main (String[] args) throws IOException{

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // int intCombinedNum;
   // String strString;




    // use utility.R7 method
   //intCombinedNum = Utility.sumNumbers(strString);

    //System.out.println("Output: " + intCombinedNum);

    int[] intNumbers;
    int intAlone;
    int[] intReturn;
    int intLength;
    int intCount;

    System.out.println("How Long");
    intLength = Integer.parseInt(keyboard.readLine());
    System.out.println("");

    intNumbers = new int[intLength];
    intReturn = new int[intLength];

    for(intCount = 0; intCount < intLength; intCount++){
      System.out.println("Number");
      intNumbers[intCount] = Integer.parseInt(keyboard.readLine());
    }
    System.out.println("Alone?");
    intAlone = Integer.parseInt(keyboard.readLine());

    for(intCount = 0; intCount < intLength; intCount++){
      intReturn[intCount] = Utility.notAlone(intNumbers[] , intAlone);
      System.out.println(intReturn[intCount] + ", ");
    }

  }
}