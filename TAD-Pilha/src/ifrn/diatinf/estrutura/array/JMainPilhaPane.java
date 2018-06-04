package ifrn.diatinf.estrutura.array;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JMainPilhaPane {
	public static void main(String[] args) throws ExceptionPilha {
		Scanner input = new Scanner(System.in);
		int tamanho, opc = - 1;
		String x;
		Object epush, epop;
		
		x = JOptionPane.showInputDialog(null, "Defina o tamanho inicial da pilha: ", "TAD Pilha", JOptionPane.DEFAULT_OPTION);
		tamanho = Integer.parseInt(x);

		PilhaArray pilha = new PilhaArray(tamanho);
		
		while(opc != 0){
			x = JOptionPane.showInputDialog(null, "0. exit \n1. push \n2. pop \n3. top \n4. size \n5. capacity", "=== MENU ===", JOptionPane.DEFAULT_OPTION);
			opc = Integer.parseInt(x);
	
			switch (opc) {
			case 0:
				JOptionPane.showMessageDialog(null, "Programa encerrado!");
				System.exit(0);
				break;
	
			case 1:
				epush = JOptionPane.showInputDialog("Inserir: ");
				pilha.push(epush);
				imprimirPilha(pilha);
				break;
	
			case 2:
				epop = pilha.pop();
				imprimirPilha(pilha);
				JOptionPane.showMessageDialog(null, "Objeto removido: " + epop);
				break;
	
			case 3:
				JOptionPane.showMessageDialog(null, "Topo da pilha: " + pilha.top());
				break;
	
			case 4:
				JOptionPane.showMessageDialog(null, "Tamanho da pilha: " + pilha.size());
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, "Capacidade da pilha: " + pilha.getTamanho());
				break;

			default:
				JOptionPane.showMessageDialog(null, "> Opção inválida!");
				break;
			}
		}
		input.close();
	}

	public static void imprimirPilha(PilhaArray p) {
		Object elementos[] = p.getPilha();
		String pilha = "";
		for (int i = (p.size()-1); i >= 0; i--) {
			pilha += elementos[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, pilha, "PILHA", JOptionPane.DEFAULT_OPTION);
	}
}
