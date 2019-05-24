/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.TimerTask;

/**
 *
 * @author arnau
 */
public class MijnTimerTask 
        extends TimerTask {
     HelloTVXlet ht;
 public  MijnTimerTask(HelloTVXlet ht)
 {
     this.ht=ht;
 }
   
    public void run() {
        System.out.println("Timer afgegaan");
   ht.timer();  
    }

}
