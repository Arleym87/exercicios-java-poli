package MeusDados;

public class ExemploOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 4;
		int soma = a + b;
		int resto = a % b;
		
		boolean ehMaior = a  > b;
		
		System.out.println("---Resultado do Exercicio 3---");
		System.out.println("1. a soma de a e b é: " + soma);
		System.out.println("2. O resto da divisao de " + a + " por " + b + " é " + resto);
		System.out.println("3. O Valor de a é maior do que b ? " + ehMaior);
	}

}
