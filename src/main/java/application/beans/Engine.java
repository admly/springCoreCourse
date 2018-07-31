package application.beans;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Engine {
    private static final Logger log = Logger.getLogger(Engine.class.getName());

    public Engine(){
        log.info("Engine constructor");
    }
}
