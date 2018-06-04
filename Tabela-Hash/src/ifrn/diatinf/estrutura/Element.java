package ifrn.diatinf.estrutura;

public class Element {
	private Object key;
	private Object element;
	
	public Element() {
		// TODO Auto-generated constructor stub
	}
	
	public Element(Object k, Object o) {
		this.key = k;
		this.element = o;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}
	
	 
	
}
