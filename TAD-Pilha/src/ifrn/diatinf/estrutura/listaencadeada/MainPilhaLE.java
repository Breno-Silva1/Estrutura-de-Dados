package ifrn.diatinf.estrutura.listaencadeada;

import java.util.Scanner;

import ifrn.diatinf.estrutura.array.ExceptionPilha;
import ifrn.diatinf.estrutura.listaencadeada.No;
import ifrn.diatinf.estrutura.listaencadeada.PilhaLE;

public class MainPilhaLE {
	public static void main(String[] args) throws ExceptionPilha {
		Scanner input = new Scanner(System.in);
		int x = -1;
		PilhaLE pilha = new PilhaLE();

		while (x != 0) {
			System.out.print("=== MENU ===\n0 - Sair \n1 - push \n2 - pop \n3 - top \n4 - size\n>> ");
			x = input.nextInt();
			switch (x) {
			case 0:
				System.out.println("Programa encerrado!");
				System.exit(0);
				break;
			case 1:
				System.out.print("Inserir: ");
				input.nextLine();
				pilha.push(input.nextLine());
				listarPilha(pilha);
				break;
			case 2:
				System.out.println("Removido: " + pilha.pop().getElemento());
				listarPilha(pilha);
				break;
			case 3:
				System.out.println("Topo: " + pilha.top().getElemento());
				break;
			case 4:
				System.out.println("Tamanho da pilha: " + pilha.size());
				break;
			default:
				break;
			}
		}
		input.close();
	}

	private static void listarPilha(PilhaLE pilha) throws ExceptionPilha {
		if(!pilha.isEmpty()){	
			No aux = pilha.top();
			System.out.println();
			System.out.println("Pilha: ");
			while (aux != null) {
				System.out.println("[" + aux.getElemento() + "] [" + aux.getProximo() + "]");
				aux = aux.getProximo();
			}
			System.out.print("\n");
		}
	}
}