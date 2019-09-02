package v1ch06.timer;

/**
   @version 1.00 2000-04-13
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
      ActionListener listener = new TimePrinter();  //нужно сначала определить класс, реализующий интерфейс ActionListener

      // construct a timer that calls the listener
      // once every 10 seconds
      Timer t = new Timer(10000, listener);  //Создает таймер, передающий сообщение приемнику событий listener по истечении интервалавремени, продолжительность которого задается параметром i n t e r v a l .
      t.start(); //таймер запускается

      JOptionPane.showMessageDialog(null, "Quit program?");  //Выводит на экран диалоговое окно со строкой сообщения и кнопкой О К
      System.exit(0);
   }
}

class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      Date now = new Date();
      System.out.println("At the tone, the time is " + now);
      Toolkit.getDefaultToolkit().beep();
   }
}
