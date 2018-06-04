package ifrn.diatinf.estrutura.array;

public interface InterfacePilha {
	
	public int size();

	public boolean isEmpty();

	public Object top() throws ExceptionPilha;

	public void push(Object o);

	public Object pop() throws ExceptionPilha;
}