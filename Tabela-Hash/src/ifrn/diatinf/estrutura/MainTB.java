package ifrn.diatinf.estrutura;

import java.util.Scanner;

import ifrn.diatinf.estrutura.exceptions.FULL_TABLE;
import ifrn.diatinf.estrutura.exceptions.NO_SUCH_KEY;

public class MainTB {
	public static void main(String[] args) throws FULL_TABLE, NO_SUCH_KEY {
		Scanner input = new Scanner(System.in);
		TabelaHash tb = new TabelaHash();
		int option = -1, k;
		Object o;
		
		while(option != 0){
			
			menu();
			option = input.nextInt(); 
			
			switch (option) {
			case 0:
				System.out.println("program closed!");
				System.exit(0);
				break;
	
			case 1:
				System.out.println("size: " + tb.size());
				break;
	
			case 2:
				System.out.println("keys: ");
				int[] keys = tb.keyes();
				for (int i = 0; i < keys.length; i++) 
					System.out.print(keys[i] + ", ");
				
				break;
	
			case 3:
				System.out.println("elements: ");
				Object[] elements = tb.elements();
				for (int i = 0; i < elements.length; i++) 
					System.out.print(elements[i] + ", ");
				
				break;
			case 4:
				System.out.print("key: ");
				k = input.nextInt();
				System.out.print("element: ");
				o = input.next();
				tb.insertElement(k, o);
				System.out.println("inserted!");
				break;
	
			case 5:
				try {
					System.out.print("key: ");
					k = input.nextInt();
					System.out.println("removed: " + tb.removeElement(k));
					break;
				} catch (NO_SUCH_KEY no){
					System.out.println("Key not found!");
				}
				
			case 6:
				try {
					System.out.print("key: ");
					k = input.nextInt();
					System.out.println("found: " + tb.findElement(k));
					break;
				} catch (NO_SUCH_KEY no){
					System.out.println("Key not found!");
				}
	
			default:
				System.out.println("invalid option!");
				break;
			}
		}
		input.close();
	}

	public static void menu() {
		System.out.println();
		System.out.println("===== MENU =====");
		System.out.println("0. exit");
		System.out.println("1. size");
		System.out.println("2. keys");
		System.out.println("3. elements");
		System.out.println("4. insert Element");
		System.out.println("5. remove Element");
		System.out.println("6. find Element");
		System.out.print(">> ");
	}
}
