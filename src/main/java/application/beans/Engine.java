package application.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Engine implements BeanPostProcessor {
    private static final Logger log = Logger.getLogger(Engine.class.getName());


    private ScopeShowcaseBean ssb;

    public Engine(){
        log.info("Engine constructor");
    }

    @Autowired
    public void setSsb(ScopeShowcaseBean ssb) {
        this.ssb = ssb;
    }

    public ScopeShowcaseBean getSsb() {
        return ssb;
    }

}
