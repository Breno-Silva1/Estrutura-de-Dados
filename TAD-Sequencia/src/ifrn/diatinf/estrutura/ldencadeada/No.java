package ifrn.diatinf.estrutura.ldencadeada;

public class No {
	private Object elemento;
    private No anterior;
    private No proximo;
    
    public No() {
		// TODO Auto-generated constructor stub
	}
    
    public No(Object elemento, No anterior, No proximo){
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    
    
    public Object getElemento(){
        return this.elemento;
    }
    
    public void setElemento(Object elem){
        this.elemento = elem;
    }
    
    public No getAnterior(){
        return this.anterior;
    }
    
    public void setAnterior(No anterior){
        this.anterior = anterior;
    }
    
    public No getProximo(){
        return this.proximo;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public String toString(){
        return "" + this.getElemento();
    } 
}
