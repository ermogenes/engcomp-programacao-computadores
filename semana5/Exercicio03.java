class Exercicio03{

	public static void main(String args[]){
		int[][] parcela1 = {
					{1,0,0,0},
					{0,1,0,0},
					{0,0,1,0},
					{0,0,0,1},
				};
		int[][] parcela2 = {
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				};
		
		exibeMensagem(parcela1, parcela2);
	}

	static void exibeMensagem(int[][] mx1, int[][] mx2){
		System.out.println("Matriz 1:\n");
		imprimeMatriz(mx1);
		System.out.println("\nMatriz 2:\n");
		imprimeMatriz(mx2);
		System.out.println("\nSoma:\n");
		int[][] result = somaMatriz(mx1, mx2);
		if (result[0][0] != Integer.MIN_VALUE){
			imprimeMatriz(result);
		}else{
			System.out.print("Matrizes de tamanhos diferentes.");
		}
	}
	
	static void imprimeMatriz(int[][] mx){
		int n = mx.length;
		for(int i=0;i<n;i++){
			int m = mx[i].length;
			for(int j=0;j<m;j++)
				System.out.print(mx[i][j] + "\t");
			System.out.print("\n");
		}
	}	

	static boolean isMesmoTamanho(int[][] mx1, int[][] mx2){
		int n1 = mx1.length;
		int n2 = mx2.length;
		boolean isMesmoTamanho = n1 == n2;
		for(int i=0;i<n1;i++)
			isMesmoTamanho = isMesmoTamanho && mx1[i].length == mx2[i].length;
		return isMesmoTamanho;
	}
	
	static int[][] somaMatriz(int [][] mx1, int [][] mx2){
		int n = mx1.length;
		int m = mx1[0].length;
		int[][] soma = new int[n][m];
		if(isMesmoTamanho(mx1, mx2)){
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					soma[i][j] = mx1[i][j] + mx2[i][j];
		}else{
			soma[0][0] = Integer.MIN_VALUE; // flag
		}
		return soma;
	}
}