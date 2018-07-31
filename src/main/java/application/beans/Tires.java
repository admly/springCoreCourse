package application.beans;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class Tires {

    private static final Logger log = Logger.getLogger(Tires.class.getName());


    private ScopeShowcaseBean ssb;

    public Tires(){
        log.info("Tires constructor");

    }

    public void tiresInfo(){
        log.info("Nice, new tires");
    }

    @Autowired
    private void setSsb(ScopeShowcaseBean ssb) {
        ssb.setFlag(false);
        this.ssb = ssb;
    }

    public ScopeShowcaseBean getSsb() {
        return ssb;
    }


}
