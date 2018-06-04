package ifrn.diatinf.estrutura;

public class MainMS {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();

		int S[] = { 4, 5, 2, 1, 3 };
		
		ms.mergeSort(S);
		ms.printArray(S);
		
	}
}
