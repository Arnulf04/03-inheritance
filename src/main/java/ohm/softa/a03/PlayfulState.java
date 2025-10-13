package ohm.softa.a03;

public class PlayfulState extends State {

    PlayfulState(int duration){
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new SleepingState(cat.getSleep());
    }
}
