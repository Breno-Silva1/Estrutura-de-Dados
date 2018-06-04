package ifrn.diatinf.estrutura.array;

public class PilhaArray implements InterfacePilha{
	private Object S[]; 
	private int t = -1; 
	private int tamanho;
	
	public PilhaArray(int tam) {
		this.tamanho = tam;
		this.S = new Object[tam];
	}

	public int size() {
		return this.t + 1;
	}

	public boolean isEmpty() {
		return t == -1;
	}

	public Object top() throws ExceptionPilha {
		if(isEmpty()) throw new ExceptionPilha();
		return S[t];
	}

	public void push(Object o) {
		if (size() == tamanho) {
			Object aux[] = new Object[tamanho *= 2];
			for (int i = 0; i < S.length; i++) {
				aux[i] = S[i];
			}
			S = aux;
		}
		S[++t] = o;
	}

	public Object pop() throws ExceptionPilha {
		Object o;
		if(isEmpty()) throw new ExceptionPilha();
		o = S[t];
		S[t--] = null;
		return o;
	}
	
	public Object[] getPilha(){
		return this.S;
	}
	
	public int getTamanho(){
		return tamanho;
	}
}
