package Excessoes;

public class EmpresaNaoCadastradaException extends Exception{
	public EmpresaNaoCadastradaException() {
		super("A empresa não foi cadastrada com esse ID");
	}
}
