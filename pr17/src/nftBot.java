import javax.swing.*;

//import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;
//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Random;
//import java.util.function.Function;

public class nftBot {



JFrame f;
JButton b;


private String testRgb,testBoudns;



public nftBot(){
    f =new JFrame ("nftRobot");
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    b =new JButton("new nft");
    b.setBounds(0,500,600,70);
    f.add(b);



    int rgb[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // not needed 
    //                    x y bw bh  rL   rh
    int BoundDataHouse[]={250-50,100,100,100,100,100};
    //int ColorDataHouse[]={r,g,b,r2,g2,b2};
    int boundData[] = {200,200,200,100};
    int boundData2[] = {200,200,200,-100};
    //int test[] = {100,100,200,200}; for testing 
    testRgb =Arrays.toString(rgb) ;
    testBoudns = Arrays.toString(boundData);
 
    // ------------------------------ canvas setup ------------------------------
    Canvas c = new Canvas(){
        public void paint(Graphics g){ // all functions are useing internal randomizers
            //createTri(boundData, false, rgb, g, false);
            //createTri(boundData, false, rgb, g, true);
            createHouse(250,rgb , BoundDataHouse,Randomizer(20), g);

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
    private void createBox(int[]boundData,boolean f,int[]c,Graphics g,boolean useIntRand) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {(boundData[0]),(boundData[1]),(boundData[2]),(boundData[3])};
        
        if(useIntRand == true){
            boundDataInter[0] = Randomizer(boundData[0]);
            boundDataInter[1] = Randomizer(boundData[1]);
            boundDataInter[2] = Randomizer(boundData[2]);
            boundDataInter[3] = Randomizer(boundData[3]);
         }
        
    
        
        if(f == true ){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
                g.fillRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else if( f == false ){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }



        
        }



    //----------------------------------- create Circ --------------------
    private void createCirc(int[]boundData,boolean f,int[]c,Graphics g,boolean useIntRand) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {(boundData[0]),(boundData[1]),(boundData[2]),(boundData[3])};
        if(useIntRand == true){
            boundDataInter[0] = Randomizer(boundData[0]);
            boundDataInter[1] = Randomizer(boundData[1]);
            boundDataInter[2] = Randomizer(boundData[2]);
            boundDataInter[3] = Randomizer(boundData[3]);
        }
        
        
        if(f == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
                g.fillOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else if(f == false){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }


        }


    // ----------------------------------------------------- create arch -----------------------------
    private void createArc(int[]boundData,boolean f,int[]c,int start,int angle,Graphics g,boolean useIntRand) {
       
        // continuesly genrate rgb and bound values
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        int startInt = start;
        int angleInt = angle;
        int boundDataInter[] = {(boundData[0]),(boundData[1]),(boundData[2]),(boundData[3])};
        if(useIntRand == true){
            boundDataInter[0] = Randomizer(boundData[0]);
            boundDataInter[1] = Randomizer(boundData[1]);
            boundDataInter[2] = Randomizer(boundData[2]);
            boundDataInter[3] = Randomizer(boundData[3]);
            startInt = Randomizer(start);
            angleInt = Randomizer(angle);
         }
    
        
        if(f == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
                g.fillArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],startInt,angleInt); 

            }else if(f == false){// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],startInt,angleInt);

            }

        }

    
    
    //------------------------------------- create tri ---------------------------------------------
        private void createTri(int[]boundData,boolean f,int[]c,Graphics g,boolean useintRand ){
             //   bounds [] {x,y,xd,td}
            int boundInt[] = {boundData[0],boundData[1],boundData[2],boundData[3]};
            if(useintRand == true){
                boundInt[0] = Randomizer(boundData[0]);
                boundInt[1] = Randomizer(boundData[1]);
                boundInt[2] = Randomizer(boundData[2]);
                boundInt[3] = Randomizer(boundData[3]);
             }
            
            int XD2 = boundInt[0] + boundInt[2];
            int XD1 = boundInt[0]+ (boundInt[2]/2) ;
            int YD = boundInt[1] - boundInt[3];
            int numOfPoints= 3;
            int vertexX[]={boundInt[0],XD1,XD2};
            int vertexY[] ={boundInt[1],YD,boundInt[1]};

            
            if(f==true){
                    Polygon tryingle =new Polygon(vertexX,vertexY,numOfPoints);
                    g.setColor(new Color(c[0],c[1],c[2]));
                    g.drawPolygon(tryingle);
                
            }else if(f == false){
                    Polygon tryingle =new Polygon(vertexX,vertexY,numOfPoints);
                    g.setColor(new Color(c[0],c[1],c[2]));
                    g.fillPolygon(tryingle);
            }


        }
        private void createHouse(int groundHeight,int[] groundColor,int[] BoundData,int overhang,Graphics g){
            // set ground 
            groundHeight = Randomizer(200);
           
            int chim = Randomizer(3);
            



            int heightRand = Randomizer(BoundData[3]) +50;
            int widthRand =Randomizer(BoundData[2])+50;
            int doorNum =widthRand/4;
            int offset = widthRand/12;
            //
            int boundDataGrownd[]={00,500-groundHeight,600,groundHeight};// bound data for ground
            //
            int BoundDataBase[] ={300-(widthRand/2),500-groundHeight-heightRand,widthRand,heightRand}; //bound data for base of house
            //
            int BoundDataRoof[] ={300-(widthRand/2)-overhang,500-groundHeight-heightRand,BoundDataBase[2]+overhang*2,heightRand};
       
            //
            int boundDataChim[] ={310-(widthRand/2),500-groundHeight-heightRand*2,widthRand/4,heightRand};
            if(chim ==3){
                 
            }else if(chim == 2){
                 boundDataChim[0]= 300-(widthRand/2) + widthRand-doorNum-widthRand/16 - 5;
            }else{
                boundDataChim[3] =0;
            }
            //
            int BoundDataWindow[] = {310-(widthRand/2),520-groundHeight-heightRand,widthRand/4,heightRand/4};
            int BoundDataDoor[] = {300-(widthRand/2) + widthRand-doorNum-offset,520-groundHeight-heightRand,doorNum,heightRand};
            int ColorGrond[] = {Randomizer(255),Randomizer(255),Randomizer(255)};
            int ColorGrond2[] = {Randomizer(255),Randomizer(255),Randomizer(255)};
            int ColorGrond3[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // rename this 
            
            
            
            
            createBox(BoundDataBase,true,ColorGrond2,g,false); 
            createBox(BoundDataDoor, true, ColorGrond3, g, false);
            createBox(boundDataGrownd, true,ColorGrond ,g, false);
            createBox(boundDataChim, true, ColorGrond, g, false);
            createBox(BoundDataWindow, true, ColorGrond, g, false);
            createTri(BoundDataRoof, false, ColorGrond3, g, false);
            
            //createTri(boundData, f, c, g, useintRand);
        }

    
        

        

    public static void main(String[] args) throws Exception {
        System.out.println("written by james shufelt");
        //new nftShapes();
        nftBot x = new nftBot();
        //new nftShapes();
        System.out.print(""+x.testRgb+" "+x.testBoudns);
    }
}
