package Aula08;
import java.util.Scanner;
public class Exercicio01 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um número: ");
	        double numero = scanner.nextDouble();
	        
	        if (numero > 0) {
	            System.out.println("O número digitado é positivo.");
	        } else if (numero < 0) {
	            System.out.println("O número digitado é negativo.");
	        } else {
	            System.out.println("O número digitado é zero.");
	        }
	        
	        scanner.close();
	    }
	}
