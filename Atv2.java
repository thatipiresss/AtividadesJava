package LacosDecisao;

import java.util.Scanner;

public class Atv2 {

		public static void main (String [] args) {
			
			int num1, num2, num3;
			Scanner leia = new Scanner (System.in);
			
		System.out.println ("\nEntre com o primeiro n�mero: ");
			num1 = leia.nextInt();
		System.out.println ("\nEntre com o segundo n�mero: ");
			num2 = leia.nextInt();
		System.out.println ("\nEntre com o terceiro n�mero: ");
			num3 = leia.nextInt();
			
			if (num1 >= num2 && num2 >= num3) {
					System.out.println ("\n A ordem crescente dos n�meros informados �: "+num3+", "+num2+" e "+ num1+".");
					
			} else if (num1 >= num2 && num3 >= num1) {
					System.out.println ("\nA ordem crescente dos n�meros informados �: "+num2+", "+num1+" e "+ num3+".");
			}  else if (num2 >= num1 && num1 >= num3) {
				System.out.println ("\nA ordem crescente dos n�meros informados �: "+num3+", "+num1+" e "+ num2+".");
			} else if (num2 >= num3 && num3 >= num1) {
				System.out.println ("\nA ordem crescente dos n�meros informados �: "+num1+", "+num3+" e "+ num2+".");
			}   if (num3 >= num2 && num2 >= num1) {
				System.out.println ("\nA ordem crescente dos n�meros informados �: "+num1+", "+num2+" e "+ num3+".");
			}
			
		}
}
