package ifrn.diatinf.estrutura.listaencadeada;
import ifrn.diatinf.estrutura.array.ExceptionPilha;

public class PilhaLE {
	protected No t;
	protected int size;
	
	public PilhaLE() {
		this.t = null;
		this.size = 0;
	}
	
	public int size() {return size;}
	
	public boolean isEmpty(){
		if (t == null) return true;
		return false;
	}
	
	public No top() throws ExceptionPilha{
		if (isEmpty()) throw new ExceptionPilha();
		return t;
	}
	
	public void push(Object o){
		No no = new No();
		no.setElemento(o);
		no.setProximo(t);
		t = no;
		size++;
	}
	
	public No pop() throws ExceptionPilha{
		if (isEmpty()) throw new ExceptionPilha();
		No o = t;
		t = t.getProximo();
		size--;
		return o;
	}
}
