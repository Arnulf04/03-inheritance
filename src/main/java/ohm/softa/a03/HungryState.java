package ohm.softa.a03;

public class HungryState extends State {
    //
    HungryState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return new DigestingState(cat.getDigest());
    }
}
