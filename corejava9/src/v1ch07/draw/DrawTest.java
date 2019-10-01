package v1ch07.draw;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @version 1.32 2007-04-14
 * @author Cay Horstmann
 */
public class DrawTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new DrawFrame();
               frame.setTitle("DrawTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 * Фрейм, содержащий панель с нарисованными двухмерными формами
 */
class DrawFrame extends JFrame
{
   public DrawFrame()
   {      
      add(new DrawComponent());
      pack();
   }
}

/**
 * Компонент, отображающий прямоугольники и эллипсы
 */
class DrawComponent extends JComponent
{
   private static final int DEFAULT_WIDTH = 400;
   private static final int DEFAULT_HEIGHT = 400;

   public void paintComponent(Graphics g)
   {

      //Для того чтобы нарисовать двухмерную форму средствами библиотеки Java 2D,
      //нужно создать объект класса Graphics 2D
      Graphics2D g2 = (Graphics2D) g; //Нужно лишь произвести приведение типов
      g2.setColor(Color.BLUE);  //границы голубым цветом
      // нарисовать прямоугольник

      double leftX = 100;
      double topY = 100;
      double width = 200;
      double height = 150;

      Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
      g2.draw(rect);

      // нарисовать вписанный эллипс

      Ellipse2D ellipse = new Ellipse2D.Double();
      ellipse.setFrame(rect);  //помещаем в прямоугольник элипс
      g2.draw(ellipse);

      // нарисовать диагональную линию

      g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

      // нарисовать окружность с тем же самым центром

      double centerX = rect.getCenterX();
      double centerY = rect.getCenterY();
      double radius = 150;

      Ellipse2D circle = new Ellipse2D.Double();
      circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
      g2.draw(circle);
   }
   
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}
