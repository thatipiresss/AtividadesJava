package LacosDecisao;

import java.util.Scanner;

public class Atv3 {
	
	public static void main (String[] arg) {
		
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira sua idade: ");
		idade = leia.nextInt();
		
		if(idade <18 && idade > 15){
			
			System.out.println ("\nDe acordo com sua idade, voc� se enquadra na categoria Juvenil!");
		}
			else if (idade <15 && idade >10) {
				System.out.println("\nDe acordo com sua idade, voc� se enquadra na categoria Infantil!");
			
			} else if (idade >18) {
				System.out.println("\nDe acordo com sua idade, voc� se enquadra na categoria Adulto!");
				
			} if (idade <10) {
				System.out.println ("\nOps, voc� inseriu uma idade fora das categorias aceitas... A faixa et�ria aceita � a partir de 10 anos.");
			}
			
		}
		
		
		
	}
