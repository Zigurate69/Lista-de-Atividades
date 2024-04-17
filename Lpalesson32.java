package LPAlore;

import java.util.Scanner;

public class Lpalesson32 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		int in = ler.nextInt();
		
		for(int i=0; i<=in; i++) {
			if(i%2!=0) {
				System.out.println("Os números ímpares são "+i);
			}
		}
		ler.close();

	}

}
