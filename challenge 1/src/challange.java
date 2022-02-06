import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.*;
import java.awt.event.*;
 

public class challange {
    JFrame f; 
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2;

    
    
    public challange(){
        f = new JFrame("simple calc");
        f.setSize(800,600);
        Rectangle x = f.getContentPane().getBounds();
        int h = x.height;
        int w = x.width;
        f.setVisible(true);
        l2 = new JLabel("");
        l2.setBounds(w/2,h/2,100,50);
        f.add(l2);
        
        l3 = new JLabel("");
        l3.setBounds(w/2,h/2,100,50); 
        f.add(l3);
        
        l1 = new JLabel("");
        l1.setBounds(w/2,h/2,100,50); 
        f.add(l1);
        




    }
    
    public static void main(String[] args) throws Exception {
        new challange();
    }
}
