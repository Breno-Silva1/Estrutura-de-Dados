package ifrn.diatinf.estrutura;

class MergeSort {

	public MergeSort() {

	}

	public void merge(int arr[], int left, int middle, int right) {

		int sideL = middle - left + 1; /* METADE ESQUERDA */
		int sideR = right - middle;    /* METADE DIREITA */

		int L[] = new int[sideL]; /* ARRANJO E. */
		int R[] = new int[sideR]; /* ARRANJO D. */
		
		// POPULANDO ARRANJOS
		for (int i = 0; i < sideL; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < sideR; ++j)
			R[j] = arr[middle + 1 + j];

		int i = 0, j = 0, k = left;
		
		// ORDENAÇÃO
		while (i < sideL && j < sideR) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < sideL) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < sideR) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	// CHAMADAS RECURSIVAS
	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int m = (left + right) / 2;
			sort(arr, left, m);
			sort(arr, m + 1, right);
			merge(arr, left, m, right);
		}
	}
	
	// SIMPLIFICANDO CHAMADA DA FUNÇÃO
	public void mergeSort(int arr[]) {
		int l = 0;
		int r = arr.length - 1;
		sort(arr, l, r);
	}
	
	// IMPRIMIR RESULTADO DA ORDENAÇÃO
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}
}