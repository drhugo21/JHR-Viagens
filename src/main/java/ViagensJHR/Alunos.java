package ViagensJHR;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.hibernate.mapping.Array;

@ManagedBean
@ViewScoped
public class Alunos {	
	private String nome;
	private String matricula;
	private String email;
	
	private List<String> nomes = new ArrayList();
	private List<String> matriculas = new ArrayList();
	private List<String> emails = new ArrayList();
	
	public List<String> getNomes(){
		return nomes;
	}
	
	public List<String> getMatriculas(){
		return matriculas;
	}
	
	public List<String> getEmails(){
		return emails;
	}
	
	public void addNome() {
		nomes.add(getNome());
	}
	
	public void addMatricula() {
		matriculas.add(getMatricula());
	}
	
	public void addEmail() {
		emails.add(getEmail());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Alunos() {
	}
}
