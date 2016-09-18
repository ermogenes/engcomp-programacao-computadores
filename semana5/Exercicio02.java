class Exercicio02{

	public static void main(String args[]){
		int[][] mxEntrada1 = {
					{1,2,3,4},
					{7,8,9,10},
					{4,5,6,7}
				};
		int[][] mxEntrada2 = {
					{2, 5, 10, 4},
					{-3, 8, 1, 5},
					{4, 0, 7, 11},
					{3, -4, 1, 2}
				};
		
		exibeMensagem(mxEntrada1);
		exibeMensagem(mxEntrada2);
	}

	static void exibeMensagem(int[][] mx){
		int resultado = somaDiagSec(mx);
		imprimeMatriz(mx);
		if (resultado != Integer.MIN_VALUE){
			System.out.println("Soma da diagonal secundária: "
							+ resultado);
		}else{
			System.out.println("A matriz não é quadrada.");
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

	static boolean isQuadrada(int[][] mx){
		int n = mx.length;
		boolean isQuadrada = true;
		for(int i=0;i<n;i++)
			isQuadrada = isQuadrada && mx[i].length==n;
		return isQuadrada;
	}
	
	static int somaDiagSec(int [][] mx){
		int n = mx.length;
		int soma = 0;
		int nAtual = 0;
		int mAtual = mx[0].length -1;
		if(isQuadrada(mx)){
			for(int i=0;i<n;i++){
				int m = mx[i].length;
				for(int j=0;j<m;j++){
					if(i==nAtual && j==mAtual){
						soma += mx[i][j];
						nAtual++;
						mAtual--;
					}
				}
			}
		}
		else{
			soma = Integer.MIN_VALUE; // flag
		}
		return soma;
	}
}