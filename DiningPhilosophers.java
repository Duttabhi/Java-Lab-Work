package test;
enum State {THINKING, HUNGRY, EATING};
class Semaphore {
	int count = 0, mutex = 0;
	public void block() {
		while(mutex <= 0);
		mutex--;
	}
	public void release() {mutex++;}	
}
class Philosopher{
	public static int philosophersWaiting = 0;
	public State state;
	Philosopher left, right;
}

class Monitor {
	Philosopher philosopher;
	Semaphore resource, monitor, next;
	public Monitor(Philosopher philosopher, Semaphore resource, Semaphore monitor, Semaphore next) {
		this.philosopher = philosopher;
		this.resource = resource;
		this.monitor = monitor;
		this.next = next;
	}
	public void pickup() {
		monitor.block();
		philosopher.state = State.HUNGRY;
		isEating(philosopher);
		if(philosopher.state != State.EATING) proberen();
		if(Philosopher.philosophersWaiting > 0) next.release();
		else monitor.release();		
	}
	public void putdown() {
		monitor.block();
		philosopher.state = State.THINKING;
        isEating(philosopher.left);
        isEating(philosopher.right);
		if(Philosopher.philosophersWaiting > 0) next.release();
		else monitor.block();
	}
	public void isEating(Philosopher p) {
		monitor.block();
        if (p.left.state != State.EATING && p.right.state != State.EATING && p.state == State.HUNGRY) 
        	p.state = State.EATING;
		if(Philosopher.philosophersWaiting > 0) next.release();
		else monitor.block();
	}
	void proberen() {
		resource.count++;
		if(Philosopher.philosophersWaiting > 0) next.release();
		else monitor.release();
		resource.block();
		resource.count--;
	}
	void verhogen() {
		if(resource.count > 0) {
			Philosopher.philosophersWaiting++;
			resource.block();
			next.block();
			Philosopher.philosophersWaiting--;
		}
	}
}
public class DiningPhilosophers {
	public static void main(String[] args) {
		System.out.println("Running Main..");
	}
}
