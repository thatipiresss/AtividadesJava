package ExerciciosGen;

import java.util.Scanner;

public class Atv2 {

		public static void main(String[] args) {
			
			int dia, mes, ano, dias, resto, resto2, resultado;
			 Scanner leia = new Scanner (System.in);

			 System.out.println("H� quantos dias voc� est� nesse mundo?");
			 dia = leia.nextInt();
			 ano = dia/365;
			 resto = dia%365;
			 mes = resto/30;
			 resto2 = resto%30;
			 resultado = resto2;
			 
			 System.out.println("Voc� tem "+ ano+" anos "+ mes+" meses e "+ resultado+ " dia(s) de vida!");
		}
		
}
