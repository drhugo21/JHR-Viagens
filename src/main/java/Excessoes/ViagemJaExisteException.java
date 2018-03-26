package Excessoes;

public class ViagemJaExisteException extends Exception{
	public ViagemJaExisteException() {
		super("Já existe uma viagem com esse Id cadastrado.");
	}
}
