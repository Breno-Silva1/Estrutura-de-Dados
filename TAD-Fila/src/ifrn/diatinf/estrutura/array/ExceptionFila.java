package ifrn.diatinf.estrutura.array;

public class ExceptionFila extends Exception{
	private static final long serialVersionUID = 1L;

	public ExceptionFila() {
		System.err.println("Fila vazia!");
	}
}
