package ViagensJHR;

import javax.persistence.*;

@Entity
public class Transporte {
	@Id
	private String id_transporte;
	private String tansporte_ida;
	private String transporte_volta;
	private String empresa_transporte;
	private int custo;
	
	@ManyToOne
	@JoinColumn(name="matricula_comite")
	private Comite escolheuTransporte;
	
	@ManyToOne
	@JoinColumn(name="id_viagem")
	private Viagem viajouTransporte;
	
	public String getId_transporte() {
		return id_transporte;
	}
	public void setId_transporte(String id_transporte) {
		this.id_transporte = id_transporte;
	}
	public String getTansporte_ida() {
		return tansporte_ida;
	}
	public void setTansporte_ida(String tansporte_ida) {
		this.tansporte_ida = tansporte_ida;
	}
	public String getTransporte_volta() {
		return transporte_volta;
	}
	public void setTransporte_volta(String transporte_volta) {
		this.transporte_volta = transporte_volta;
	}
	public String getEmpresa_transporte() {
		return empresa_transporte;
	}
	public void setEmpresa_transporte(String empresa_transporte) {
		this.empresa_transporte = empresa_transporte;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public Transporte(String id_transporte, String tansporte_ida, String transporte_volta, String empresa_transporte,
			int custo) {
		super();
		this.id_transporte = id_transporte;
		this.tansporte_ida = tansporte_ida;
		this.transporte_volta = transporte_volta;
		this.empresa_transporte = empresa_transporte;
		this.custo = custo;
	}
	
	public Transporte() {
		super();
	}
}
