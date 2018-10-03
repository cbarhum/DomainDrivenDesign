package br.com.fiap.beans;

public class Cargo implements Comparable<Cargo>{
	private String nome;
	private String nivel;
	private double salario;
	
	/*public int compareTo(Cargo outro) {
		if(this.salario>outro.salario) {
			return 1;
		}else if(this.salario<outro.salario) {
			return -1;
		}else {
			return 0;
		}
	}*/
	
	//Compara nome em ordem alfab�tica
	/*public int compareTo(Cargo outro) {
	return this.nome.compareTo(outro.nome);*/

	//Compara em ordem reversa alfab�tica
	public int compareTo(Cargo outro) {
		return -this.nome.compareTo(outro.nome);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	
}
