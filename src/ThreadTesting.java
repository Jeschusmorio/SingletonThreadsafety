
public class ThreadTesting implements Runnable {
	@Override public void run() {
		Singleton2 singleton = Singleton2.getInstance();
	}
}
