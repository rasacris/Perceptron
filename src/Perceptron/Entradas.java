package Perceptron;

public class Entradas {

	int id;
	String fecha;
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	int e1;
	int e2;
	
	public Entradas(){
		
	}
	
	/**
	 * @param id
	 * @param fecha
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @param n5
	 * @param e1
	 * @param e2
	 */
	public Entradas(int id, String fecha, int n1, int n2, int n3, int n4, int n5, int e1, int e2) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.e1 = e1;
		this.e2 = e2;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getN1() {
		return n1;
	}



	public void setN1(int n1) {
		this.n1 = n1;
	}



	public int getN2() {
		return n2;
	}



	public void setN2(int n2) {
		this.n2 = n2;
	}



	public int getN3() {
		return n3;
	}



	public void setN3(int n3) {
		this.n3 = n3;
	}



	public int getN4() {
		return n4;
	}



	public void setN4(int n4) {
		this.n4 = n4;
	}



	public int getN5() {
		return n5;
	}



	public void setN5(int n5) {
		this.n5 = n5;
	}



	public int getE1() {
		return e1;
	}



	public void setE1(int e1) {
		this.e1 = e1;
	}



	public int getE2() {
		return e2;
	}



	public void setE2(int e2) {
		this.e2 = e2;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
