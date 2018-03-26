package ViagensJHR;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Viagem {
	private String local;
	@Id
	private String id_viagem;
	
	@OneToMany(mappedBy="viajouTransporte")
	private Set<Transporte> transporteUsado;
	
	@OneToMany(mappedBy="comeuRestaurante")
	private Set<Restaurante> restauranteUsado;
	
	@OneToMany(mappedBy="dormiuHospedagem")
	private Set<Hospedagem> hospedagemUsado;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getId_viagem() {
		return id_viagem;
	}
	public void setId_viagem(String id_viagem) {
		this.id_viagem = id_viagem;
	}
	public Viagem(String local, String id_viagem) {
		super();
		this.local = local;
		this.id_viagem = id_viagem;
	}
	public Viagem() {
		super();
	}
}
