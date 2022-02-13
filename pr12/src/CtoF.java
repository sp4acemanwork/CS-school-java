import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CtoF {
    JFrame f;
    JTextField t1;
    JTextField t2;
    
    JLabel l1;
    JLabel l2;
    
    
    JButton b1;
    JButton b2;
   

    public CtoF(){
    //------------------frame setup--------------------
        f= new JFrame("fer to cel");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        Rectangle x= f.getBounds();
        //int w= x.width;
        int h= x.height;
         //f.getContentPane().setBackground();

//---------------------lables/text area--------------------

l1 = new JLabel("Ferignhight");
l1.setBounds(15,h-h+25,100,25);
//
t1= new JTextField("");
t1.setBounds(130,h-h+25,100,25);
//

//
l2 = new JLabel("tempiture");
l2.setBounds(15,h-h+75,100,25);
//
t2= new JTextField("");
t2.setBounds(130,h-h+75,100,25);
//


f.add(l1);
f.add(l2);

f.add(t1);
f.add(t2);





//---------------------buttons------------------------------
        b1 = new JButton("fahrenheit");
        b1.setBounds(15,h-h+120,100,25);
        f.add(b1);
        b2 = new JButton("celsius");
        b2.setBounds(130,h-h+120,100,25);
        f.add(b2);

//----------------------------------------------------
       
        // fer event
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(t2.getText());
                
                double result = num1; 
                l1.setText("Ferignhight");
                t1.setText(""+result);
                
             
                


            }
        });
        // cel event 
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(t2.getText());
                
                double result = (num1-32)*(0.5556);
                l1.setText("Celsius");
                t1.setText(""+result);
                
                
            }
        });



    f.repaint();
    }



    public static void main(String[] args) throws Exception {
       new CtoF();
    }
}