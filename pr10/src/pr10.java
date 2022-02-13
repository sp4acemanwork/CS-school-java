//import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;






public class pr10 {
    JFrame f;
    JButton b;
    Container c;   
   public pr10(){
       f= new JFrame("project 10");
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
   b= new JButton("Color");
   f.add(b);
   b.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
        Color intColor=Color.white;
        Color color =JColorChooser.showDialog(null, "chose a color", intColor);
        f.getContentPane().setBackground(color);
       }
   });  


   f.repaint();

   }


    






    public static void main(String[] args) throws Exception {
        new pr10();
    }
}
