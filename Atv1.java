package LacosDecisao;

import java.util.Scanner;

public class Atv1 {
	
	public static void main (String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
			num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
			num2 = leia.nextInt();
			
		System.out.println("Entre com o terceiro n�mero: ");
			num3 = leia.nextInt();
			
		if (num1>num2 && num1>num3) {
			
				System.out.println ("\nO n�mero "+ num1+ " foi o maior n�mero digitado!");
	
		}	else if (num2>num3 && num2>num1) {
			
				System.out.println ("\nO n�mero" +num2+ " foi o maior n�mero digitado!");
		} if (num3>num2 && num3>num1) {
			
				System.out.println ("\nO n�mero " + num3 + " foi o maior n�mero digitado!");
		}
		
	}

}
