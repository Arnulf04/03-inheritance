package ohm.softa.a03;

public class DigestingState extends State {

    DigestingState(int duration){
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return new PlayfulState(cat.getAwake());
    }
}
