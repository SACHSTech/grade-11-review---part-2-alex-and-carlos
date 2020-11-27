package gr11review.part2;

public class Utility {
  // Create a method that for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

  public static String zipzap(String strInput){
    String strSub;
    String strReturn;
    String strLetter1;
    String strLetter3;
    int intCount;
    int intNextCount;
    int intLength;

    intLength = strInput.length();
    intNextCount = 2;
    strReturn = "";

    for(intCount = 0; intCount < intLength; intCount++){
      intNextCount = intNextCount + 1;
      strSub = strInput.substring(intCount, intNextCount);
      strLetter1 = strSub.substring(0 , 1);
      strLetter3 = strSub.substring(2 , 3);
      if(strLetter1.equalsIgnoreCase("z") && strLetter3.equalsIgnoreCase("p")){
        strReturn = strLetter1 + strLetter3;
      }
    }

    return strReturn;
  }
    
}