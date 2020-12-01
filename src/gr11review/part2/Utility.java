package gr11review.part2;
import java.io.*;

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

  public static String longestWord(String filenametxt) throws IOException{
    BufferedReader reader = new BufferedReader(new FileReader(filenametxt));
    // Write a method longestWord(String filenametxt) such that given the name of a file filenametxt that contains a single word on each line, returns the longest word in the file.
    
    String strWord;
    String strLongest;
    int intLength;
    int intLongest;

    intLongest = 0;
    strLongest = "";
    strWord = "";
    intLength = 0;
    
    while(strWord != null){
      strWord = reader.readLine();
      intLength = strWord.length();
      if(intLongest < intLength){
        strLongest = strWord;
        intLongest = strLongest.length();
      }
    }

    reader.close();
    return strLongest;
  }
  
  public static int[] tenRun(int[] nums){
    // For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    int intSub;
    int[] intReturn;
    int intLength;
    int intCount;
    int intCount2;
    int intTen;
    int intCheck;

    intLength = nums.length;
    intCount2 = 0;
    intReturn = new int[intLength];

    for(intCount = 0; intCount < intLength; intCount++){
      intSub = nums[intCount];
      intTen = intSub % 10;
      if(intTen == 0){
        intReturn[intCount] = intSub;
        intCount2 = intCount;
        intTen = 1;
        while(intTen != 0){
          intCount2 = intCount2 + 1;
          if(intCount2 >= intLength){
            intCount = intCount2;
            break;
          }
          intCheck = nums[intCount2];
          intTen = intCheck % 10;
          if(intTen != 0){
            intReturn[intCount2] = intSub;
          }else if(intTen == 0){
            intCount = intCount2 - 1;
            break;
          }
        }
      }else{
        intReturn[intCount] = nums[intCount];
      }
    }

    return intReturn;
  }

  public static boolean linearIn(int[] outer, int[] inner){
    // Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
    int intCount;
    int intCountIn;
    boolean isTrue;
    int intLengthIn;
    int intLengthOut;
    int intIn;
    int intOut;
    int[] intCheck;

    intLengthIn = inner.length;
    intLengthOut = outer.length;
    intCountIn = 0;
    intCheck = new int[intLengthIn];

    for(intCount = 0; intCount < intLengthOut; intCount++){
      intOut = outer[intCount];
      intIn = inner[intCountIn];
      if(intIn == intOut){
        intCheck[intCountIn] = inner[intCountIn];
        intCountIn = intCountIn + 1;
      }

      if(intCountIn >= intLengthIn){
        break;
      }
      
    }

    intCountIn = 0;

    for(intCount = 0; intCount < intLengthIn; intCount++){
      if(intCheck[intCount] == inner[intCount]){
        intCountIn = intCountIn + 1;
      }
    }

    if(intCountIn == intLengthIn){
      isTrue = true;
    }else{
      isTrue = false;
    }

    return isTrue;
  }
  
  public static void pascalTri(int i, int j) throws IOException{
    // The first row are the numbers in p[0], p[0], p[0],..., p[0]
    // The familiar Pascal triangle is the triangle of numbers with p[0] as vertex and the set of numbers p[0], p[1], p[2], p[3], ..., p[9] as base.
    // Note that p[0] is always 1, and that any other number is obtained by adding two of its neighbours: the one above and the one to its left.
    // The number 15 for example is 5+10 (or 10+5, depending on which 15 you found)
    // Write a method pascalTri(int i, int j) that outputs to a text file pascalOut.txt, a comma separted table containing i rows and j columns of pascal's triangle. Be sure to use two-dimensional array in your solution.

    PrintWriter Output = new PrintWriter(new FileWriter("src/gr11review/part2/Pascal.txt" , true));

    int intCount;
    int intCount2;
    int intAns;
    int intRow;
    int intNext;
    int intPrevAns;
    int intNumNext;
    int[][] intNumbers;

    intAns = 1;
    intRow = 0;
    intNext = 1;
    intPrevAns = 1;
    intNumbers = new int[i][j];

    for(intCount = 0; intCount < j; intCount++){
      intNumbers[0][intCount] = intAns;
    }

    for(intCount = 1; intCount < i; intCount++){
      intNext = 1;
      intPrevAns = 1;
      for(intCount2 = 0; intCount2 < j; intCount2++){
        intNumNext = intNumbers[intRow][intNext];
        intAns = intPrevAns + intNumNext;
        if(intCount2 == 0){
          intNumbers[intCount][intCount2] = 1;
        }else{
          intNumbers[intCount][intCount2] = intAns;
          intNext = intNext + 1;
          intPrevAns = intAns;
        }
      }
      intRow = intRow + 1;
    }

    for(intCount = 0; intCount < i; intCount++){
      for(intCount2 = 0; intCount2 < j; intCount2++){
        Output.print(intNumbers[intCount][intCount2] + ", ");
      }
      Output.println("");
    }
    Output.close();
  }
  
}