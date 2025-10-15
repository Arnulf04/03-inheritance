package ohm.softa.a03;

public class DigestingState extends State {
    private final int remainTime;

    DigestingState(int duration, int remainTime){
        super(duration);
        this.remainTime = remainTime;
    }

    @Override
    State successor(Cat cat) {
        return new PlayfulState(remainTime - cat.getDigest());
    }
}
