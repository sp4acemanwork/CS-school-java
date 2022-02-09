import javax.swing.*;

//import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;
//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Random;
//import java.util.function.Function;

public class nftShapes {



JFrame f;
JButton b;


private String testRgb,testBoudns;



public nftShapes(){
    f =new JFrame ("nftShapes");
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    b =new JButton("new nft");
    b.setBounds(0,525,600,37);
    f.add(b);



    int rgb[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // not needed 

    int boundData[] = {Randomizer(100),Randomizer(100),Randomizer(200),Randomizer(200)}; // not needed
    //int test[] = {100,100,200,200}; for testing 
    testRgb =Arrays.toString(rgb) ;
    testBoudns = Arrays.toString(boundData);

    // ------------------------------ canvas setup ------------------------------
    Canvas c = new Canvas(){
        public void paint(Graphics g){ // all functions are useing internal randomizers
            createBox(boundData, true, rgb, g);
            createBox(boundData, false, rgb, g);
            createBox(boundData, true, rgb, g);
            createBox(boundData, false, rgb, g);
            createCirc(boundData, true, rgb, g);
            createCirc(boundData, false, rgb, g);
            createCirc(boundData, true, rgb, g);
            createCirc(boundData, false, rgb, g);
            createArc(boundData, true, rgb, 0, 0, g);
            createArc(boundData, false, rgb, 0, 0, g);
            createArc(boundData, true, rgb, 0, 0, g);
            createArc(boundData, false, rgb, 0, 0, g);

            
        }
    };
    // useint layouts so bounds must be set
    
    ;
    c.setBounds(0,0, 600, 500);
    f.add(c);
    //--------------------------- create and adding button ---------------------
    
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){// refreshes canvas
        c.repaint();
        }
    });



//-------------------------------------- sudo code ---------------------------------------
    // SUDO CODE 
    /* this programm functions by useing classes to create graphics objects 
    then randomizes the paramiters useing the Math.random funtion 
    seting possition is tbh wether or not that will randomized as well */



    }
//---------------------------------- randomizer func --------------------------
    public int Randomizer(int x){
        return  (int) (Math.random()*x+1);
    }
//------------------------------------- more sudo code ---------------------------
    // class for createing a box
    // bound data order width,height,x,y was going to create an object for this but 
    //that requires a new class and more files and im to layzy for that 

    //-------------------------create rect object--------------------------
    private void createBox(int[]boundData,boolean f,int[] c ,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled circle if not true make a holo circle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else{// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }


        }



    //-----------------------------------create Circ object --------------------
    private void createCirc(int[]boundData,boolean f,int[] c ,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled circle if not true make a holo circle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else{// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }


        }

    // class for createing a arch
    private void createArc(int[]boundData,boolean f,int[]c,int start,int angle,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values
        
        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled circle if not true make a holo circle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180)); 

            }else{// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180));

            }


        }





    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //new nftShapes();
        nftShapes x = new nftShapes();
        //new nftShapes();
        System.out.print(""+x.testRgb+" "+x.testBoudns);
    }
}
