package LPAlore;

import java.util.Scanner;

public class Lpalesson30 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		String nome;
		
		for(int i=0; i<=6 ; i++) {
			
		System.out.println("Qual seu nome?");
		nome = ler.next();
		System.out.println("Seu nome é: "+nome);
		System.out.println("----------x----------");
		
	}
		
ler.close();

    }
}
