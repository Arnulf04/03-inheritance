package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat {
	private State currentState;

	// state durations (set via constructor), ie. the number of ticks in each state
	private final int sleep;
	private final int awake;
	private final int digest;

	private final String name;

	// set values and the state
	public Cat(String name, int sleep, int awake, int digest) {
		this.name = name;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;

		// start with a state
		currentState = new SleepingState(sleep);
	}

	// start the tick
	public void tick(){
		this.currentState = currentState.tick(this);
	}

	@Override
	public String toString() {
		return name;
	}

	// set the new state
	public boolean isHungry(){
		// check current state
		return currentState instanceof HungryState;
	}
	public boolean isDigesting(){
		return currentState instanceof DigestingState;
	}
	public boolean isPlayful(){
		return currentState instanceof PlayfulState;
	}
	public boolean isDead(){
		return currentState instanceof DeathState;
	}
	public boolean isAsleep(){
		return currentState instanceof SleepingState;
	}

	// getter
	public int getAwake() {
		return awake;
	}
	public int getDigest() {
		return digest;
	}
	public int getSleep() {
		return sleep;
	}

	public void feed(){
		if (!isHungry())
			throw new IllegalStateException("Can't stuff a cat...");

		// change state
		this.currentState = ((HungryState) currentState).feed(this);
	}
	//	public boolean isAsleep() {
//		return state.equals(State.SLEEPING);
//	}
//
//	public boolean isPlayful() {
//		return state.equals(State.PLAYFUL);
//	}
//
//	public boolean isHungry() {
//		return state.equals(State.HUNGRY);
//	}
//
//	public boolean isDigesting() {
//		return state.equals(State.DIGESTING);
//	}
//
//	public boolean isDead() {
//		return state == State.DEAD;
//	}

	//	private static final Logger logger = LogManager.getLogger();

	// valid states
//	public enum State {SLEEPING, HUNGRY, DIGESTING, PLAYFUL, DEAD}

//	private int time = 0;
//	private int timeDigesting = 0;

	// initially, animals are sleeping
//	private State state = State.SLEEPING;

//	public void tick(){
//		logger.info("tick()");
//		time = time + 1;
//
//		switch (state) {
//			case SLEEPING:
//				if (time == sleep) {
//					logger.info("Yoan... getting hungry!");
//					state = HUNGRY;
//					time = 0;
//				}
//				break;
//			case HUNGRY:
//				if(time == awake){
//					logger.info("I've starved for a too long time...good bye...");
//					state = DEAD;
//				}
//				break;
//			case DIGESTING:
//				timeDigesting = timeDigesting + 1;
//				if (timeDigesting == digest) {
//					logger.info("Getting in a playful mood!");
//					state = PLAYFUL;
//				}
//				break;
//			case PLAYFUL:
//				if (time >= awake) {
//					logger.info("Yoan... getting tired!");
//					state = SLEEPING;
//					time = 0;
//				}
//				break;
//
//			case DEAD:
//				break;
//			default:
//				throw new IllegalStateException("Unknown cat state " + state.name());
//		}
//
//		logger.info(state.name());
//
//	}

	/**
	 * This would be a user interaction: feed the cat to change its state!
	 */
//	public void feed(){
//		if (!isHungry())
//			throw new IllegalStateException("Can't stuff a cat...");
//
//		logger.info("You feed the cat...");
//
//		// change state and reset the timer
//		state = State.DIGESTING;
//		timeDigesting = 0;
//	}

//	public boolean isAsleep() {
//		return state.equals(State.SLEEPING);
//	}
//
//	public boolean isPlayful() {
//		return state.equals(State.PLAYFUL);
//	}
//
//	public boolean isHungry() {
//		return state.equals(State.HUNGRY);
//	}
//
//	public boolean isDigesting() {
//		return state.equals(State.DIGESTING);
//	}
//
//	public boolean isDead() {
//		return state == State.DEAD;
//	}


}
