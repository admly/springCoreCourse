package application;

import application.beans.Car;
import application.beans.Engine;

import application.beans.ScopeShowcaseBean;
import application.beans.Tires;
import application.configuration.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        final Logger log = Logger.getLogger(Application.class.getName());


        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Car car = (Car) context.getBean("car");
        car.getTires().tiresInfo();

        ApplicationContext xmlContext =
                new ClassPathXmlApplicationContext("application/configuration/xmlConfig.xml");

        ScopeShowcaseBean ssb = (ScopeShowcaseBean) context.getBean("scopeShowcaseBean");
        log.info("flag in ScopeShowcaseBean: " + String.valueOf(ssb.isFlag()));

        Tires tires = (Tires) context.getBean("getTires");
        log.info("ScopeShowcaseBean in Tires: " + String.valueOf(tires.getSsb().isFlag()));

        Engine engine = (Engine) context.getBean("engine");
        log.info("ScopeShowcaseBean in Engine: " + String.valueOf(engine.getSsb().isFlag()));

    }
}
