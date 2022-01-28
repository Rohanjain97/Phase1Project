package simlilearn;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendString {
   public static void main( String[] args ) {

      try {
         String data = " MY name is rohan";
         File f1 = new File("C:\\Users\\Smart 'X' Computers\\eclipse-workspace\\assignment\\src\\com\\rohan\\append.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}