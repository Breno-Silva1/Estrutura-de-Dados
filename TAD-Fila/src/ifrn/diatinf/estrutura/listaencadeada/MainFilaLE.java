package ifrn.diatinf.estrutura.listaencadeada;

import java.util.Scanner;

import ifrn.diatinf.estrutura.array.ExceptionFila;
import ifrn.diatinf.estrutura.listaencadeada.No;

public class MainFilaLE {
	public static void main(String[] args) throws ExceptionFila {
		Scanner input = new Scanner(System.in);
		int x = -1;
		FilaLE fila = new FilaLE();

		while (x != 0) {
			System.out.print("=== MENU ===\n0 - Sair \n1 - enqueue \n2 - dequeue \n3 - top \n4 - size\n>> ");
			x = input.nextInt();
			switch (x) {
			case 0:
				System.out.println("Programa encerrado!");
				System.exit(0);
				break;
			case 1:
				System.out.print("Inserir: ");
				input.nextLine();
				fila.push(input.nextLine());
				listarPilha(fila);
				break;
			case 2:
				System.out.println("Removido: " + fila.pop().getElemento());
				listarPilha(fila);
				break;
			case 3:
				System.out.println("Topo: " + fila.init().getElemento());
				break;
			case 4:
				System.out.println("Tamanho da pilha: " + fila.size());
				break;
			default:
				break;
			}
		}
		input.close();
	}

	private static void listarPilha(FilaLE fila) throws ExceptionFila {
		if(!fila.isEmpty()){	
			No aux = fila.init();
			System.out.println();
			System.out.println("Fila: ");
			while (aux != null) {
				System.out.println("[" + aux.getElemento() + "] [" + aux.getProximo() + "]");
				aux = aux.getProximo();
			}
			System.out.print("\n");
		}
	}
}