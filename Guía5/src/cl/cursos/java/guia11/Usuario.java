package cl.cursos.java.guia11;

public class Usuario {
	private String nombre;
	private String password;
	private int intentosFallidos;

	/**
	 * @param nombre
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombre, String password, int intentosFallidos) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public void login(String usuario, String contraseña) throws AutenticacionEsception, CuentaBloqueadaException {
		
		if(getIntentosFallidos()>=3){
			throw new CuentaBloqueadaException();
		}
		
		
		if (this.getNombre().equals(usuario) && this.getPassword().equals(contraseña)) {
			System.out.println("Usuario Correcto");
		}

		else {
			this.setIntentosFallidos(this.getIntentosFallidos() + 1);
			throw new AutenticacionEsception("Usuario o Contraseña no son validos");
		}
	}
	
	
}
