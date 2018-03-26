package Excessoes;

public class ViagemNaoExisteException extends Exception{
	public ViagemNaoExisteException() {
		super("A viagem com esse ID não foi cadastrada");
	}
}
