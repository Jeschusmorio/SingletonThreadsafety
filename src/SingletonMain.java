
public class SingletonMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadTesting());
		Thread t2 = new Thread(new ThreadTesting());
		
		t1.start();
		t2.start();
	}

}
