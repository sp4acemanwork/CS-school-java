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
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;    

    public simplecalc(){
        f= new JFrame("simple calc");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        Rectangle x= f.getContentPane().getBounds();
        int w= x.width;
        int h= x.height;
         //f.getContentPane().setBackground();
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        b1 = new JButton("add");
        b1.setBounds(15,h/2+25,100,25);
        f.add(b1);
        b2 = new JButton("subtract");
        b2.setBounds(130,h/2+25,100,25);
        f.add(b2);
        b3 = new JButton("multiply");
        b3.setBounds(15,h/2+75,100,25);
        f.add(b3);
        b4 = new JButton("divide");
        b4.setBounds(130,h/2+75,100,25);
        f.add(b4);
        b5 = new JButton("clear");
        b5.setBounds(w/8,h/2+120,100,25);
        f.add(b5);

       
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });




    }



    public static void main(String[] args) throws Exception {
       new simplecalc();
    }
}
