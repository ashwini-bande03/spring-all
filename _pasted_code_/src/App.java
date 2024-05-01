import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
        Electricity elc = (Electricity) ctx.getBean("elcObj");
        elc.printElectricity();
    }
}