class Exercicio05{

	public static void main(String args[]){
		int[][] mxEntrada1 = {
					{1,0,0,4},
					{0,2,0,0},
					{0,0,3,0},
					{0,0,3,0}
				};
		
		int[][] mxEntrada2 = {
					{1,0,0,4},
					{0,2,0,0},
					{0,0,3,0}
				};
		
		int[][] mxEntrada3 = {
					{1,0,0,4},
					{0,1,2,0},
					{0,2,1,0},
					{4,0,0,1}
				};
		
		exibeMensagem(mxEntrada1);
		exibeMensagem(mxEntrada2);
		exibeMensagem(mxEntrada3);
	}

	static void exibeMensagem(int[][] mx){
		System.out.println("Matriz:\n");
		imprimeMatriz(mx);
		System.out.println("\nSimétrica?: " 
			+ (isSimetrica(mx)?"Sim":"Não")
			+ "\n"
		);
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
	static boolean isSimetrica(int[][] mx){
		int n = mx.length;
		int m = mx[0].length;
		boolean isSimetrica = isQuadrada(mx);
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				isSimetrica = isSimetrica && mx[i][j] == mx[j][i];
		return isSimetrica;
	}
}