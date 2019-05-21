package v1ch06_Interface_Lambda_InnerClass.timer_6_2;

/**
   @version 1.01 2015-05-12
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; 
// to resolve conflict with java.util.Timer

public class TimerTest
{  
   public static void main(String[] args)
   {  
      ActionListener listener = new TimePrinter();

      // construct a timer that calls the listener
      // once every 10 seconds
      System.out.println("run here");
      Timer t = new Timer(100, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("cj 66666");
//            Toolkit.getDefaultToolkit().beep();
         }
      });
//      Timer t = new Timer(1000, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}

class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      System.out.println("At the tone, the time is " + new Date());
      Toolkit.getDefaultToolkit().beep();
   }
}
