class Exercicio08{

	public static void main(String args[]){
		double[] notas = {6.1,7.2,9.3,3.4,8.5,3.6};
		double saida = calculaMedia(notas);
		System.out.printf("Média após descarte: %f\n", saida);
	}
	
	static double calculaMedia(double[] notas){
		int iMenor = 0;
		int iMaior = 1;
		double soma = 0;
		int qtd = notas.length;
		for(int i = 0; i < qtd; i++){
			soma += notas[i];
			if (notas[i] > notas[iMaior]) iMaior = i;
			if (notas[i] < notas[iMenor]) iMenor = i;
		}
		soma -= notas[iMenor];
		soma -= notas[iMaior];
		qtd -= 2;
		return soma / qtd;
	}
}