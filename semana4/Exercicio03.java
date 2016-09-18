class Exercicio03{
	public static void main(String args[]){
		imprimeTabela(15);
	}

	static void imprimeTabela(int nLinhas){
		for (int c = 1; c<=nLinhas; c++)
			imprimeLinha(c);
	}

	static void imprimeLinha(int n){
		String saida = "%d\t%d\t%d\n";
		System.out.printf(
			saida,
			n,
			(int) Math.pow(n,2),
			(int) Math.pow(n,3)
		);
	}
}