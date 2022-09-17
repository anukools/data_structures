/* JAVA code : Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a
space-separated sequence of one or more dictionary words.*/
import java.util.*; 
import java.io.*;
  
  class HelloWorld {
    public static void main(String[] args) {
        System.out.println(wordSplit(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
    }
    

public static String wordSplit(String[] arg) {
  List<String> inputList = Arrays.asList(arg);
  String wordToSplit = inputList.get(0);
  int inputLength = wordToSplit.length();
  String dict = inputList.get(1);
  List<String> parsedDict = Arrays.asList(dict.split(","));
  
   for(int i=1;i<inputLength;i++) {
      String first = wordToSplit.substring(0,i);
      String last = wordToSplit.substring(i, inputLength);
      
      if(parsedDict.contains(first) && parsedDict.contains(last)){
          return first + "," + last;
      }

  
    }
    return "not possible";
  }
}
