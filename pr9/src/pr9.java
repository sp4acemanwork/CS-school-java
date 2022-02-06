import javax.swing.*;
//import javax.swing.plaf.MenuBarUI;

import java.awt.event.*;
import java.awt.*;


public class pr9 {

    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll,New,Open,save;
    JTextArea ta;

    public pr9(){
        f=new JFrame("progject 9: menu items");
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.green);

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("SelectAll");
        New = new JMenuItem("new");
        save= new JMenuItem("save");
        Open= new JMenuItem("open");

        mb = new JMenuBar();
        file =new JMenu("file");
        edit =new JMenu("edit");
        help =new JMenu("help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        file.add(New);
        file.add(Open);
        file.add(save);

        mb.add(file);
        mb.add(edit);
        mb.add(help);
       
        f.add(mb);
        f.setJMenuBar(mb);

        New.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

            }
        });

        Open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

            }
        });

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

            }
        });

        cut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }


        });

        
        copy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }


        });


        paste.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }


        });

        selectAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }


        });
        
        
        
    }



    public static void main(String[] args) throws Exception {
        new pr9();
    }
}
