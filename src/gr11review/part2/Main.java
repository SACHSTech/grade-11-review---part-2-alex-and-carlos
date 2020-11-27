package gr11review.part2;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    String strInput;
    String strOutput;

    System.out.println("Type a word");
    strInput = key.readLine();
    strOutput = Utility.zipzap(strInput);
    
    System.out.println(strOutput);
  }
}