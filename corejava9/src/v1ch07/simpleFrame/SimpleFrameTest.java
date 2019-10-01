package v1ch07.simpleFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.32 2007-06-12
 * @author Cay Horstmann
 */
public class SimpleFrameTest
{
   public static void main(String[] args) throws InterruptedException
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               SimpleFrame frame = new SimpleFrame();  //создаём новый фрейм
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //указываем, что должно произойти, если закрыть фрейм
               frame.setVisible(true); //Для отображения фрейма на экране
               frame.setTitle("Hello, world"); //заголовок
               System.out.println(frame.getTitle()); //получаем заголовок
               frame.setResizable(false); //без возможности изменения размера
               frame.setLocation(100,200); //отступы размещения фрейма 100 точек слева и 200 точек сверху
            }
         });
      Thread.sleep(10000);
      System.exit(1);  //таким образом тоже можно закрыть фрейм
   }
}

class SimpleFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public SimpleFrame()
   {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT); //задаём размеры фрейма
   }
}
