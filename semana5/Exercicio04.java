class Exercicio04{

	public static void main(String args[]){
		float[][] mxEntrada = {
					{1,0,0,4},
					{0,2,0,0},
					{0,0,3,0}
				};
		
		exibeMensagem(mxEntrada);
	}

	static void exibeMensagem(float[][] mx){
		System.out.println("Matriz:\n");
		imprimeMatriz(mx);
		System.out.println("\nMatriz transposta:\n");
		imprimeMatriz(transposta(mx));
	}
	
	static void imprimeMatriz(float[][] mx){
		int n = mx.length;
		for(int i=0;i<n;i++){
			int m = mx[i].length;
			for(int j=0;j<m;j++)
				System.out.print(mx[i][j] + "\t");
			System.out.print("\n");
		}
	}	

	static float[][] transposta(float[][] mx){
		int n = mx.length;
		int m = mx[0].length;
		float[][] t = new float[m][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				t[j][i] = mx[i][j];
		return t;
	}
}