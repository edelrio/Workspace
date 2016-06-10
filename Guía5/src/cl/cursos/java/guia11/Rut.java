/**
 * 
 */
package cl.cursos.java.guia11;

/**
 * @author edelrio
 *
 */
public class Rut {


	private int numero;
	private String digitoVerificador;
	

	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(int numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}


	/**
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}


	public void validar() {
		
		int aux=numero;
		int suma=0;
		int mult = 2;
		int checksum = 0;
		while (aux >=1){
			if(mult ==8){
				mult= 2;
			}
			suma = suma + ((aux%10) * mult);
			aux = aux /10;
			mult++;
					
		}
		checksum= 11-(suma%11);
		if(checksum ==11 && 0== Integer.parseInt( this.getDigitoVerificador())|| (checksum==10 && this.getDigitoVerificador().equals("K")||
				this.getDigitoVerificador()==String.valueOf(checksum))  ){
			
		}
		
		

	}

}
