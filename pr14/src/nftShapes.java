import javax.swing.*;

//import org.w3c.dom.css.RGBColor;
// code is awfull never use again 
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
            createTri(boundData, true, rgb, g, true);
            createTri(boundData, false, rgb, g, true);
            createTri(boundData, true, rgb, g, true);
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
    private void createBox(int[]boundData,boolean f,int[] c ,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled rectangle if not true make a holo rectangle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else{// stuff for holo rect 
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawRect(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }


        }



    //----------------------------------- create Circ --------------------
    private void createCirc(int[]boundData,boolean f,int[] c ,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values

        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled circle if not true make a holo circle or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]); 

            }else{// stuff for holo circ
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawOval(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3]);

            }


        }

    // ----------------------------------------------------- create arch -----------------------------
    private void createArc(int[]boundData,boolean f,int[]c,int start,int angle,Graphics g) {
    
        int cInter[] = {Randomizer(255),Randomizer(255),Randomizer(255)}; // use internal values to 
        // continuesly genrate rgb and bound values
        
        int boundDataInter[] = {Randomizer(600),Randomizer(525),Randomizer(200),Randomizer(200)};
    
        if(f == true){// if true make a filled arc if not true make a holo arc or oval there the same thing 
            g.setColor(new Color(cInter[0],cInter[1],cInter[2])); // best cheat
            g.fillArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180)); 

            }else{// stuff for holo arc
                g.setColor(new Color(cInter[0],cInter[1],cInter[2]));
                g.drawArc(boundDataInter[0],boundDataInter[1] , boundDataInter[2], boundDataInter[3],Randomizer(180),Randomizer(180));

            }


        }

        private void createTri(int[]boundData,boolean f,int[]c,Graphics g,boolean useintRand ){
            //could be cut in half 
            //   bounds [] {x,y,xd,td}
           int XD2 = boundData[0] + boundData[2];
           int XD1 = boundData[0]+ (boundData[2]/2) ;
           int YD = boundData[1] - boundData[3];
           int numOfPoints= 3;
           int vertexX[]={boundData[0],XD1,XD2};
           int vertexY[] ={boundData[1],YD,boundData[1]};

            //-----------internal verbles for when using internal randomizer come up with way to use less arrays 

           int boundDataInt[] ={Randomizer(500),Randomizer(500),Randomizer(500),Randomizer(500)};
           int XD2Int = boundDataInt[0] + boundDataInt[2];
           int XD1Int = boundDataInt[0]+ (boundDataInt[2]/2);
           int YDInt = boundDataInt[1] - boundDataInt[3];

           int vertexXR[]={boundDataInt[0],XD1Int,XD2Int};
           int vertexYR[] ={boundDataInt[1],YDInt,boundDataInt[1]};
           // rewrite to if> if else > if >if else dont know what i was smoking to come up with this 
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
               int cint[]={Randomizer(255),Randomizer(255),Randomizer(255)};
               if(f==true){
                   Polygon tryingle =new Polygon(vertexXR,vertexYR,numOfPoints);
                   g.setColor(new Color(cint[0],cint[1],cint[2]));
                   g.drawPolygon(tryingle);
               
               }else if(f == false){
                   Polygon tryingle =new Polygon(vertexXR,vertexYR,numOfPoints);
                   g.setColor(new Color(Randomizer(255),Randomizer(255),Randomizer(255)));
                   g.fillPolygon(tryingle);
               }
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
