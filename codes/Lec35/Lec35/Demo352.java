import javax.swing.*;  
public class Demo352 extends JFrame{//inheriting JFrame 
    JFrame f;  
    Demo352(){  
        JButton b = new JButton("click");//create button  
        b.setBounds(130,100,100, 40);  
          
        add(b);//adding button on frame  
        setSize(400,500);  
        setLayout(null);  
        setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }  
    public static void main(String[] args) {  
        new Demo352();  
    }
} 