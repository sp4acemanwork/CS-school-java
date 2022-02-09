import javax.swing.*;

//import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;
//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Random;
//import java.util.function.Function;

public class nftFace {



JFrame f;
JButton b;


private String testRgb,testBoudns;



public nftFace(){
    f =new JFrame ("nftface");
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    b =new JButton("new nft");
    b.setBounds(0,525,600,37);
    f.add(b);



    int rgb[] = {255,0,0}; // not needed 

    int boundData[] = {100,100,100,100};
    int boundData2[] = {100,100,200,200}; // not needed
    //int test[] = {100,100,200,200}; for testing 
    testRgb =Arrays.toString(rgb) ;
    testBoudns = Arrays.toString(boundData);
 
    // ------------------------------ canvas setup ------------------------------
    Canvas c = new Canvas(){
        public void paint(Graphics g){ // all functions are useing internal randomizers
            faceGen(g);
            createCirc(boundData, true, rgb, g, true);

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

    //-------------------------create rect --------------------------
    private void createBox(int[]boundData,boolean f,int[] c ,Graphics g,boolean useIntRand) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        
        if(f == true && useIntRand == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else if( f == false && useIntRand == true){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }

        if(f == true && useIntRand == false){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(c[0],c[1],c[2])); // best cheat
            g.fillRect(boundData[0],boundData[1] , boundData[2], boundData[3]); 

            }else if( f == false && useIntRand == false){// stuff for holo rect 
                g.setColor(new Color(c[0],c[1],c[2]));
                g.drawRect(boundData[0],boundData[1] , boundData[2], boundData[3]);

            }


        }



    //----------------------------------- create Circ --------------------
    private void createCirc(int[]boundData,boolean f,int[] c ,Graphics g,boolean useIntRand) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true && useIntRand == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else if( f == false && useIntRand == true){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }

        if(f == true && useIntRand == false){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(c[0],c[1],c[2])); // best cheat
            g.fillOval(boundData[0],boundData[1] , boundData[2], boundData[3]); 

            }else if( f == false && useIntRand == false){// stuff for holo rect 
                g.setColor(new Color(c[0],c[1],c[2]));
                g.drawOval(boundData[0],boundData[1] , boundData[2], boundData[3]);

            }

        }

    // ----------------------------------------------------- create arch -----------------------------
    private void createArc(int[]boundData,boolean f,int[]c,int start,int angle,Graphics g,boolean useIntRand) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values
        
        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
        
        if(f == true && useIntRand == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180)); 

            }else if( f == false && useIntRand == true){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180));

            }

        if(f == true && useIntRand == false){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(c[0],c[1],c[2])); // best cheat
            g.fillArc(boundData[0],boundData[1] , boundData[2], boundData[3],start,angle); 

            }else if( f == false && useIntRand == false){// stuff for holo rect 
                g.setColor(new Color(c[0],c[1],c[2]));
                g.drawArc(boundData[0],boundData[1] , boundData[2], boundData[3],start,angle);

            }

        }


        // ---------------------- create face------------------------------
        private void faceGen(Graphics g){
        
        int bigBoundData1[]={50,0,500,500};// face
        //SUDO CODE: create a funttion to space evenly across the face randomly
        int bigBoundData2[]={500,500,100,100};// eye 1
        int bigBoundData3[]={500,500,100,100};// eye 2
        //SUDO CODE: create a function to make the mouth either be happy or sad 
        int bigBoundData4[]={500,500,100,100};// mouth
        
        int bigBoundData5[]={500,500,100,100}; // nose
        
        
            int bigColorDat1[]={Randomizer(255),Randomizer(255),Randomizer(255)};
            int bigColorDat2[]={Randomizer(255),Randomizer(255),Randomizer(255)};
            int bigColorDat3[]={Randomizer(255),Randomizer(255),Randomizer(255)};
            int bigColorDat4[]={Randomizer(255),Randomizer(255),Randomizer(255)};
        
        int smalldat[]={500,500,100,100};
        int smallcolor[]={Randomizer(255),Randomizer(255),Randomizer(255)};


            createCirc(bigBoundData1, true,bigColorDat1, g, false);


        }

















    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //new nftShapes();
        nftFace x = new nftFace();
        //new nftShapes();
        System.out.print(""+x.testRgb+" "+x.testBoudns);
    }
}
