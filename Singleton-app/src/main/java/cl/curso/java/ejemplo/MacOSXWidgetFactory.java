package cl.curso.java.ejemplo;

public class MacOSXWidgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {
		return new MacOSXWindow();
	}

}
