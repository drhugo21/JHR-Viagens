package ViagensJHR;

import javax.persistence.*;

@Entity
public class Restaurante {
	private int custo;
	@Id
	private String id_alimentacao;
	private String empresa_alimentacao;
	private String local;
	
	@ManyToOne
	@JoinColumn(name="matricula_comite")
	private Comite escolheuRestaurante;
	
	@ManyToOne
	@JoinColumn(name="id_viagem")
	private Viagem comeuRestaurante;
	
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public String getId_alimentacao() {
		return id_alimentacao;
	}
	public void setId_alimentacao(String id_alimentacao) {
		this.id_alimentacao = id_alimentacao;
	}
	public String getEmpresa_alimentacao() {
		return empresa_alimentacao;
	}
	public void setEmpresa_alimentacao(String empresa_alimentacao) {
		this.empresa_alimentacao = empresa_alimentacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Restaurante(int custo, String id_alimentacao, String empresa_alimentacao, String local) {
		super();
		this.custo = custo;
		this.id_alimentacao = id_alimentacao;
		this.empresa_alimentacao = empresa_alimentacao;
		this.local = local;
	}
	
	public Restaurante() {
		super();
	}
}
