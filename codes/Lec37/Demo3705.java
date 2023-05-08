//the above example 3704 can be re-written in a much neater manner as follow:

import java.io.*;
public class Demo3705 {
   public static void main(String[] args) {
      String inFileStr = "test1.png";
      String outFileStr = "test2o.png";
      long startTime, elapsedTime;  // for speed benchmarking
 
      // Check file length
      File fileIn = new File(inFileStr);
      System.out.println("File size is " + fileIn.length() + " bytes");
 
      // "try-with-resources" automatically closes all opened resources.
      try (FileInputStream  in  = new FileInputStream(inFileStr);
           FileOutputStream out = new FileOutputStream(outFileStr)) {
 
         startTime = System.nanoTime();
         int byteRead;
         // Read a raw byte, returns an int of 0 to 255.
         while ((byteRead = in.read()) != -1) {
            // Write the least-significant byte of int, drop the upper 3 bytes
            out.write(byteRead);
         }
         elapsedTime = System.nanoTime() - startTime;
         System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}