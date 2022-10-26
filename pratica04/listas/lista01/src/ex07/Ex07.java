/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 19/10/2022
 **/

package ex07;

public class Ex07 {

	public static void main(String[] args) {
		String[] vet = new String[10];
		
		vet[0] = "Um";
		vet[1] = "Dois";
		vet[2] = "Três";
		vet[3] = "Quatro";
		vet[4] = "Cinco";
		vet[5] = "Seis";
		vet[6] = "Sete";
		vet[7] = "Oito";
		vet[8] = "Nove";
		vet[9] = "Dez";

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dado do vetor na posição " + i + ": " + vet[i]);
		}
		
		System.out.println("Ultimo dado armazenado no vetor: " + vet[vet.length - 1]);
	}

}
