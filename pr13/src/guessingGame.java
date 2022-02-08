import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class guessingGame {
    private double  rand;
    private int trys, num1,num2;
    JFrame f;
    JTextField t1;
    JTextField t2;
    
    JLabel l1;
    JLabel l2;
    
    
    JButton b1;
    JButton b2;
   

    public guessingGame(){
    //------------------frame setup--------------------
        f= new JFrame("guessing game");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        Rectangle x= f.getBounds();
        int w= x.width;
        int h= x.height;
         //f.getContentPane().setBackground();

//---------------------lables/text area--------------------

l1 = new JLabel("make a guess");
l1.setBounds(15,h-h+25,100,25);
//
t1= new JTextField("");
t1.setBounds(130,h-h+25,100,25);
//

//
l2 = new JLabel("Enter a number");
l2.setBounds(240,h-h+25,200,25);
//

//


f.add(l1);
f.add(l2);

f.add(t1);






//---------------------buttons------------------------------
        b1 = new JButton("Guess");
        b1.setBounds(w/8,h-h+120,100,25);
        f.add(b1);
        
        
        b2 = new JButton("New game");
        b2.setBounds(w/8,h-h+150,100,25);
        f.add(b2);

//----------------------------------------------------

        // guess event 
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            num1 = Integer.parseInt(t1.getText());
            
            

               if(num1>num2){
                    l2.setText("guess lower");
                    trys +=1;
               }else if (num1<num2) {
                   l2.setText("guess higher");
                   trys +=1;
               } else if(num1==num2) {
                    trys +=1;
                   l2.setText("You Win!!! it took you " + trys + " trys");
               } else{
                   l2.setText("ERROR");
               }
            }
            
        });
        // new game event
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                l2.setText("make a guess");
                rand = Math.random()*100;
                num2 = (int) rand;  
            }
        });




    }



    public static void main(String[] args) throws Exception {
       new guessingGame();
    }
}
