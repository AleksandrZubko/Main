package v1ch07.notHelloWorld;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.32 2007-06-12
 * @author Cay Horstmann
 */
public class NotHelloWorld
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new NotHelloWorldFrame();  //создаём новый фрейм
               frame.setTitle("NotHelloWorld");  //заголовок
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //указываем, что должно произойти, если закрыть фрейм
               frame.setVisible(true); //Для отображения фрейма на экране
            }
         });
   }
}

/**
 * A frame that contains a message panel
 */
class NotHelloWorldFrame extends JFrame
{
   public NotHelloWorldFrame()
   {
      add(new NotHelloWorldComponent());  //добавляем компонент
      pack();  //воспользоваться предпочтительными размерами
   }
}

/**
 * A component that displays a message.
 */
class NotHelloWorldComponent extends JComponent
{
   public static final int MESSAGE_X = 75;
   public static final int MESSAGE_Y = 100;

   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   //параметр типа Graphics. При выводе на экран размеры, сохраняемые
   //в объекте типа Graphics, указываются в пикселях. Координаты (0 ,0 ) соответствуют
   //левому верхнему углу компонента, на поверхности которого выполняется рисование.
   public void paintComponent(Graphics g) {  //вызывается автоматически, когда требуется перерисовать окно приложения
      g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);  //написание сообщения
   }

   //компонент должен сообщить своим пользователям, насколько большим он должен быть
   //Для этого переопределяется метод getPreferredSize ()
   public Dimension getPreferredSize() {
      return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);  //с предпочтительными шириной и высотой
   }
}
