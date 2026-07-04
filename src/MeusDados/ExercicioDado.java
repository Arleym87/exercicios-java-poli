package MeusDados;

public class ExercicioDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Gera o numero decimal aleatorio e multiplica por 6
		double numeroAleatorio = Math.random() * 6;
		
		//2. Faz o "cast" para int (transforma o numero inteiro cortando as casas decimais)
		// Isso vai nos dar um numero de 0 a 5
		int numeroInteiro = (int) numeroAleatorio;
		
		//3. Sioma 1 para ajustar o intervalo de 1 a 6
		int resultadoDado = numeroInteiro + 1;
		
		System.out.println("\u2685 Dado lançado! O resultado foi: " + resultadoDado);
	}

}
