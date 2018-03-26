package ViagensJHR;

import javax.persistence.*;

@Entity
public class Patrocinio {
	@Id
	private String cnpj;
	private int quant;
	
	@ManyToOne
	@JoinColumn(name="matricula_comite")
	private Comite patrocinou;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public Patrocinio(String cnpj, int quant) {
		super();
		this.cnpj = cnpj;
		this.quant = quant;
	}
	
	public Patrocinio() {
		super();
	}
}
