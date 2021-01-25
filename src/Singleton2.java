//Thread-Sichere Methode
//Eine Instanz wird gleich beim Laden der Klasse erstellt
//Vorteil: einfache Implementierung
//Nachteil: Instanz wird wahrscheinlich nicht so früh benötigt
//			=> Speicher
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();
	
	private Singleton2() {
		System.out.println("Created Singleton successfully!");
	}
	public static Singleton2 getInstance() {
		System.out.println("Singleton already exists!");
		return instance;
	}
}
