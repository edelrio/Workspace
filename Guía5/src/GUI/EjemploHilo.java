package GUI;

public class EjemploHilo implements Runnable {
	@Override
	public void run( ){
		
		System.out.println("El nombre del thread es: " + Thread.currentThread().getName());
//		try{
//			sleep(100);
//		}
//		catch(InterruptedException ex){
//			
//			
//		}
		
		}
	
	
	public static void main(String[] args) {
		Thread thread = new Thread( new EjemploHilo());
		thread.start();
		System.out.println("Metodo main; El nombre del thread es : " + Thread.currentThread().getName());
		
	}

}
