class Exercicio03{

	static final float DESCONTO_PAGAMENTO_ANTECIPADO = 0.07f;
	
	public static void main(String args[]){
		System.out.println("Pagamento normal: " + 
				calculaValorAPagar(true, 100, 20.00)
			);
		System.out.println("Pagamento antecipado: " + 
				calculaValorAPagar(false, 100, 20.00)
			);
	}

	static double calculaValorAPagar(
					boolean pagamentoNormal,
					int numeroDeHoras,
					double valorHoraAula
				){
				
		double v = numeroDeHoras * valorHoraAula;
		if (!pagamentoNormal) 
			v -= v * DESCONTO_PAGAMENTO_ANTECIPADO;
		return v;
	}

}