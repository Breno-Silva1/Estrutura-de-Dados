package ifrn.diatinf.estrutura.exceptions;

public class NO_SUCH_KEY extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NO_SUCH_KEY() {
		System.err.println("Key not found!");
	}
}
