/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 19/10/2022
 **/

package ex09;

public class Ex09 {
	public double calcAbast(String precolitro, String qtdlitro) {
		if (precolitro != null || qtdlitro != null) {
		
		} else {
			precolitro = "0";
			qtdlitro = "0";
		}
		
		Double precolitrod = Double.valueOf(precolitro);
		Double qtdlitrod = Double.valueOf(qtdlitro);
		
		Double total = qtdlitrod * precolitrod;
		return total;
	}
}
