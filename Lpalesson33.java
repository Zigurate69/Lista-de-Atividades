package LPAlore;

import java.util.Scanner;

public class Lpalesson33 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double n, media;
		double soma=0;
		
		for(int i=0; i<=4; i++) {
			
			System.out.println("Informe sua nota: ");
			n = ler.nextDouble();
			soma = soma+n;
			
			System.out.println("O resultado da soma é: "+soma);
			
			media = soma/5;
			System.out.println("O resultado da média é: "+media);
			
		}
        ler.close();  
	}

}
