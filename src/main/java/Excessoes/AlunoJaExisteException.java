package Excessoes;

public class AlunoJaExisteException extends Exception {
	public AlunoJaExisteException() {
		super("Essa matricula já foi cadastrada.");
	}
}
