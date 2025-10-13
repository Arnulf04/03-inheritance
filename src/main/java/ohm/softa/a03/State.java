package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    // declaration
    private static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    // constructor
    State(int duration){
        this.duration = duration;
    }

    // simulate tick
    State tick(Cat cat) {
        t = t + 1;
        logger.info("tick()");

        if (t < duration){
            return this;
        } else {
            return successor(cat);
        }
    }

    // decision which state is next
    abstract State successor(Cat cat);

    // getter
    public int getTime(){ return t; }
    public int getDuration() { return duration; }
}
