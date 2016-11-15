package AbstractClass;

public abstract class Player {
	
	public abstract void play();
	public abstract void stop();
	public abstract void forward();
	
	// Passos do Template Method
	public final void execute() {
		
		play();
		forward();
		stop();
		
	}
	
}
