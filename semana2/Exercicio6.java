class Exercicio6{

	public static void main(String args[]){

		int entradaNumeroTresDigitos = 123;
		int entradaNumeroMenosTresDigitos = 12;
		int entradaNumeroMaisTresDigitos = 1234;
		
		int numeroInvertidoTresDigitos = 
			inverterNumeroTresDigitos(entradaNumeroTresDigitos);
		int numeroInvertidoMenosTresDigitos = 
			inverterNumeroTresDigitos(entradaNumeroMenosTresDigitos);
		int numeroInvertidoMaisTresDigitos = 
			inverterNumeroTresDigitos(entradaNumeroMaisTresDigitos);

		System.out.println("Número com exatamente 3 dígitos: " + 
			entradaNumeroTresDigitos + " --> " +
			numeroInvertidoTresDigitos);
		System.out.println("Número com menos de 3 dígitos: " + 
			entradaNumeroMenosTresDigitos + " --> " + 
			numeroInvertidoMenosTresDigitos);
		System.out.println("Número com mais de 3 dígitos: " + 
			entradaNumeroMaisTresDigitos + " --> " + 
			numeroInvertidoMaisTresDigitos);
	}

	public static int inverterNumeroTresDigitos(int numeroTresDigitos){
		if (numeroTresDigitos > 999 || numeroTresDigitos < 100){
			return -1;
		}else{
			int unidadeEntrada = numeroTresDigitos % 10;
			int dezenaEntrada = 
				((numeroTresDigitos - unidadeEntrada) % 100) / 10;
			int centenaEntrada = 
				((numeroTresDigitos - dezenaEntrada * 10 
				- unidadeEntrada) % 1000) / 100;
			return 100 * unidadeEntrada + 10 * dezenaEntrada + centenaEntrada;
		}
	}
}