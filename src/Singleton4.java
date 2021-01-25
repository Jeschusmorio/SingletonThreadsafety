//Thread-Sichere Methode
//nicht die gesamte Methode getInstance() wird synchronized
//sondern nur ein Teil, welcher aufgerufen wird, wenn das Singleton
//noch nicht erstellt wurde
//Vorteile:	garantierte Threadsicherheit durch synchronized
//			keine überflüssige Synchronisierung
//Nachteil: aufwendigere Implementierung (zus. if-Bedingung)
public class Singleton4 {
	private static Singleton4 instance = null;
	
	//Objekt welches Synchronisiert werden soll
	//dient als Identifier, welche Threads synchronisiert
	//werden sollen -> hier alle Threads
	private static Object obj = new Object();
	
	private Singleton4() {
		System.out.println("Created Singleton successfully!");
	}
	public static Singleton4 getInstance() {
		Singleton4 result = instance;
		if (instance == null) {
			synchronized(obj) {
				//hier sind die Threads synchronisiert
				//=> nochmal überprüfen ob nicht schon ein
				//anderer Thread das Singleton erstellt hat
				if(instance == null) {
					instance = new Singleton4();
				}
				else {
					System.out.println("Singleton already exists!");
				}
			}
		}
		return instance;
	}
}
