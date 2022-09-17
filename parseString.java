/* 
  Parse Given String to get the field value
*/
import java.util.*; 
import java.io.*;
import java.net.*;

class Main {  
  public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
      try {
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();

        StringBuilder sb = new StringBuilder();
        for(int ch; (ch = inputStream.read()) != -1;){
          sb.append((char)ch);
        }
        
        System.out.println(parseStringByProperty(sb.toString()));  
        
      } catch (IOException ioEx) {
        System.out.println(ioEx);
      }
    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
  }  


  public static String parseStringByProperty(String jsonInput){
    int indexOfPoperty = jsonInput.lastIndexOf("hobbies");
    jsonInput = jsonInput.substring(indexOfPoperty);
    indexOfPoperty = jsonInput.indexOf("[");
    jsonInput = jsonInput.substring(indexOfPoperty + 1);
    return jsonInput = jsonInput.replaceAll("[\\]}\"]","")
                        .replaceAll("\\,",",").trim();
  } 
}
