
public class Main {
	public static void main(String args[]) {
		
		//Use of Exception Handling
		//Use of Java GUI
		//Use of Java Generics
		//Use of Multi-threading
		//Use of Event-driven programming
		
		try {
			RunnableTread RT = new RunnableTread();
			AnotherRunnableThread ART = new AnotherRunnableThread();
			Thread t1 = new Thread(RT);
			Thread t2 = new Thread(ART);
			t1.start();
			
			// Generics on RunnableThread class
			
			t2.start();
		}
		catch(Exception e){
			System.out.println("ERROR!");
		}
	}
}
