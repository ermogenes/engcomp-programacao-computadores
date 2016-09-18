class Exercicio3{

	static final double ACELERACAO_GRAVIDADE_MS2 = 9.8;

	public static void main(String args[]){
		double alturaInicialCm = 100;
		System.out.println("A queda, a partir de repouso � " + alturaInicialCm + "cm, � de " + tempoDeQuedaAPartirDeRepousoS(alturaInicialCm) + " segundos.");
	}

	public static double tempoDeQuedaAPartirDeRepousoS(double alturaCm){
	/*
		s = so + vo.t + ½ g.t ²
		t = sqrt(2s/g)	
	*/
	
		return Math.sqrt(2 * alturaCm / (ACELERACAO_GRAVIDADE_MS2 * 100));
	}

}