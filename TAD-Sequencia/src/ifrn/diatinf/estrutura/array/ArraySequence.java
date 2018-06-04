package ifrn.diatinf.estrutura.array;

public class ArraySequence {
	private Element[] sequence;
	private int n; //capacidade
	private int s = 0; //contador
	
	public ArraySequence(int n) {
		this.n = n;
		this.sequence = new Element[n];
	}
	
	// MÉTODOS GENÉRICOS
	public int size(){
		return s;
	}
	
	public boolean isEmpty(){
		return s == 0;
	}
	
	// MÉTODOS VETOR
	public Object elemAtRank(int r) throws ExceptionSeq{
		if(r >= 0 && r < size()){
			return sequence[r];
		} else {
			throw new ExceptionSeq();
		}
	}
	
	public Object replaceAtRank(int r, Object o) throws ExceptionSeq{
		if(r >= 0 && r < size()){
			Object temp = sequence[r].getO();
			sequence[r].setO(o);
			return temp;
		} else {
			throw new ExceptionSeq();
		}
	}
	
	public void insertAtRank(int r, Object o) throws ExceptionSeq{
		if(r >= 0 && r <= capacity()){
			if (size() >= capacity()) {
				n *= 2;
				Element[] aux = new Element[n];
				for (int i = 0; i < size(); i++) {
					aux[i] = sequence[i];
				}
				sequence = aux;
			}
			for (int i = size()-1; i >= r; i--) {
				sequence[i+1] = sequence[i];
			}
			Element e = new Element(r, o);
			sequence[r] = e;
			s++;
		} else {
			throw new ExceptionSeq();
		}
	}
	
	public Object removeAtRank(int r) throws ExceptionSeq{
		if(r >= 0 && r < size()){
			Element o = sequence[r];
			
			for (int i = r; i < size()-1; i++) {
				sequence[i] = sequence[i+1];
			}
			sequence[s-1] = null;
			s--;
			return o;
		} else {
			throw new ExceptionSeq();
		}
	}
	
	// MÉTODOS LISTA
	public Object first() throws ExceptionSeq{
		if(isEmpty())
			throw new ExceptionSeq(); 
		return sequence[0];
	}
	
	public Object last() throws ExceptionSeq{
		if(isEmpty())
			throw new ExceptionSeq(); 
		return sequence[size()-1];
	}
	
	public Object before(Element e) throws ExceptionSeq{
		int index = e.getIndex();
		if(size()-1 <= 0) 
			throw new ExceptionSeq();
		return sequence[index-1];
	}
	
	public Object after(Element e) throws ExceptionSeq {
		int index = e.getIndex();
		if(index >= size()-1) 
			throw new ExceptionSeq();
		return sequence[index+1];
	}
	
	public Object replaceElement(int n, Object o) throws ExceptionSeq {
		if(n < 0 && n > size())
			throw new ExceptionSeq();
		Object temp = sequence[n].getO();
		sequence[n].setO(o);
		return temp;
	}
	
	public void swapElements(Element a, Element b) throws ExceptionSeq{
		int n = a.getIndex();
		int q = b.getIndex();
		if((n < 0 && n > size()-1) && (q < 0 && q > size()-1))
			throw new ExceptionSeq();
		sequence[n] = b;
		sequence[q] = a;
	}
	
	public void insertBefore(Element n, Object o) throws ExceptionSeq{
		int index = n.getIndex();
		index--;
		insertAtRank(index, o);
	}
	
	public void insertAfter(Element n, Object o) throws ExceptionSeq{
		int index = n.getIndex();
		index++;
		insertAtRank(index, o);
	}
	
	public void insertFirst(Object o) throws ExceptionSeq{
		insertAtRank(0, o);
	}
	
	public void insertLast(Object o) throws ExceptionSeq {
		insertAtRank(size(), o);
	}
	
	public Object remove(Element n) throws ExceptionSeq{
		int index = n.getIndex();
		return removeAtRank(index);
	}
	
	// MÉTODOS "PONTE"
	public Object atRank(int r){
		return sequence[r];
	}

	public int rankOf(Object o) {
        for (int i = 0; i <= size()-1; i++)
            if(sequence[i].getO().toString().equals(o))
                return i;
        return -1; 
    }
	
	// MÉTODOS ADICIONAIS
	public Object[] getSequence(){
		return this.sequence;
	}
	
	public int capacity(){
		return n;
	}
	
}
