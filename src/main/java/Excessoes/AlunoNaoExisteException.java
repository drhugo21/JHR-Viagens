package Excessoes;

public class AlunoNaoExisteException extends Exception {
	public AlunoNaoExisteException() {
		super("Essa matricula não está cadastrada.");
	}
}
