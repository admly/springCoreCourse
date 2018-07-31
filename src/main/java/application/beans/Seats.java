package application.beans;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

public class Seats {
    private static final Logger log = Logger.getLogger(Seats.class.getName());

    public Seats(){
        log.info("Seats constructor");
    }

    public void seatsInfo(){
        log.info("Yup, seats");
    }
}
