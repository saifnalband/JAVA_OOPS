package Lec36;

public class Demo3601 extends Thread {
    public void run(){    
        for(int i=1;i<5;i++){   
        // the thread will sleep for the 500 milli seconds   
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }  
    public static void main(String arg[]){
        Demo3601 t1 = new Demo3601();
        Demo3601 t2 = new Demo3601();

        t1.start();
        t2.start();
    }
}
