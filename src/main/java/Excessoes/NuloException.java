package Excessoes;

public class NuloException extends Exception{
	public NuloException() {
		super("Há alguma opção que não foi colocada. Por favor, preencha todos os espaços.");
	}
}
