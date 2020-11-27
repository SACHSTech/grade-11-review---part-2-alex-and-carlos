package gr11review.part2;
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Utility{

  public static String zipzap(String strInput){
    // Create a method that for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    String strSub;
    String strPart;
    String strLetter1;
    String strLetter3;
    String strReturn;
    int intCount;
    int intNextCount;
    int intLength;

    intLength = strInput.length();
    intNextCount = 2;
    strReturn = "";
    strPart = "";
    strReturn = strInput;

    for(intCount = 0; intCount < intLength; intCount++){
      intNextCount = intNextCount + 1;
      strSub = strInput.substring(intCount, intNextCount);
      strLetter1 = strSub.substring(0 , 1);
      strLetter3 = strSub.substring(2 , 3);
      if(strLetter1.equalsIgnoreCase("z") && strLetter3.equalsIgnoreCase("p")){
        strPart = strLetter1 + strLetter3;
        strReturn = strReturn.replace(strSub , strPart);
      }
     
      if(intNextCount == intLength){
        break;
      }
    }

    return strReturn;
  }
  public static String longestWord(String filenametxt){
    // Write a method longestWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the longest word in the file.
    File textfile = new File(filenametxt);
    Scanner reader = new Scanner(textfile);

    String strWord;
    String strLongest;
    int intLength;
    int intLongest;

    while(textfile.hasNextLine()){
      strWord = reader.nextLine();
      intLength = strWord.length();
      if(intLongest < intLength){
        strLongest = strWord;
        intLongest = strLongest.length();
      }
    }
    reader.close();
    return strLongest;

  }
}