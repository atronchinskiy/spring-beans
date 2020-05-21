package app.config;

import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean (name = "animalsCage")
    public AnimalsCage animalsCage() {
        return new AnimalsCage();
    }

    @Bean (name = "cat")
    public Cat cat() {
        return new Cat();
    }

    @Bean (name = "dog")
    public Dog dog() {
        return new Dog();
    }

    @Bean (name = "timer")
    public Timer timer() {
        return new Timer();
    }



}
