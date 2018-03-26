package ViagensJHR;

import Excessoes.*;

public interface ViagensFacade {
	
	//Aluno
	public Alunos adicionaAluno(String matricula, String email, String nome) throws ErroGeralException, AlunoJaExisteException, NuloException;
	public Alunos removeAluno(String matricula) throws ErroGeralException, AlunoNaoExisteException;
	public Alunos listarAluno();
	public Alunos pesquisaAluno(String matricula) throws ErroGeralException, AlunoNaoExisteException;
	
	//Alimentação
	public Restaurante adicionaEmpresaA(String empresa_alimentacao, String id_alimentacao, String local, int custo) throws ErroGeralException, EmpresaJaCadastradaException;
	public Restaurante removerEmpresaA(String id_alimentacao) throws EmpresaNaoCadastradaException;
	
	// Hospedagem
	public Hospedagem adicionaEmpresaH(int custo, String id_hospedagem, String local, String empresa_hospedagem, String email_comite) throws ErroGeralException, EmpresaJaCadastradaException;
	
	//Transporte
	public Transporte adicionaTransporte(String id_transporte, String transporte_ida, String transporte_volta, String empresa_transporte, int custo) throws ErroGeralException, EmpresaJaCadastradaException;
	public Transporte removeTransporte(String id_transporte) throws EmpresaNaoCadastradaException;
		
	//Comite
	public Comite adicionaAlunoComite(String matricula_comite, String email_comite, String cargo, String nome_comite) throws ErroGeralException, AlunoJaExisteException;
	public Comite removeAlunoComite(String matricula_comite) throws AlunoNaoExisteException;
	public Comite listarAlunosComite();
	public Comite pesquisarAlunosComite(String matricula) throws AlunoNaoExisteException;
		
	//Mensalidade
	public Mensalidade adicionaDataDosPagamentos(String data) throws ErroGeralException;
	public Mensalidade quantidadeASerCobrada(int quant_fixa);
	public Mensalidade saldo(int quant_fixa) throws ErroGeralException;
	
	//Patrocinio
	public Patrocinio adicionaPatrocinio(String cnpj, int quant) throws ErroGeralException;
	public Patrocinio removerPatrocinio(String cnpj) throws ErroGeralException;
	
	//Viagem
	public Viagem adicionaViagem(String id_viagem, String local) throws ErroGeralException;
	public Viagem removeViagem(String id_viagem) throws ErroGeralException;
}
