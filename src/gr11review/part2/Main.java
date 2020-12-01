package gr11review.part2;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int n;
    System.out.println("n");
    n = Integer.parseInt(key.readLine());
    Utility.diagonal(n);

  }
}