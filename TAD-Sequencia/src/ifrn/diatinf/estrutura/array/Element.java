package ifrn.diatinf.estrutura.array;

public class Element {
	private int index;
	private Object o;
	
	public Element(int i, Object o) {
		this.index = i;
		this.o = o;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	@Override
	public String toString() {
		return "" + o;
	}
	
	
	
}
