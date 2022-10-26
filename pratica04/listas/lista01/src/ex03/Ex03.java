/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 19/10/2022
 **/

package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String num;
		
		System.out.println("Digite o número que desejar: ");
		num = x.nextLine();
		
		Integer numint = Integer.valueOf(num);
		
		if (numint % 2 == 0) {
			System.out.println("O número " + numint + " é par.");
		} else {
			System.out.println("O número " + numint + " é ímpar.");
		}
	}

}
