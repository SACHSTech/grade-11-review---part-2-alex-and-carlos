package gr11review.part2;

import java.io.*;

import com.sun.jmx.mbeanserver.Util;

public class Main{
  public static void main (String[] args) throws IOException{

    BufferedReader keyboard = new BufferedReader(new BufferedInputStreamReader(System.in));

    int intCombinedNum;
    String strString;

    System.out.print("Input: ");
    strString = keyboard.readLine();

    // use utility.R7 method
    intCombinedNum = Utility.R7(strString);

    System.out.println("Output: " + intCombinedNum);
  }
}