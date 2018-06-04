package ifrn.diatinf.estrutura.array;

import java.util.Scanner;

public class MainSequence {

	public static void main(String[] args) throws ExceptionSeq {
		Scanner input = new Scanner(System.in);
		int opc = -1, rank, x;
		Object add;
		Element e;
		
		System.out.print("initial sequence size: ");
		int n = input.nextInt();
		ArraySequence seq = new ArraySequence(n);
		
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
				Element element_add = new Element(rank, add);
				seq.insertAtRank(rank, element_add);
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
				e = new Element(x, null);
				System.out.println(seq.before(e));
				break;
				
			case 9:
				System.out.print("rank: ");
				x = input.nextInt();
				e = new Element(x, null);
				System.out.println(seq.after(e));
				break;
				
			case 10:
				System.out.print("rank: ");
				x = input.nextInt();
				System.out.print("object to replace: ");
				add = input.nextLine();
				add = input.nextLine();
				System.out.println("Element replaced: " + seq.replaceElement(x, add));
				printSeq(seq);
				break;
				
			case 11:
				System.out.print("rank 1: ");
				x = input.nextInt();
				Element a = new Element(x, seq.atRank(x));
				System.out.print("rank 2: ");
				x = input.nextInt();
				Element b = new Element(x, seq.atRank(x));
				seq.swapElements(a, b);
				printSeq(seq);
				break;
				
			case 12:
				System.out.print("add before (rank): ");
				x = input.nextInt();
				System.out.print("element: ");
				add = input.nextLine();
				add = input.nextLine();
				e = new Element(x, seq.elemAtRank(x));
				seq.insertBefore(e, add);
				printSeq(seq);
				break;
				
			case 13:
				System.out.print("add after (rank): ");
				x = input.nextInt();
				System.out.print("element: ");
				add = input.nextLine();
				add = input.nextLine();
				e = new Element(x, seq.elemAtRank(x));
				seq.insertAfter(e, add);
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
				System.out.print("object: ");
				add = input.nextLine();
				add = input.nextLine();
				Object o = seq.rankOf(add);
				System.out.println(o);
				break;
				
			default:
				System.out.println("invalid option!");
				break;
			}
		}
		
		input.close();
	}
	
	public static void printSeq(ArraySequence seq){
		Object[] sequence = seq.getSequence();
		System.out.println();
		for (int i = 0; i < seq.capacity(); i++) {
			System.out.print("[" + sequence[i] + "] ");
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
