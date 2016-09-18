class Exercicio2{

	public static void main(String args[]){
		float reais = 3500.00F;
		float cotacaoDolar = 3.5F;
		float dolares = converterBRLParaUSD(reais, cotacaoDolar);
		System.out.println("R$" + reais + ", a R$" + cotacaoDolar + "/US$ representam US$" + dolares + " dolares.");
	}

	public static float converterBRLParaUSD(float valorBRL, float cotacaoUSD){
		return valorBRL / cotacaoUSD;
	}

}