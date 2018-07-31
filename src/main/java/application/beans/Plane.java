package application.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

public class Plane {
    private static final Logger log = Logger.getLogger(Plane.class.getName());

    private Seats seats;


    public Plane(Seats seats){
        this.seats = seats;
        log.info("Plane constructor");
        seats.seatsInfo();
    }
}
