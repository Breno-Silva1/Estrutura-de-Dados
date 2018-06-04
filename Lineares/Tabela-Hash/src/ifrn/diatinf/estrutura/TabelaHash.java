package ifrn.diatinf.estrutura;

import ifrn.diatinf.estrutura.exceptions.FULL_TABLE;
import ifrn.diatinf.estrutura.exceptions.NO_SUCH_KEY;

public class TabelaHash implements ITabelaHash{
	private int s;
	private Element table[];
	static final String AVAILABLE = "AVAILABLE";
	int  p, i = 0, capacity = 101;
	
	public TabelaHash() {
		this.table = new Element[capacity];
		this.s = 0;
	}

	public int size() {
		return s;
	}

	public boolean isEmpty() {
		return s == 0;
	}

	public int[] keyes() {
		int[] keys = new int[s];
		int x = 0;
		
		for (int i = 0; i < s; i++)
			if (table[i] != null && table[i].getElement() != AVAILABLE)
				keys[x++] = (int) table[i].getKey();
			
		return keys;
	}

	public Object[] elements() {
		Object[] elements = new Object[s];
		int x = 0;
		
		for (int i = 0; i < s; i++)
			if (table[i] != null && table[i].getElement() != AVAILABLE)
				elements[x++] = table[i].getElement();
			
		return elements;
	}

	public void insertElement(int k, Object o) throws FULL_TABLE{
		if(s == capacity)
			throw new FULL_TABLE();
		
		i = hashCode(k);
		p = 0;
		
		//Linear Probing
		while(p != capacity) {
			if (table[i] == null || table[i].getElement() == AVAILABLE) {
				table[i] = new Element(k, o);
				s++;
				break;
			} else {
				i = (i + 1) % capacity;
				k++;
				p++;
			}
		}
	}

	public Object findElement(int k) throws NO_SUCH_KEY {
		i = hashCode(k);
		p = 0;
		
		do{
			if (table[i] == null) {
				throw new NO_SUCH_KEY();
			} else if (((int) table[i].getKey()) == k){
				return table[i].getElement();
			} else {
				i = i + 1 % capacity;
				p++;
			}
		}while(p != capacity);
		
		return new NO_SUCH_KEY();
	}
	
	public Object removeElement(int k) throws NO_SUCH_KEY {
		i = hashCode(k);
		Object o;
		
		if (table[i] == null) {
			return new NO_SUCH_KEY();
		} else {
			o = findElement(k);
			table[i].setElement(AVAILABLE);
			s--;
		}
		
		return o;
	}
	
	public int hashCode(int k){
		return k % capacity;
	}
	
}
