package application.beans;


import java.util.logging.Logger;

public class Tires {

    private static final Logger log = Logger.getLogger(Tires.class.getName());

    public Tires(){
        log.info("Tires constructor");
    }

    public void tiresInfo(){
        log.info("Nice, new tires");
    }
}
