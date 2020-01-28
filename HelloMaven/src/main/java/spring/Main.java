package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impl.audio.Kenwood;
import spring.impl.audio.Sony;
import spring.impl.car.Audi;
import spring.impl.car.Kia;
import spring.impl.navigation.Pioneer;

public class Main {

    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml"); //уведомляем приложение об xml конфигурации

        //Audi a = (Audi) ac.getBean("audi"); //приведение типа может вызвать исключение
        //Audi a = ac.getBean(Audi.class); //если в xml будет 2 бинна ссылаться на класс Audi, то будет ошибка
        Audi a = ac.getBean("audi", Audi.class); //оптимальный вариант
        a.move();
        a.getAudioSystem().playRadio();
        a.getNavigationSystem().createRoute();

        //меняем магнитолу
        a.setAudioSystem(ac.getBean("kenwood", Kenwood.class));
        a.getAudioSystem().playRadio();

        Audi a1 = ac.getBean("audi", Audi.class);
        a1.move();
        a1.getAudioSystem().playRadio();

        //реализация через java конфигурацию
        ApplicationContext  ctx = new AnnotationConfigApplicationContext(Config.class);

        Audi audi = ctx.getBean(Audi.class);
        audi.move();
        audi.getNavigationSystem().createRoute();
        audi.getAudioSystem().playRadio();

        ctx.getBean(Kia.class).move();




    }
}
