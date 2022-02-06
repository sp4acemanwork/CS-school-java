import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;


public class pr8 {
    JFrame f;
    DefaultListModel<String> L1;
    JList<String> list;

    public pr8(){
        f= new JFrame("progject 8: lists");
        f.setSize(400,400);
        f.setLayout(null);
        Rectangle x = f.getBounds();
        int w = x.width;
        int h = x.height;
        f.setVisible(true);
        L1= new DefaultListModel<String>();
        L1.addElement("xbox");
        L1.addElement("iphone");
        L1.addElement("tesla");
        L1.addElement("nintendo swithc");
        L1.addElement("gucchi");
        L1.addElement("starbucks");
        list = new JList<String>(L1);
        list.setBounds(w/2-50,h/2-50,100,100);
        f.add(list);


    }




    public static void main(String[] args) throws Exception {
        new pr8();
    }
}
