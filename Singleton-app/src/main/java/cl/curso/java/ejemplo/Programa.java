package cl.curso.java.ejemplo;

import org.omg.Messaging.SyncScopeHelper;

public class Programa {

	public static void main(String[] args) {

		String plataform = System.getProperty("os.name").toLowerCase();
		
		System.out.println(plataform);
		GUIBuilder builder = new GUIBuilder();
		
		
		if(plataform.startsWith("win"))
			builder.buildWindow(new MsWinsdowsWidgetFactory());
		else 
			builder.buildWindow(new MacOSXWidgetFactory());
			
		}
	}

}
