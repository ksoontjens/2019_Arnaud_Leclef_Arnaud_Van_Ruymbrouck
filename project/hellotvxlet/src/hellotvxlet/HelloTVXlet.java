package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;


import java.util.Timer;
import javax.tv.xlet.*;
import org.havi.ui.HIcon;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {
int huidigevraag=1;
int score=0;
  HScene scene;
    public HelloTVXlet() {
               scene=HSceneFactory.getInstance().getDefaultHScene();
               scene.setBackground(Color.BLACK);
               scene.setBackgroundMode(HVisible.BACKGROUND_FILL);
               
               //scene.setBackgroundImage(scene.getToolkit().getImage("image14.png"));
               //scene.setRenderMode(scene.IMAGE_CENTER);
    }
    
    public void vraag6()
{

      
      MediaTracker mt6=new MediaTracker(scene);
        try {
            mt6.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      
      HStaticText hst6=new HStaticText("End of quiz, your points:" +score +"/5",50,50,640,50);// x, y , b , h  (in px)
      hst6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst6.setBackground(Color.BLACK);
      
      HTextButton knop16=new HTextButton("Restart",90,450,190,50);
      knop16.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop16.setBackground(Color.BLUE);
      HTextButton knop17=new HTextButton("Quit",450,450,190,50);
      knop17.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop17.setBackground(Color.BLUE);
      
      scene.add(knop16);
      scene.add(knop17);
      
       knop16.setFocusTraversal(null, null, null, knop17);
       knop17.setFocusTraversal(null, null, knop16, null);
       
      knop16.addHActionListener(this);
      knop16.setActionCommand("knop16");
      knop17.addHActionListener(this);
      knop17.setActionCommand("knop17");
      
       knop16.requestFocus();
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      
      scene.add(hst6);
      //knop13.requestFocus();
      System.out.println("score"+score);
      scene.validate();
      scene.setVisible(true);
      
         
      System.out.println("vraag6 einde");
 
      
   
}
    
    public void vraag5()
{

      Image image13=scene.getToolkit().getImage("image14.png");
      Image image14=scene.getToolkit().getImage("image13.png");
      Image image15=scene.getToolkit().getImage("image15.png");
      MediaTracker mt5=new MediaTracker(scene);
        try {
            mt5.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon13=new HIcon(image13,80,200,200,200);
      HIcon icon14=new HIcon(image14,280,200,200,200);
      HIcon icon15=new HIcon(image15,480,200,200,200);
      HStaticText hst5=new HStaticText("5)What is the most Expensive Clothing Brand In The World",50,50,640,50);// x, y , b , h  (in px)
      hst5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst5.setBackground(Color.BLACK);
      HTextButton knop13=new HTextButton("Gucci",90,450,190,50);
      knop13.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop13.setBackground(Color.BLUE);
      HTextButton knop14=new HTextButton("Oscar de la Renta",290,450,190,50);
      knop14.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop14.setBackground(Color.BLUE);
      HTextButton knop15=new HTextButton("LouisVuitton",490,450,190,50);
      knop15.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop15.setBackground(Color.BLUE);
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      knop13.setActionCommand("knop13");
// bovenaan: implements: Xlet, HActionListener + import + implement all
      //knop13.addHActionListener(this);
      scene.add(knop13);
      scene.add(knop14);
      scene.add(knop15);
      scene.add(icon13);
     scene.add(icon14);
      scene.add(icon15);
      scene.add(hst5);
      //knop13.requestFocus();
      knop13.setFocusTraversal(null, null, null, knop14);
      knop14.setFocusTraversal(null, null, knop13, knop15);
      knop15.setFocusTraversal(null, null, knop14, null);
      knop13.addHActionListener(this);
      knop13.setActionCommand("knop13");
      knop14.addHActionListener(this);
      knop14.setActionCommand("knop14");
      knop15.addHActionListener(this);
      knop15.setActionCommand("knop15");
      scene.validate();
      scene.setVisible(true);
      knop13.requestFocus();
         
      System.out.println("vraag5 einde");
 
      
   
}
    
    public void vraag4()
{
System.out.println(("vraag4"));
      Image image10=scene.getToolkit().getImage("image12.png");
      Image image11=scene.getToolkit().getImage("image11.png");
      Image image12=scene.getToolkit().getImage("image10.png");
      MediaTracker mt4=new MediaTracker(scene);
        try {
            mt4.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon10=new HIcon(image10,80,200,200,200);
      HIcon icon11=new HIcon(image11,280,200,200,200);
      HIcon icon12=new HIcon(image12,480,200,200,200);
      HStaticText hst4=new HStaticText("4)What is the most Expensive Country In The World To Live In",50,50,640,50);// x, y , b , h  (in px)
      hst4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst4.setBackground(Color.BLACK);
      HTextButton knop10=new HTextButton("Norway",90,450,190,50);
      knop10.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop10.setBackground(Color.BLUE);
      HTextButton knop11=new HTextButton("Iceland",290,450,190,50);
      knop11.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop11.setBackground(Color.BLUE);
      HTextButton knop12=new HTextButton("Switzerland",490,450,190,50);
      knop12.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop12.setBackground(Color.BLUE);
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      knop10.setActionCommand("knop10");
// bovenaan: implements: Xlet, HActionListener + import + implement all
      //knop10.addHActionListener(this);
      scene.add(knop10);
      scene.add(knop11);
      scene.add(knop12);
      scene.add(icon10);
     scene.add(icon11);
      scene.add(icon12);
      scene.add(hst4);
      //knop10.requestFocus();
      knop10.setFocusTraversal(null, null, null, knop11);
      knop11.setFocusTraversal(null, null, knop10, knop12);
      knop12.setFocusTraversal(null, null, knop11, null);
      knop10.addHActionListener(this);
      knop10.setActionCommand("knop10");
      knop11.addHActionListener(this);
      knop11.setActionCommand("knop11");
      knop12.addHActionListener(this);
      knop12.setActionCommand("knop12");
      scene.validate();
      scene.setVisible(true);
      knop10.requestFocus();
         
      System.out.println("vraag4 einde");
 
      
   
}
   
    
    public void vraag3()
{

      Image image7=scene.getToolkit().getImage("image7.png");
      Image image8=scene.getToolkit().getImage("image8.png");
      Image image9=scene.getToolkit().getImage("image9.png");
      MediaTracker mt3=new MediaTracker(scene);
        try {
            mt3.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon7=new HIcon(image7,80,200,200,200);
      HIcon icon8=new HIcon(image8,280,200,200,200);
      HIcon icon9=new HIcon(image9,480,200,200,200);
      HStaticText hst3=new HStaticText("3)What is the most expensive football player",50,50,640,50);// x, y , b , h  (in px)
      hst3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst3.setBackground(Color.BLACK);
      HTextButton knop7=new HTextButton("Neymar",90,450,190,50);
      knop7.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop7.setBackground(Color.BLUE);
      HTextButton knop8=new HTextButton("Mbappé",290,450,190,50);
      knop8.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop8.setBackground(Color.BLUE);
      HTextButton knop9=new HTextButton("Coutinho",490,450,190,50);
      knop9.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop9.setBackground(Color.BLUE);
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      knop7.setActionCommand("knop7");
// bovenaan: implements: Xlet, HActionListener + import + implement all
//      knop7.addHActionListener(this);
      scene.add(knop7);
      scene.add(knop8);
      scene.add(knop9);
      scene.add(icon7);
     scene.add(icon8);
      scene.add(icon9);
      scene.add(hst3);
      //knop7.requestFocus();
      knop7.setFocusTraversal(null, null, null, knop8);
      knop8.setFocusTraversal(null, null, knop7, knop9);
      knop9.setFocusTraversal(null, null, knop8, null);
      knop7.addHActionListener(this);
      knop7.setActionCommand("knop7");
      knop8.addHActionListener(this);
      knop8.setActionCommand("knop8");
      knop9.addHActionListener(this);
      knop9.setActionCommand("knop9");
      scene.validate();
      scene.setVisible(true);
      knop7.requestFocus();
         
      System.out.println("vraag3 einde");
 
      
  
}
public void vraag2()
{

      Image image4=scene.getToolkit().getImage("image4.png");
      Image image5=scene.getToolkit().getImage("image5.png");
      Image image6=scene.getToolkit().getImage("image6.png");
      MediaTracker mt2=new MediaTracker(scene);
        try {
            mt2.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon4=new HIcon(image5,80,200,200,200);
      HIcon icon5=new HIcon(image4,280,200,200,200);
      HIcon icon6=new HIcon(image6,480,200,200,200);
      HStaticText hst2=new HStaticText("2)What is the most expensive movie ever made?",50,50,640,50);// x, y , b , h  (in px)
      hst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst2.setBackground(Color.BLACK);
      HTextButton knop4=new HTextButton("Age of Ultron",90,450,190,50);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);
      HTextButton knop5=new HTextButton("POC",290,450,190,50);
      knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop5.setBackground(Color.BLUE);
      HTextButton knop6=new HTextButton("Endgame",490,450,190,50);
      knop6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop6.setBackground(Color.BLUE);
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      knop4.setActionCommand("knop4");
// bovenaan: implements: Xlet, HActionListener + import + implement all
      //knop4.addHActionListener(this);
      scene.add(knop6);
      scene.add(knop5);
      scene.add(knop4);
      scene.add(icon4);
     scene.add(icon5);
      scene.add(icon6);
      scene.add(hst2);
      knop4.requestFocus();
      knop4.setFocusTraversal(null, null, null, knop5);
      knop5.setFocusTraversal(null, null, knop4, knop6);
      knop6.setFocusTraversal(null, null, knop5, null);
      knop4.addHActionListener(this);
      knop4.setActionCommand("knop4");
      knop5.addHActionListener(this);
      knop5.setActionCommand("knop5");
      knop6.addHActionListener(this);
      knop6.setActionCommand("knop6");
      scene.validate();
      scene.setVisible(true);
      knop4.requestFocus();
         
      System.out.println("vraag2 einde");
 
      
  
}
    public void vraag1()
    {
            Image image=scene.getToolkit().getImage("image.png");
      Image image2=scene.getToolkit().getImage("image2.png");
      Image image3=scene.getToolkit().getImage("image3.png");
      MediaTracker mt=new MediaTracker(scene);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon=new HIcon(image,80,200,200,200);
      HIcon icon2=new HIcon(image2,280,200,200,200);
      HIcon icon3=new HIcon(image3,480,200,200,200);
      HStaticText hst=new HStaticText("1)What is the most expensive car ever made?",50,50,640,50);// x, y , b , h  (in px)
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLACK);
      HTextButton knop1=new HTextButton("Bugatti Noire",90,450,190,50);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      HTextButton knop2=new HTextButton("Rolls-Royce",290,450,190,50);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      HTextButton knop3=new HTextButton("Koenigsegg CCXR",490,450,190,50);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      //HTextButton knop4=new HTextButton("Duurste auto 4",530,500,150,50);
      //knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      //knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      knop1.setFocusTraversal(null, knop2, null, knop2);
      knop2.setFocusTraversal(knop1, null, knop1, knop3);
      knop3.setFocusTraversal(null, null, knop2, null);
      //knop4.setFocusTraversal(knop3, null, knop2, null);
      knop1.setActionCommand("knop1");
// bovenaan: implements: Xlet, HActionListener + import + implement all
      knop2.addHActionListener(this);
      knop2.setActionCommand("knop2");
      knop3.addHActionListener(this);
      knop3.setActionCommand("knop3");
      //knop4.addHActionListener(this);
      //knop4.setActionCommand("knop4");
  //    knop1.addHActionListener(this);
      scene.add(knop1); 
      scene.add(knop2); 
      scene.add(knop3); 
      //scene.add(knop4);
      knop2.setActionCommand("knop2");
      knop3.addHActionListener(this);
      knop3.setActionCommand("knop3");
      //knop4.addHActionListener(this);
      //knop4.setActionCommand("knop4");
      knop1.addHActionListener(this);
      scene.add(knop1); 
      scene.add(knop2); 
      scene.add(knop3); 
      //scene.add(knop4);
      
      
     scene.add(icon);
     scene.add(icon2);
      scene.add(icon3);
      scene.add(hst);
      
      
     scene.add(icon);
     scene.add(icon2);
      scene.add(icon3);
      scene.add(hst);
 //     knop1.requestFocus();
      scene.validate();
      scene.setVisible(true);
      knop1.requestFocus();
      
  
    }
    public void initXlet(XletContext context) { // 720x576
      scene=HSceneFactory.getInstance().getDefaultHScene();
     vraag1();
    }
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        String antwoord="";
        
        if (arg0.getActionCommand().equals("knop17"))
        {
            scene.removeAll();
            scene.repaint();
            
            return; // einde functie
        }
        
                if (arg0.getActionCommand().equals("knop16"))
        {
            scene.removeAll();
            huidigevraag=1;
            score=0;
            vraag1();
            scene.repaint();
            return; // einde functie
        }
        
        
        if (arg0.getActionCommand().equals("knop1"))
        {
            antwoord="Juist!!!";
            score++;
            
            
        
            scene.removeAll();
           
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("knop5"))
        {
            antwoord="Juist!!!";
            //score++
            score++;
            
        
            scene.removeAll();
           
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("knop7"))
        {
            antwoord="Juist!!!";
            //score++
            score++;
            scene.removeAll();
        
            
           
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("knop12"))
        {
            antwoord="Juist!!!";
            //score++
            score++;
            scene.removeAll();
        
            
           
            
            scene.repaint();
        }
        
        else if (arg0.getActionCommand().equals("knop14"))
        {
            antwoord="Juist!!!";
            //score++
            score++;    
            scene.removeAll();      
                       
            scene.repaint();
        }
        else { antwoord="Fout!!"; }
        HStaticText hst2=new HStaticText(antwoord,275,120,200,75);
        hst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        hst2.setBackground(Color.BLUE);
        scene.add(hst2);
        scene.popToFront(hst2);
        scene.repaint();
        Timer t=new Timer();
        MijnTimerTask mtt=new MijnTimerTask(this);
        t.schedule(mtt, 2000);
  //      scene.removeAll();
                huidigevraag++;
 
  //     scene.removeAll();

    }
public void timer()
{
    scene.removeAll();
                   System.out.println("huidigevraag="+huidigevraag);
   if (huidigevraag==2)    vraag2();
           if (huidigevraag==3)    vraag3();
                   if(huidigevraag==4)  vraag4();
                        if(huidigevraag==5) vraag5();
                            if(huidigevraag==6) vraag6();
                            
    scene.repaint();
    System.out.println("timer in hoofdprogramma");
//    vraag2();
  //  vraag3();
    
}
    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}
