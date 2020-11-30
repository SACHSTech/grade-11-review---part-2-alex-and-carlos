package gr11review.part2;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    String strLong;
    String strInput;
    String strOutput;

    System.out.println("Input");
    strInput = key.readLine();
    strOutput = Utility.zipzap(strInput);
    System.out.println(strOutput);


    strLong = Utility.longestWord("src/gr11review/part2/test.txt");
    System.out.println(strLong);

    // int[] intNum;
    // int[] intOutput;
    int intCount;
    // int intLength;

    // System.out.println("How many numbers?");
    // intLength = Integer.parseInt(key.readLine());

    // intNum = new int[intLength];
    // intOutput = new int[intLength];

    // for(intCount = 0; intCount < intLength; intCount++){
    //   System.out.println("Enter number");
    //  intNum[intCount] = Integer.parseInt(key.readLine());
    //}

   // for(intCount = 0; intCount < intLength; intCount++){
   //   intOutput[intCount] = Utility.tenRun(intNum)[intCount];
    //  System.out.print(intOutput[intCount] + " ");
   // }

   int[] in;
   int[] out;
   boolean istrue;

   in = new int[3];
   out = new int[6];

   for(intCount = 0; intCount < 3; intCount++){
     System.out.println("Number for inner");
     in[intCount] = Integer.parseInt(key.readLine());
   }
   for(intCount = 0; intCount < 6; intCount++){
     System.out.println("Number for outer");
     out[intCount] = Integer.parseInt(key.readLine());
   }
   
   istrue = Utility.linearIn(out , in);
   System.out.println(istrue);
  }
}