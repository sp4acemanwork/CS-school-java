import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
//import java.util.EventListener;


public class App implements ActionListener{
   
    JButton b1 = new JButton("Button1");
    JButton b2 = new JButton("Button2");
    JButton b3 = new JButton("Button3");
    JFrame f = new JFrame("textReader");
    JTextArea t = new JTextArea();
    JPanel p;
    JPanel p2;


    
    
    public App(){
    
        
    
    f.setSize(600,600);
        
    
        
        
        
        Rectangle x = f.getBounds();
        int width , height , buttonW,buttonH;
    
       
        width = x.width;
        height = x.height;
        buttonH=200;
        buttonW=200;
        
    
    p =new JPanel();
    
    
    LayoutManager boxlayout = new BoxLayout(p, BoxLayout.X_AXIS);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    p.setLayout(boxlayout);
    p.setBorder(new EmptyBorder(new InsetsUIResource(width/4, height/4, height/4, width/4)));
    
    p.add(b1);
    p.add(Box.createRigidArea(new Dimension(0,70)));
    p.add(b2);
    p.add(Box.createRigidArea(new Dimension(0,70)));
    p.add(b3);
    f.add(p);
    f.setVisible(true);
  
  
  
  
  
  
   
    
    
    


    
    
        
        
        
        
        File textFile = new File("src/text.txt");
        if (textFile.exists()){
        System.out.println("this is working");
        }else{
            System.out.println("not working");
        
        
        
        
        
        
        }
    
    
    
      


    }


    public void actionPerformed(ActionEvent event){

            
    }




    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
            App x =new App(); 
       
            
            
            
            
            
            }










        
    }

