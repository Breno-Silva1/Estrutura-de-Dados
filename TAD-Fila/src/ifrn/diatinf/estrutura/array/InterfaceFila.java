package ifrn.diatinf.estrutura.array;

public interface InterfaceFila {
	
	public int tamanho();

	public boolean estaVazia();

	public Object inicio() throws ExceptionFila;

	public void enfileirar(Object o);

	public Object desenfileirar() throws ExceptionFila;
}
