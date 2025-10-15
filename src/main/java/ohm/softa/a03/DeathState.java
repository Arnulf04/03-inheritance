package ohm.softa.a03;

import java.util.logging.Logger;

public class DeathState extends State {

    DeathState(){
        super(1);
    }

    @Override
    public State successor(Cat cat) {
        // no lives left...
        return this;
    }
}
