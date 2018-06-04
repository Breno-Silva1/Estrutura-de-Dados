package ifrn.diatinf.estrutura.array;

public class ArrayFila implements InterfaceFila {
	private Object Q[];
	private int i;
	private int f;
	private int n;

	public ArrayFila(int n) {
		this.n = n;
		this.Q = new Object[n];
	}

	public int tamanho() {
		return (n - i + f) % n;
	}

	public boolean estaVazia() {
		return (i == f);
	}

	public Object inicio() throws ExceptionFila {
		if (estaVazia()) throw new ExceptionFila();
		return Q[i];
	}

	public void enfileirar(Object o) {
		if (tamanho() == n - 1) {
			n *= 2;
		} else {
			Object aux[] = new Object[n];
			int inicio = i;
			
			for(int j = 0; j < tamanho(); j++) {
				aux[j] = Q[inicio];
				inicio = (inicio + 1) % n;
			}
			
			f = tamanho();
			i = 0;
			this.Q = aux;
		}
		Q[f] = o;
		f = (f + 1) % n;
	}

	public Object desenfileirar() throws ExceptionFila {
		Object o;
		if (estaVazia()) throw new ExceptionFila();
		o = Q[i];
		Q[i] = null;
		i = (i + 1) % n;
		return o;
	}

	public Object[] getFila() {
		return this.Q;
	}
}
