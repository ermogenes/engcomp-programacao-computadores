class Exercicio07{

	public static void main(String args[]){
		float[] entrada = {61,72,93,34,85,36,07,58,29,10};
		float saida = imprimeIndiceMaior(entrada);
	}
	
	static float imprimeIndiceMaior(float[] numeros){
		int indiceMaior = 0;
		for(int i = 1; i < numeros.length; i++)
			if (numeros[i] > numeros[indiceMaior])
				indiceMaior = i;
		System.out.println(indiceMaior);
		return indiceMaior;
	}
}