import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин HelloWorld
        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean(HelloWorld.class);

        // Сравниваем ссылки на HelloWorld
        System.out.println("Сравнение HelloWorld: " + (helloWorld1 == helloWorld2)); // true

        // Получаем бин Cat дважды
        Cat cat1 = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);

        // Сравниваем ссылки на Cat
        System.out.println("Сравнение Cat: " + (cat1 == cat2)); // false
    }
}