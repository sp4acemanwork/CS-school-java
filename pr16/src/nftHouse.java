import javax.swing.*;

//import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;
//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Random;
//import java.util.function.Function;

public class nftHouse {



JFrame f;
JButton b;


private String testRgb,testBoudns;



public nftHouse(){
    f =new JFrame ("nftface");
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    b =new JButton("new nft");
    b.setBounds(0,525,600,37);
    f.add(b);



    int rgb[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // not needed 

    int boundData[] = {200,200,200,100};
    int boundData2[] = {Randomizer(100),Randomizer(100),Randomizer(100),Randomizer(100)}; // not needed
    //int test[] = {100,100,200,200}; for testing 
    testRgb =Arrays.toString(rgb) ;
    testBoudns = Arrays.toString(boundData);
 
    // ------------------------------ canvas setup ------------------------------
    Canvas c = new Canvas(){
        public void paint(Graphics g){ // all functions are useing internal randomizers
            
            createTri(boundData, false, rgb, g, false);
            createTri(boundData, false, rgb, g, true);

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

    
    
    
    
        private void createTri(int[]boundData,boolean f,int[]c,Graphics g,boolean useintRand ){
     //   bounds [] {x,y,xd,td}
     int XD2 = boundData[0] + boundData[2];
     int XD1 = boundData[0]+ (boundData[2]/2) ;
     int YD = boundData[1] - boundData[3];
     int numOfPoints= 3;

     int vertexX[]={boundData[0],XD1,XD2};
     int vertexY[] ={boundData[1],YD,boundData[1]};

     //-----------internal verbles for when using internal randomizer

     int boundDataInt[] ={Randomizer(500),Randomizer(500),Randomizer(500),Randomizer(500)};
     int XD2Int = boundDataInt[0] + boundDataInt[2];
     int XD1Int = boundDataInt[0]+ (boundDataInt[2]/2) ;
     int YDInt = boundDataInt[1] - boundDataInt[3];
      
     int vertexXR[]={boundDataInt[0],XD1Int,XD2Int};
     int vertexYR[] ={boundDataInt[1],YDInt,boundDataInt[1]};

        if(useintRand == false){
            if(f==true){
                Polygon tryingle =new Polygon(vertexX,vertexY,numOfPoints);
            g.setColor(new Color(c[0],c[1],c[2]));
            g.drawPolygon(tryingle);
    
    
            }else if(f == false){
                Polygon tryingle =new Polygon(vertexX,vertexY,numOfPoints);
                g.setColor(new Color(c[0],c[1],c[2]));
                g.fillPolygon(tryingle);
            }
        }else{

        
            
            if(f==true){

                Polygon tryingle =new Polygon(vertexX,vertexY,numOfPoints);
            g.setColor(new Color(c[0],c[1],c[2]));
            g.drawPolygon(tryingle);
    
            }else if(f == false){
                Polygon tryingle =new Polygon(vertexXR,vertexYR,numOfPoints);
                g.setColor(new Color(Randomizer(255),Randomizer(255),Randomizer(255)));
                g.fillPolygon(tryingle);
            }
        }
    }


    
    




    
        // ---------------------- create face------------------------------
    

















    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //new nftShapes();
        nftHouse x = new nftHouse();
        //new nftShapes();
        System.out.print(""+x.testRgb+" "+x.testBoudns);
    }
}
