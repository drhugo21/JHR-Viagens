package ViagensJHR;

import javax.persistence.*;

@Entity
public class Mensalidade {
	private String matriculaAlunoPagou;
	private String data;
	@Id
	private int quant_fixa;
	private int soma;
	
	@ManyToOne
	@JoinColumn(name="matricula")
	private Alunos pagou;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getQuant_fixa() {
		return quant_fixa;
	}
	public void setQuant_fixa(int quant_fixa) {
		this.quant_fixa = quant_fixa;
	}
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public String getMatriculaAlunoPagou() {
		return matriculaAlunoPagou;
	}
	public void setMatriculaAlunoPagou(String matriculaAlunoPagou) {
		this.matriculaAlunoPagou = matriculaAlunoPagou;
	}
	public Mensalidade(String matriculaAlunoPagou, String data, int quant_fixa, int soma, Alunos pagou) {
		super();
		this.matriculaAlunoPagou = matriculaAlunoPagou;
		this.data = data;
		this.quant_fixa = quant_fixa;
		this.soma = soma;
		this.pagou = pagou;
	}
	public Mensalidade() {
		super();
	}
	
	
}
