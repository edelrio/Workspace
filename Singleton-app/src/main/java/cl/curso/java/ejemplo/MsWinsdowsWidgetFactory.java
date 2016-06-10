package cl.curso.java.ejemplo;

public class MsWinsdowsWidgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {

		return new MsWindow();
	}

	
}
