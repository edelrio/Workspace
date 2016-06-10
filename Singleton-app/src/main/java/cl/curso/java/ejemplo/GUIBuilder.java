package cl.curso.java.ejemplo;

public class GUIBuilder {
	
	public Window buildWindow(AbstractWidgetFactory factory){
		return factory.createWindow();
	}

}
