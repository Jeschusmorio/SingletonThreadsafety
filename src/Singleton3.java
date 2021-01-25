//Thread-Sichere Methode
//getInstance() wird synchronized
//Vorteil: garantierte Threadsicherheit; keine unnötige Speicherbelegung
//			=> Singleton wird nur erzeugt, wenn es gebraucht wird
//Nachteil: sobald das Objekt erzeugt wurde, ist die Synchornisierung
//			der Threads überflüssig
public class Singleton3 {
	private static Singleton3 instance = null;
	
	private Singleton3() {
		System.out.println("Created Singleton successfully!");
	}
	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		else {
			System.out.println("Singleton already exists!");
		}
		return instance;
	}
}
