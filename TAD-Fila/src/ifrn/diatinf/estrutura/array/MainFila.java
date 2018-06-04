package ifrn.diatinf.estrutura.array;

import java.util.Scanner;

public class MainFila {

	public static void main(String[] args) throws ExceptionFila {
		Scanner input = new Scanner(System.in);
		
		Object o1, o2;
		System.out.print("Tamanho para fila: ");
		int tamanho = input.nextInt(), opc = -1;
		ArrayFila fila = new ArrayFila(tamanho);
		
		while(opc != 0){
			menu();
			opc = input.nextInt();
			
			switch (opc) {
			case 0:
				System.out.println("> Programa encerrado!");
				System.exit(0);
				break;
	
			case 1:
				System.out.println("Inserir: ");
				o1 = input.nextLine();
				o1 = input.nextLine();
				fila.enfileirar(o1);
				imprimirPilha(fila);
				break;
	
			case 2:
				o2 = fila.desenfileirar();
				System.out.println("Objeto removido: " + o2);
				imprimirPilha(fila);
				break;
	
			case 3:
				System.out.println("Início da fila: " + fila.inicio());
				break;
	
			case 4:
				System.out.println("Tamanho da fila: " + fila.tamanho());
				break;

			default:
				System.out.println("> Opção inválida!");
				break;
			}
			
		}
		
		input.close();
	}

	public static void imprimirPilha(ArrayFila f) {
		Object elementos[] = f.getFila();
		for (int i = 0; i < elementos.length; i++) {
			System.out.print("[ "+ elementos[i] + " ] ");
		}
		System.out.println();
	}

	public static void menu() {
		System.out.println();
		System.out.println("===== MENU =====");
		System.out.println("0. exit");
		System.out.println("1. enfileirar");
		System.out.println("2. desenfileirar");
		System.out.println("3. inicio");
		System.out.println("4. tamanho");
		System.out.print(">> ");
	}
}
