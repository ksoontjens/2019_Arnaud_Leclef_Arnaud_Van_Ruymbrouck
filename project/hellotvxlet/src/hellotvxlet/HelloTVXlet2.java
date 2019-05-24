package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;

import javax.tv.xlet.*;
import org.havi.ui.HIcon;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet2 implements Xlet, HActionListener {

  HScene scene;
    public HelloTVXlet2() {
        
    }

    public void initXlet(XletContext context) { // 720x576
      scene=HSceneFactory.getInstance().getDefaultHScene();
      Image image=scene.getToolkit().getImage("image.png");
      MediaTracker mt=new MediaTracker(scene);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      HIcon icon=new HIcon(image,100,100,200,200);
      HStaticText hst=new HStaticText("Wie was de eerste president van de VS?",50,330,640,50);// x, y , b , h  (in px)
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      HTextButton knop1=new HTextButton("Bill Clinton",50,400,280,50);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      HTextButton knop2=new HTextButton("Donald Trump",50,470,280,50);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      HTextButton knop3=new HTextButton("George Washington",410,400,280,50);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      HTextButton knop4=new HTextButton("Ronald Reagan",410,470,280,50);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);//                       up  , down , left, right
      knop1.setFocusTraversal(null, knop2, null, knop3);
      knop2.setFocusTraversal(knop1, null, null, knop4);
      knop3.setFocusTraversal(null, knop4, knop1, null);
      knop4.setFocusTraversal(knop3, null, knop2, null);
      knop1.setActionCommand("knop1");
// bovenaan: implements: Xlet, HActionListener + import + implement all
      knop2.addHActionListener(this);
      knop2.setActionCommand("knop2");
      knop3.addHActionListener(this);
      knop3.setActionCommand("knop3");
      knop4.addHActionListener(this);
      knop4.setActionCommand("knop4");
      knop1.addHActionListener(this);
      scene.add(knop1); 
      scene.add(knop2); 
      scene.add(knop3); 
      scene.add(knop4);
      
      
     scene.add(icon);
      scene.add(hst);
      knop1.requestFocus();
      scene.validate();
      scene.setVisible(true);
         
      
 
      
     
    }
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        String antwoord="";
        if (arg0.getActionCommand().equals("knop3"))
        {
            antwoord="Juist!!!";
        }
        else { antwoord="Fout!!"; }
        HStaticText hst2=new HStaticText(antwoord,200,200,320,100);
        hst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        hst2.setBackground(Color.BLUE);
        scene.add(hst2);
        scene.popToFront(hst2);
        scene.repaint();
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}
