

import javax.swing.*;
import java.awt.*;


public class pr7 {
    JFrame f;
    JTable table;
    JScrollPane sc;

    public pr7(){
        
        // creates frame 
        f= new JFrame("java tables");
        f.setSize(400,400);
      
        f.setVisible(true);
        // gets bonds of created frame 
        /*Rectangle  x =  f.getContentPane().getBounds();
        int w = x.width;
        int h = x.height;*/

        //array for items
        String colums[] = {"Game","Cost","quantity"};
        // 2d array data
        String tableString [][]={
                                {"dark souls","60$","10"},
                                {"Half life 2","30$","2"},
                                {"Call of duty","60$","30"}
        };
        table = new JTable(tableString,colums);
        table.setBounds(10,10,10,10);
        sc =new JScrollPane(table);
        
        f.add(sc);
        f.repaint();
        
        

        
    }



    public static void main(String[] args) throws Exception {
        new pr7();
    }
}
