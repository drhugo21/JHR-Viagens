package ViagensJHR;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Excessoes.*;


public class MetodosViagens implements ViagensFacade {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ViagensJHRBD");
    EntityManager entitymanager = emfactory.createEntityManager( );
	
    
    //Alunos
    
	public Alunos adicionaAluno(String matricula, String email, String nome)
			throws ErroGeralException, AlunoJaExisteException, NuloException {
		entitymanager.getTransaction( ).begin( );
		Alunos a = new Alunos();
		
		if(entitymanager.find(Alunos.class,matricula) != a) {
			entitymanager.persist(a);
		} else if(entitymanager.find(Alunos.class, matricula) == a) {
			throw new AlunoJaExisteException();
		} else if(entitymanager.contains(null)) {
			throw new NuloException();
		} else {
			throw new ErroGeralException(); 
		}
		
		entitymanager.close();
		return a;
	}

	@SuppressWarnings("unused")
	public Alunos removeAluno(String matricula) throws ErroGeralException, AlunoNaoExisteException {
		entitymanager.getTransaction( ).begin( );
		Alunos a = entitymanager.find(Alunos.class, matricula);
		
		if (a != null){
			entitymanager.remove(a);
		} else if (a == null){
			throw new AlunoNaoExisteException();
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return a;
	}

	@SuppressWarnings("unchecked")
	public Alunos listarAluno() {
		Query query = entitymanager.createQuery("FROM Alunos");
		List<Alunos> resultList = query.getResultList();
		return (Alunos) resultList;
	}

	public Alunos pesquisaAluno(String matricula) throws AlunoNaoExisteException {
		entitymanager.getTransaction( ).begin( );
		Alunos a = entitymanager.find(Alunos.class, matricula);
		
		if(a == null) {
			throw new AlunoNaoExisteException();
		}		
		
		entitymanager.close();
		return a;
	}

	
	//Empresa Alimenticia
	
	
	public Restaurante adicionaEmpresaA(String empresa_alimentacao, String id_alimentacao, String local, int custo)
			throws ErroGeralException, EmpresaJaCadastradaException {
		entitymanager.getTransaction( ).begin( );
		Restaurante r = new Restaurante(custo, id_alimentacao, local, empresa_alimentacao);
		
		if(entitymanager.find(Restaurante.class, id_alimentacao) != r) {
			entitymanager.persist(r);
		} else if (entitymanager.find(Restaurante.class, id_alimentacao) == r){
			throw new EmpresaJaCadastradaException();
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return r;
	}

	public Restaurante removerEmpresaA(String id_alimentacao) throws EmpresaNaoCadastradaException {
		entitymanager.getTransaction( ).begin( );
		Restaurante r = entitymanager.find(Restaurante.class, id_alimentacao);
		
		if(r == null) {
			throw new EmpresaNaoCadastradaException();
		} else {
			entitymanager.remove(r);
		}	
		
		entitymanager.close();
		return r;
	}

	
	//Empresa hospedagem
	
	
	public Hospedagem adicionaEmpresaH(int custo, String id_hospedagem, String local, String empresa_hospedagem, String email_comite)
			throws ErroGeralException, EmpresaJaCadastradaException {
		entitymanager.getTransaction( ).begin( );
		Hospedagem h = new Hospedagem(custo, id_hospedagem, local, empresa_hospedagem, email_comite);
		
		if(entitymanager.find(Hospedagem.class,id_hospedagem) != h) {
			entitymanager.persist(h);
		} else if(entitymanager.find(Hospedagem.class,id_hospedagem) == h) {
			throw new EmpresaJaCadastradaException();
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return h;
	}
	
	public Hospedagem removerEmpresaH(String id_hospedagem) throws EmpresaNaoCadastradaException{
		entitymanager.getTransaction( ).begin( );
		Hospedagem h = entitymanager.find(Hospedagem.class, id_hospedagem);
		
		if(h == null) {
			throw new EmpresaNaoCadastradaException();
		} else {
			entitymanager.remove(h);
		}
		
		entitymanager.close();
		return h;
	}
	
	
	//Empresa Transporte

	
	public Transporte adicionaTransporte(String id_transporte, String transporte_ida, String transporte_volta,
			String empresa_transporte, int custo) throws ErroGeralException, EmpresaJaCadastradaException{
		entitymanager.getTransaction( ).begin( );
		Transporte t = new Transporte(id_transporte, transporte_ida, transporte_volta, empresa_transporte, custo);
		
		if(entitymanager.find(Transporte.class,id_transporte) != t) {
			entitymanager.persist(t);
		} else if(entitymanager.find(Transporte.class,id_transporte) == t) {
			throw new EmpresaJaCadastradaException();
		}
		else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return t;
	}

	public Transporte removeTransporte(String id_transporte) throws EmpresaNaoCadastradaException{
		Transporte t = entitymanager.find(Transporte.class, id_transporte);
		
		if(t == null) {
			throw new EmpresaNaoCadastradaException();
		} else {
			entitymanager.remove(t);
		}
		
		entitymanager.close();
		return t;	
	}
	
	
	//Comite
	
	
	public Comite adicionaAlunoComite(String matricula_comite, String email_comite, String cargo, String nome_comite) throws ErroGeralException, AlunoJaExisteException{
		entitymanager.getTransaction( ).begin( );
		Comite c = new Comite(matricula_comite, email_comite, cargo, nome_comite);
		
		if(entitymanager.find(Comite.class,matricula_comite) != c) {
			entitymanager.persist(c);
		} else if(entitymanager.find(Comite.class,matricula_comite) == c) {
			throw new AlunoJaExisteException();
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();	
		return null;
	}

	public Comite removeAlunoComite(String matricula_comite)throws AlunoNaoExisteException{
		entitymanager.getTransaction( ).begin( );
		Comite c = entitymanager.find(Comite.class, matricula_comite);
		
		if(c == null) {
			throw new AlunoNaoExisteException();
		} else {
			entitymanager.remove(c);
		}
		
		entitymanager.close();
		return c;
	}

	public Comite listarAlunosComite(){
		Query query = entitymanager.createQuery("FROM Comite");
		List<Comite> resultList = query.getResultList();
		return (Comite) resultList;
	}

	public Comite pesquisarAlunosComite(String matricula_comite) throws AlunoNaoExisteException{
		entitymanager.getTransaction( ).begin( );
		Comite c = entitymanager.find(Comite.class, matricula_comite);
		
		if(c == null) {
			throw new AlunoNaoExisteException();
		} 
		
		entitymanager.close();
		return c;
	}
	

	//Mensalidade dos alunos
	
	

	private Mensalidade Mensalidade(int i) {
		return null;
	}
	
	public Mensalidade adicionaDataDosPagamentos(String data) throws ErroGeralException{
		entitymanager.getTransaction( ).begin( );
		Mensalidade m = new Mensalidade(null, data, 0, 0, null);
		
		if(entitymanager.find(Mensalidade.class,data) != m) {
			entitymanager.persist(m);
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return m;
	}

	public Mensalidade quantidadeASerCobrada(int quant_fixa){
		entitymanager.getTransaction( ).begin( );
		Mensalidade q = new Mensalidade(null, null, quant_fixa, quant_fixa, null);
		entitymanager.persist(q);
		entitymanager.close();
		return q;
	}

	public Mensalidade saldo(int quant_fixa) throws ErroGeralException{
		entitymanager.getTransaction( ).begin( );
		Mensalidade s = new Mensalidade(null, null, quant_fixa, 0, null);
		int cont = 0;
		s = Mensalidade(quant_fixa * cont);
		return s;
	}
	
	
	//Patrocinio
	
	
	public Patrocinio adicionaPatrocinio(String cnpj, int quant) throws ErroGeralException{
		entitymanager.getTransaction( ).begin( );
		Patrocinio p = new Patrocinio(cnpj, quant);
		
		if(entitymanager.find(Patrocinio.class,cnpj) != p) {
			entitymanager.persist(p);
		} else {
			throw new ErroGeralException();
		}
		
		entitymanager.close();
		return p;
	}

	public Patrocinio removerPatrocinio(String cnpj) throws ErroGeralException{
		Patrocinio p = entitymanager.find(Patrocinio.class, cnpj);
		if(p == null) {
			throw new ErroGeralException();
		} else {
			entitymanager.remove(p);
		}
		
		entitymanager.close();
		return p;
	}

	
	//Viagem

	
	public Viagem adicionaViagem(String id_viagem, String local) throws ErroGeralException{
		entitymanager.getTransaction( ).begin( );
		Viagem v = new Viagem(id_viagem, local);
		if(entitymanager.find(Viagem.class,id_viagem) != v) {
			entitymanager.persist(v);
		} 
		else {
			throw new ErroGeralException();
		}
		entitymanager.close();
		return v;
	}

	public Viagem removeViagem(String id_viagem) throws ErroGeralException{
		Viagem v = entitymanager.find(Viagem.class, id_viagem);
		if(v == null) {
			throw new ErroGeralException();
		}
		else {
			entitymanager.remove(v);
		}
		entitymanager.close();
		return v;
	}
}
