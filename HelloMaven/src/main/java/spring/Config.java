package spring;

//java конфигурация спринга

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.impl.audio.Sony;
import spring.impl.car.Audi;
import spring.impl.car.Kia;
import spring.impl.car.Lexus;
import spring.impl.navigation.Navitel;
import spring.interfaces.AudioSystem;
import spring.interfaces.NavigationSystem;

//класс нужно пометить аннотацией
@Configuration
public class Config {
    //для получения бина
    @Bean
    public AudioSystem sonyAudio(){
        return new Sony();
    }

    @Bean
    public NavigationSystem navitelNav(){
        return new Navitel();
    }

    @Bean
    public Audi car(AudioSystem audioSystem, NavigationSystem navigationSystem){
        return new Audi(audioSystem,navigationSystem);
    }

    @Bean
    public Kia car2(){
        return new Kia();
    }

    @Bean
    public Lexus car3(){
        return new Lexus();
    }

}
