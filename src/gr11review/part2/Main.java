package gr11review.part2;

import java.io.*;

public class Main{
  public static void main (String[] args) throws IOException{

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    int intCombinedNum;
    String strString;

    System.out.print("Input: ");
    strString = keyboard.readLine();

    // use utility.R7 method
    intCombinedNum = Utility.sumNumbers(strString);

    System.out.println("Output: " + intCombinedNum);
  }
}