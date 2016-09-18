class Exercicio04{

	public static final char CHR_BORDA = '*';
	public static final char CHR_LINHA = ' ';

	public static void main(String args[]){
		imprimeRetangulo(0,0);
		imprimeRetangulo(1,20);
		imprimeRetangulo(2,4);
		imprimeRetangulo(3,15);
		imprimeRetangulo(4,26);
	}

	static void imprimeRetangulo(int nLinhas, int nColunas){
		if (nLinhas>0 && nColunas>0){
			int c = 1;
			while(c <= nLinhas){
				imprimeLinha(nColunas, (c==1 || c==nLinhas));
				c++;
			}
		}
	}
	
	static void imprimeLinha(int nColunas, boolean borda){
		int c = 1;
		String saida = "";
		while (c <= nColunas){
			if (c==1 || c==nColunas || borda){
				saida += CHR_BORDA;
			}else{
				saida += CHR_LINHA;
			}
			c++;
		}
		System.out.println(saida);
	}

	static String repeteChar(char chr, int nVezes){
		String retVal = "";
		for (int c=1; c<=nVezes; c++) retVal += chr;
		return retVal;
	}
}