package ifrn.diatinf.estrutura.ldencadeada;

public class LDESequence {
	private No inicio;
	private No fim;
	private int numElts;

	public LDESequence() {
		this.inicio = new No();
		this.fim = new No();
		this.numElts = 0;
		this.fim.setAnterior(inicio);
		this.inicio.setProximo(fim);
	}

	// MÉTODOS GENÉRICOS
	public int size() {
		return this.numElts;
	}

	public boolean isEmpty() {
		return (numElts == 0);
	}

	// MÉTODOS VETOR
	public No elemAtRank(int r) throws ExceptionSeq {
		No node = atRank(r);
		return node;
	}

	public Object replaceAtRank(int r, Object o) throws ExceptionSeq {
		No node = elemAtRank(r);
		Object t = node.getElemento();
		node.setElemento(o);
		return t;
	}

	public void insertAtRank(int r, Object o) throws ExceptionSeq {
		No node = atRank(r);
		No newNode = new No(o, node.getAnterior(), node);
		node.getAnterior().setProximo(newNode);
		node.setAnterior(newNode);
		numElts++;
	}

	public Object removeAtRank(int r) throws ExceptionSeq {
		No node = atRank(r);
		Object t = node.getElemento();
		remove(node);
		return t;
	}

	// MÉTODOS LISTA
	public No first() {
		return inicio.getProximo();
	}

	public No last() {
		return fim.getAnterior();
	}

	public No before(No n) {
		return n.getAnterior();
	}

	public No after(No n) {
		return n.getProximo();
	}

	public Object replaceElement(No n, Object o) {
		Object t = n.getElemento(); 
		n.setElemento(o);
		return t;
	}

	public void swapElements(No n, No q) {
		Object t = n.getElemento();
		n.setElemento(q.getElemento());
		q.setElemento(t);
	}

	public void insertBefore(No no, Object o) throws ExceptionSeq {
		No v = new No(o, no.getAnterior(), no); //(element, anterior, próximo)
		no.getAnterior().setProximo(v);;
		no.setAnterior(v);
		numElts++;
	}

	public void insertAfter(No no, Object o) throws ExceptionSeq {
		No v = new No(o, no, no.getProximo());
		no.getProximo().setAnterior(v);
		no.setProximo(v);
		numElts++;
	}

	public void insertFirst(Object o) throws ExceptionSeq {
		No v = new No(o, inicio, inicio.getProximo());
		inicio.getProximo().setAnterior(v);
		inicio.setProximo(v);
		numElts++;
	}

	public void insertLast(Object o) throws ExceptionSeq {
		No v = new No(o, fim.getAnterior(), fim);
		fim.getAnterior().setProximo(v);
		fim.setAnterior(v);
		numElts++;
	}

	public Object remove(No no) throws ExceptionSeq {
		Object t = no.getElemento();
		no.getAnterior().setProximo(no.getProximo());
		no.getProximo().setAnterior(no.getAnterior());
		no.setProximo(null);
		no.setAnterior(null);
		numElts--;
		return t;
	}

	// MÉTODOS "PONTES"
	public No atRank(int r) {
		No node;
		if (r <= size() / 2) {
			node = inicio.getProximo();
			for (int i = 0; i < r; i++)
				node = node.getProximo();
		} else {
			node = fim.getAnterior();
			for (int i = 0; i < size() - r - 1; i++)
				node = node.getAnterior();
		}
		return node;
	}

	public int rankOf(No no) {
		No n = inicio.getProximo();
		int r = 0;
		while (n != no && n != fim) {
			n = n.getProximo();
			r++;
		}
		return r;
	}
}
