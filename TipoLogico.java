package projects;

import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		
		
		
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
		
		
		scanner.close();
		boolean Passou = nota>70;
		
		
		
		if(Passou){
			
			System.out.println("Voc� passou.");
			
		
		}else {
			
			System.out.println("Voc� n�o passou");
		}
	}
	
	
}
