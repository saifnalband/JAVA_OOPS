/*
 * 
 * Copying a file with Buffered Streams. another way
 */
import java.io.*;
public class Demo3708 {
   public static void main(String[] args) {
      String inFileStr = "tes1.png";
      String outFileStr = "testo5.png";
      long startTime, elapsedTime;  // for speed benchmarking
 
      // Check file length
      File fileIn = new File(inFileStr);
      System.out.println("File size is " + fileIn.length() + " bytes");
 
      try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
           BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr))) {
         startTime = System.nanoTime();
         int byteRead;
         while ((byteRead = in.read()) != -1) {
            out.write(byteRead);
         }
         elapsedTime = System.nanoTime() - startTime;
         System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}
