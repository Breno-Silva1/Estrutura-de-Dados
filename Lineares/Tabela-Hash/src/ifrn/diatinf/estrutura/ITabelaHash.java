package ifrn.diatinf.estrutura;

import ifrn.diatinf.estrutura.exceptions.FULL_TABLE;
import ifrn.diatinf.estrutura.exceptions.NO_SUCH_KEY;

public interface ITabelaHash {
	public int size();
	public boolean isEmpty();
	public int[] keyes();
	public Object[] elements();
	public void insertElement(int k, Object o) throws FULL_TABLE; 
	public Object removeElement(int k) throws NO_SUCH_KEY;
	public Object findElement(int k) throws NO_SUCH_KEY;
}
