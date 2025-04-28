//Programa de aplicação que administra o cadastro de produtos
//Inclui e consulta dados de produto
public class Produto {

	private int peso;
	private double altura;
	
	public Produto() {
		
	}
	
	public Produto(int peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
