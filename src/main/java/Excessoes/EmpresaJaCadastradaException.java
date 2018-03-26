package Excessoes;

public class EmpresaJaCadastradaException extends Exception {
	public EmpresaJaCadastradaException() {
		super("Essa empresa já foi cadastrada com esse ID.");
	}
}
