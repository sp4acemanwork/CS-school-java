import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class simplecalc {
    JFrame f;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel tiads;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;    

    public simplecalc(){
    //------------------frame setup--------------------
        f= new JFrame("simple calc");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        Rectangle x= f.getBounds();
        int w= x.width;
        int h= x.height;
         //f.getContentPane().setBackground();

//---------------------lables/text area--------------------

l1 = new JLabel("num 1");
l1.setBounds(15,h-h,100,25);
//
t1= new JTextField("");
t1.setBounds(15,h-h+25,100,25);
//
tiads = new JLabel("?"); // litle touch to add some polish 
tiads.setBounds(120,h-h+25,10,25);
//
l2 = new JLabel("num 2");
l2.setBounds(130,h-h,100,25);
//
t2= new JTextField("");
t2.setBounds(130,h-h+25,100,25);
//
l3 = new JLabel("result");
l3.setBounds(250,h-h,100,25);
//
t3= new JTextField();
t3.setBounds(250,h-h+25,100,25);
//

f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(tiads);



//---------------------buttons------------------------------
        b1 = new JButton("add");
        b1.setBounds(15,h-h+50,100,25);
        f.add(b1);
        b2 = new JButton("subtract");
        b2.setBounds(130,h-h+50,100,25);
        f.add(b2);
        b3 = new JButton("multiply");
        b3.setBounds(15,h-h+100,100,25);
        f.add(b3);
        b4 = new JButton("divide");
        b4.setBounds(130,h-h+100,100,25);
        f.add(b4);
        b5 = new JButton("clear");
        b5.setBounds(w/8,h-h+145,100,25);
        f.add(b5);
//----------------------------------------------------
       
        // add event
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                double result = num1+ num2; 
                t3.setText(""+result);
                tiads.setText("+");
                


            }
        });
        // sub event
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                double result = num1- num2;
                t3.setText(""+result);
                tiads.setText("-");
                
            }
        });
        //multiply event
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());  
                double result = num1* num2;
                t3.setText(""+result);
                tiads.setText("*");
            }
        });
        //divide event
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                double result = num1/ num2;
               t3.setText(""+result);
               tiads.setText("/");
            }
        });
        // clear event 
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            t3.setText("");
            t2.setText("");
            t1.setText("");
            tiads.setText("?");
            
            }
        });




    }



    public static void main(String[] args) throws Exception {
       new simplecalc();
    }
}
