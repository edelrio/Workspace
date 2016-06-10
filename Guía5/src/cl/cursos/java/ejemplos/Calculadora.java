package cl.cursos.java.ejemplos;

	public class Calculadora {
	
		int numero1;
		int numero2;
		
		
		public Calculadora(int numero1, int numero2){
			
			this.numero1 = numero1;
			this.numero2 = numero2;
			
			
		}


		public int getNumero1() {
			return numero1;
		}


		public void setNumero1(int numero1) {
			this.numero1 = numero1;
		}


		public int getNumero2() {
			return numero2;
		}


		public void setNumero2(int numero2) {
			this.numero2 = numero2;
		}
		public int suma(){
			
			return  this.numero1 + this.numero2;
			
		}
		public int resta(){
		return this.numero1 - this.numero2;
			
		}
		public int division(){
			return this.numero1 / this.numero2;
		}
		public int multi(){
		return this.numero1 * this.numero2;
		}
		
}
