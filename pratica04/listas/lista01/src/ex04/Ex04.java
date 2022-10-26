/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 19/10/2022
 **/

package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = x.nextLine();
			Integer numint = Integer.valueOf(num);
			System.out.println("O número digitado foi " + numint);
		}

	}

}
