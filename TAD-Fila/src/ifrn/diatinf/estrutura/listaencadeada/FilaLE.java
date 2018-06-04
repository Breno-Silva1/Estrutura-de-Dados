package ifrn.diatinf.estrutura.listaencadeada;
import ifrn.diatinf.estrutura.array.ExceptionFila;

public class FilaLE {
	protected No i;
	protected No f;
	protected int size;
	
	public FilaLE() {
		this.i = null;
		this.f = null;
		this.size = 0;
	}
	
	public int size() {return size;}
	
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	public No init() throws ExceptionFila{
		if (isEmpty()) throw new ExceptionFila();
		return i;
	}
	
	public void push(Object o){
		No no = new No();
		no.setElemento(o);
		no.setProximo(null);
		
		if (size == 0)
			i = no;
		else 
			f.setProximo(no);
		f = no;
		size++;
	}
	
	public No pop() throws ExceptionFila{
		if (isEmpty()) throw new ExceptionFila();
		No o = i;
		i = i.getProximo();
		size--;
		return o;
	}
}
