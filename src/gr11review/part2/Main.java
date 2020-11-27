package gr11review.part2;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws IOException{
    String strLongest;

    strLongest = Utility.longestWord("test.txt");

    System.out.println(strLongest);
  }
}