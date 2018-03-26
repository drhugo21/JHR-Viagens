package ViagensJHR;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Comite {
	private String nome_comite;
	private String cargo;
	private String email_comite;
	@Id
	private String matricula_comite;
	
	@OneToMany(mappedBy="participantes")
	private Set<Alunos> alunosParticipantes;
	
	@OneToMany(mappedBy="patrocinou")
	private Set<Patrocinio> patrocinadores;
	
	@OneToMany(mappedBy="escolheuHospedagem")
	private Set<Hospedagem> empresaHospedagem;
	
	@OneToMany(mappedBy="escolheuRestaurante")
	private Set<Restaurante> empresaRestaurante;
	
	@OneToMany(mappedBy="escolheuTransporte")
	private Set<Transporte> empresaTransporte;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email_comite;
	}
	public void setEmail(String email) {
		this.email_comite = email;
	}
	public String getMatricula() {
		return matricula_comite;
	}
	public void setMatricula(String matricula) {
		this.matricula_comite = matricula;
	}
	public String getNome_comite() {
		return nome_comite;
	}
	public void setNome_comite(String nome_comite) {
		this.nome_comite = nome_comite;
	}
	public Comite(String cargo, String email_comite, String matricula_comite, String nome_comite) {
		super();
		this.nome_comite = nome_comite;
		this.cargo = cargo;
		this.email_comite = email_comite;
		this.matricula_comite = matricula_comite;
	}
	
	public Comite() {
		super();
	}
}
