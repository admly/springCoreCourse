package application.beans;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private static final Logger log = Logger.getLogger(Car.class.getName());
    private Engine engine;

    @Autowired
    public Car(Engine engine){
        this.engine = engine;
        log.info("Car constructor");
    }
}
