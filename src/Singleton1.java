//einfachste Implementation des Singleton-Patterns
//keine Threadsicherheit
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1() {
		System.out.println("Created Singleton successfully!");
	}
	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		else {
			System.out.println("Singleton already exists!");
		}
		return instance;
	}
}
