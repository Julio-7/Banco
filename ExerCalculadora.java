import java.util.Scanner;
public class ExerCalculadora {

	public static double soma(double numero1, double numero2,double resultado) {
		resultado = numero1+numero2;
		return resultado;
		
	}
	
	
	
	public static double subtracao(double numero1, double numero2,double resultado) {
		resultado = numero1 - numero2;
		return resultado;
		
	}
	
	
	
	public static double multiplicar(double numero1, double numero2,double resultado) {
		resultado = numero1 * numero2;
		return resultado;
	
	}
	
	
	public static double divisao(double numero1, double numero2,double resultado) {
		resultado = numero1/numero2;
		return resultado;
	}
	
		
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int operacao = 0;
		double numero1,numero2,resultado=0;
		
		
		while(operacao!=5) {
		
		System.out.print("\n1 - Soma, 2 - Subtracao, 3 - multiplicacao, 4 - divisao, 5 - sair");
		operacao = input.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.print("Digite um numero: ");
			numero1 = input.nextDouble();
			
			System.out.print("\nDigite um numero: ");
			numero2 = input.nextDouble();
			
			resultado = soma(numero1,numero2,resultado);
			System.out.printf("\nO resultado da soma: %.0f\n", resultado);
			break;
			
		case 2:
			System.out.print("Digite um numero");
			numero1 = input.nextDouble();
			
			System.out.print("\nDigite um numero:");
			numero2 = input.nextDouble();
			
			resultado = subtracao(numero1,numero2,resultado);
			System.out.printf("\nO resultado da subtracao: %.0f\n", resultado);
			break;
		
		case 3:
			System.out.print("Digite um numero: ");
			numero1 = input.nextDouble();
			
			System.out.print("\nDigite um numero: ");
			numero2 = input.nextDouble();
			
			resultado = multiplicar(numero1,numero2,resultado);
			System.out.printf("\nO resultado da multiplicacao: %.0f\n", resultado);
			break;
			
		case 4:
			System.out.print("Digite um numero: ");
			numero1 = input.nextDouble();
			
			System.out.print("\nDigite um numero: ");
			numero2 = input.nextDouble();
			
			resultado = divisao(numero1,numero2,resultado);
			System.out.printf("\nO resultado da divisao: %.0f\n", resultado);
			break;
			
		case 5:
			System.out.print("\nSaindo... ");
			break;
		default:
			System.out.print("Opcao invalida");
			

		}
		}
	}

}
