package ifrn.diatinf.estrutura.ldencadeada;

import java.util.Scanner;

public class MainSequence {

	public static void main(String[] args) throws ExceptionSeq {
		Scanner input = new Scanner(System.in);
		int opc = -1, rank, x;
		Object add;
		No no;
		LDESequence seq = new LDESequence();
		
		while(opc != 0){
			menu();
			opc = input.nextInt();
			switch (opc) {
			case 0:
				System.out.println("program closed!");
				break;
				
			// CASES VECTOR
			case 1:
				System.out.print("add: ");
				add = input.nextLine();
				add = input.nextLine();
				System.out.print("rank: ");
				rank = input.nextInt();
				seq.insertAtRank(rank, add);
				printSeq(seq);
				break;
				
			case 2:
				System.out.print("rank: ");
				rank = input.nextInt();
				System.out.println("removed object: " + seq.removeAtRank(rank));
				printSeq(seq);
				break;
			
			case 3:
				System.out.print("replace: ");
				add = input.nextLine();
				add = input.nextLine();
				System.out.print("rank: ");
				rank = input.nextInt();
				System.out.println("replaced object: " + seq.replaceAtRank(rank, add));
				printSeq(seq);
				break;
				
			case 4:
				System.out.print("rank: ");
				rank = input.nextInt();
				System.out.println("" + seq.elemAtRank(rank));
				break;
				
			case 5:
				System.out.println(seq.size());
				break;
				
			// CASES LIST
			case 6:
				System.out.println(seq.first());
				break;
				
			case 7:
				System.out.println(seq.last());
				break;
			
			case 8:
				System.out.print("rank: ");
				x = input.nextInt();
				no = seq.atRank(x);
				System.out.println(seq.before(no));
				break;
				
			case 9:
				System.out.print("rank: ");
				x = input.nextInt();
				no = seq.atRank(x);
				System.out.println(seq.after(no));
				break;
				
			case 10:
				System.out.print("rank: ");
				x = input.nextInt();
				System.out.print("object to replace: ");
				add = input.nextLine();
				add = input.nextLine();
				no = seq.atRank(x);
				System.out.println("Element replaced: " + seq.replaceElement(no, add));
				printSeq(seq);
				break;
				
			case 11:
				System.out.print("rank 1: ");
				x = input.nextInt();
				no = seq.atRank(x);
				System.out.print("rank 2: ");
				x = input.nextInt();
				No no2 = seq.atRank(x);
				seq.swapElements(no, no2);
				printSeq(seq);
				break;
				
			case 12:
				System.out.print("add before (rank): ");
				x = input.nextInt();
				System.out.print("element: ");
				add = input.nextLine();
				add = input.nextLine();
				no = seq.atRank(x);
				seq.insertBefore(no, add);
				printSeq(seq);
				break;
				
			case 13:
				System.out.print("add after (rank): ");
				x = input.nextInt();
				System.out.print("element: ");
				add = input.nextLine();
				add = input.nextLine();
				no = seq.atRank(x);
				seq.insertAfter(no, add);
				printSeq(seq);
				break;
				
			case 14:
				System.out.print("add first: ");
				add = input.nextLine();
				add = input.nextLine();
				seq.insertFirst(add);
				printSeq(seq);
				break;
				
			case 15:
				System.out.print("add last: ");
				add = input.nextLine();
				add = input.nextLine();
				seq.insertLast(add);
				printSeq(seq);
				break;
				
			case 16:
				System.out.print("rank: ");
				x = input.nextInt();
				System.out.println(seq.atRank(x)); 
				break;
				
			case 17:
				no = seq.atRank(0);
				Object o = seq.rankOf(no);
				System.out.println(o);
				break;
				
			default:
				System.out.println("invalid option!");
				break;
			}
		}
		
		input.close();
	}
	
	private static void printSeq(LDESequence seq) {
		No aux = seq.first();
		System.out.println();
		while (aux != null) {
			System.out.print("[][" + aux.getElemento() + "][] ");
			aux = aux.getProximo();
		}
		System.out.println();
	}
	
	public static void menu(){
		System.out.println();
		System.out.println("============ MENU VETOR ============");
		System.out.print("0. exit\n1. insert\n2. remove\n3. replace\n4. get\n5. size\n");
		
		System.out.println("============ MENU LISTA ============");
		System.out.println("6. first            7. last\n"
				+ "8. before           9. after"
				+ "\n10. replaceElement  11. swapElements"
				+ "\n12. insertBefore    13. insertAfter"
				+ "\n14. insertFirst     15. insertLast"
				+ "\n16. atRank          17. rankOf");
		
		System.out.print(">> ");
	}
}
