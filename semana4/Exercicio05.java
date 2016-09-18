class Exercicio05{

	public static final char CHR_PRINT = '*';

	public static void main(String args[]){
		imprimeFor(0);
		imprimeFor(5);
		System.out.print("\n");
		imprimeWhile(0);
		imprimeWhile(4);
		System.out.print("\n");
		imprimeDoWhile(0);
		imprimeDoWhile(6);
	}
	
	static void imprimeFor(int nVezes){
		for (int c=1; c<=nVezes; c++) System.out.print(CHR_PRINT);
	}

	static void imprimeWhile(int nVezes){
		int i = 1;
		while(i <= nVezes){
			System.out.print(CHR_PRINT);
			i++;
		}
	}

	static void imprimeDoWhile(int nVezes){
		if (nVezes >0){
			int i = 1;
			do{
				System.out.print(CHR_PRINT);
			}while(i++ < nVezes);
		}
	}
}