
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class pr6 {
    JFrame f;
    JComboBox<String> box;
    JButton b;
    JLabel l;
    JLabel imageLabel; // object used for displaying the image 
    

    
    
    
    
    public pr6(){
        f= new JFrame("progject 6:Combo box");
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        // gets bounds of frame 
        Rectangle x = f.getContentPane().getBounds();
        int w = x.width;
        int h = x.height;
        // creates image object 
        

        // creates combo box object creates problems when adding to screen
        String items[] = {"item 1","item 2","item 3","item 4"};
        box = new JComboBox<String>(items);
        box.setBounds(w/2-50,h/2-10,100,20);
        
        //creates button object 
        b = new JButton("select");
        b.setBounds(w/2-50,h*3/4-25,100,25);
        
        
        l = new JLabel("please select a item");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(w/2-100,h/2-60,200,20);
        
        
        
        
        
        f.add(b);
        f.add(l);
        f.add(box);

      
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           
           
            String data =box.getItemAt(box.getSelectedIndex());
           l.setText("Item selected: "+ data);
           
            
            
            
            
            imageLabel = new JLabel();
        }

    });









    }

    public static void main(String[] args){
        new pr6();
    }
}
