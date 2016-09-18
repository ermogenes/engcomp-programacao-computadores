class Exercicio06{

	public static void main(String args[]){
		float[] entrada = {61,72,93,34,85,36,07,58,29,10};
		float saida = imprimeMaior(entrada);
	}
	
	static float imprimeMaior(float[] numeros){
		float maior = numeros[0];
		for(float atual: numeros)
			if (atual > maior) maior = atual;
		System.out.println(maior);
		return maior;
	}
}