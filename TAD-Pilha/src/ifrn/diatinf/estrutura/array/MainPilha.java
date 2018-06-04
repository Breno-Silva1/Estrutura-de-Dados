package ifrn.diatinf.estrutura.array;

import java.util.Scanner;

public class MainPilha {
	public static void main(String[] args) throws ExceptionPilha {
		Scanner input = new Scanner(System.in);
		int tamanho, opc = - 1;
		Object epush, epop;

		System.out.print("Tamanho da Pilha: ");
		tamanho = input.nextInt();

		PilhaArray pilha = new PilhaArray(tamanho);
		
		while(opc != 0){
			menu();
			opc = input.nextInt();
	
			switch (opc) {
			case 0:
				System.out.println("> Programa encerrado!");
				System.exit(0);
				break;
	
			case 1:
				System.out.print("Inserir: ");
				epush = input.nextLine();
				epush = input.nextLine();
				pilha.push(epush);
				imprimirPilha(pilha);
				break;
	
			case 2:
				epop = pilha.pop();
				imprimirPilha(pilha);
				System.out.println("Objeto removido: " + epop);
				break;
	
			case 3:
				System.out.println("Topo da pilha: " + pilha.top());
				break;
	
			case 4:
				System.out.println("Tamanho da pilha: " + pilha.size());
				break;
				
			case 5:
				System.out.println("Capacidade da pilha: " + pilha.getTamanho());
				break;

			default:
				System.out.println("> Opção inválida!");
				break;
			}
		}
		input.close();
	}

	public static void imprimirPilha(PilhaArray p) {
		Object elementos[] = p.getPilha();
		for (int i = (p.size()-1); i >= 0; i--) {
			System.out.println(elementos[i]);
		}
	}

	public static void menu() {
		System.out.println();
		System.out.println("===== MENU =====");
		System.out.println("0. exit");
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. top");
		System.out.println("4. size");
		System.out.println("5. capacity");
		System.out.print(">> ");
	}
}
