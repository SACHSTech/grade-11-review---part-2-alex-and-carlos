package gr11review.part2;

import java.io.*;

public class Main{
  public static void main (String[] args) throws IOException{

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    Utility.diagonal(4);

    System.out.print("Input: ");
    String strString = keyboard.readLine();

    int intCombined = Utility.sumNumbers(strString);
    System.out.print("Output: " + intCombined);

    String strInputFiletxt = "words.txt";
    Utility.alphaWord(strInputFiletxt);

    int[] intNumbers;
    Boolean blnTrue;

    blnTrue = Utility.notAlone(Numbers, value);
    System.out.println(blnTrue);

    



  }
}