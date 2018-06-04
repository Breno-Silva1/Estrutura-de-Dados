package ifrn.diatinf.estrutura.array;

public class ExceptionPilha extends Exception{
	private static final long serialVersionUID = 1L;

	public ExceptionPilha() {
        System.err.println("Pilha vazia!");
    }
}
