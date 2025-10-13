package ohm.softa.a03;

public class SleepingState extends State {

    SleepingState(int sleep){
        super(sleep);
    }

    @Override
    State successor(Cat cat) {
            return new HungryState(cat.getAwake());
    }
}
