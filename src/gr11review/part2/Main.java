package gr11review.part2;

import java.io.*;

public class Main{
  public static void main (String[] args) throws IOException{

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


    String strOutput;

    strOutput = Utility.alphaWord("src/gr11review/part2/words.txt");

    System.out.println(strOutput);

    int[] intNumbers;
    int intAlone;
    int[] intReturn;
    int intLength;
    int intCount;


    intNumbers = new int[5];
    intReturn = new int[5];

    intNumbers[0] = 3;
    intNumbers[1] = 1;
    intNumbers[2] = 9;
    intNumbers[3] = 5;
    intNumbers[4] = 2;

    
    intReturn = Utility.notAlone((new int[]{1,2,3}) , 2);
      
    for(intCount = 0; intCount < 3; intCount ++){
      System.out.println(intReturn[intCount] + ", ");
    }

  }
}