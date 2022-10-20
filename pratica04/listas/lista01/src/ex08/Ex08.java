package ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite elementos para a lista: ");
			lista.add(x.nextLine());
		}
		
		for (String string : lista) {
			System.out.println("Elementos digitados: ");
			System.out.println(string);
		}
		
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Último elemento da lista: " + lista.get(lista.size() - 1));
	}

}
