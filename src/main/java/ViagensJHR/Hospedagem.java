package ViagensJHR;


import javax.persistence.*;

@Entity
public class Hospedagem {
	private int custo;
	@Id
	private String id_hospedagem;
	private String local;
	private String empresa_hospedagem;
	private String email_comite;
	
	@ManyToOne
	@JoinColumn(name="matricula_comite")
	private Comite escolheuHospedagem;
	
	@ManyToOne
	@JoinColumn(name="id_viagem")
	private Viagem dormiuHospedagem;
	
	public String getEmail_comite() {
		return email_comite;
	}
	public void setEmail_comite(String email_comite) {
		this.email_comite = email_comite;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public String getId_hospedagem() {
		return id_hospedagem;
	}
	public void setId_hospedagem(String id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getEmpresa_alimentacao() {
		return empresa_hospedagem;
	}
	public void setEmpresa_alimentacao(String empresa_alimentacao) {
		this.empresa_hospedagem = empresa_alimentacao;
	}
	public Hospedagem(int custo, String id_hospedagem, String local, String empresa_hospedagem, String email_comite) {
		super();
		this.custo = custo;
		this.id_hospedagem = id_hospedagem;
		this.local = local;
		this.empresa_hospedagem = empresa_hospedagem;
		this.email_comite = email_comite;
	}
	public Hospedagem() {
		super();
		// TODO Auto-generated constructor stub
	}
}
