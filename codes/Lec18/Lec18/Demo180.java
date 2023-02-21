import java.io.*; 
class Demo180{
    public static void main(String args[]) throws Exception{
        File file = new File("ReadMe.txt"); 
        BufferedReader rd = new BufferedReader(new FileReader(file));
        String line;

        while((line = rd.readLine()) != null){
            System.out.println(line);
        }
        rd.close();
    }
}