class Exercicio01{

	public static void main(String args[]){
		int[][] mxEntrada = {
					{1,2,3},{7,8,9,10},{4,5,6}
				};
		int[] posMaiorElemento;
		int maiorElemento;
		
		imprimeMatriz(mxEntrada);
		
		posMaiorElemento = maxPos(mxEntrada);
		maiorElemento = max(mxEntrada);
		
		System.out.println("Maior valor: " + maiorElemento 
				+ ", em [" + posMaiorElemento[0] 
				+ "][" + posMaiorElemento[1] + "]")
		;
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

	static int[] maxPos(int [][] mx){
		int n = mx.length;
		int max = mx[0][0];
		int[] maxPos = {0,0};
		for(int i=0;i<n;i++){
			int m = mx[i].length;
			for(int j=0;j<m;j++){
				if(mx[i][j]>max){
					max = mx[i][j];
					maxPos[0] = i;
					maxPos[1] = j;
				}
			}
		}
		return maxPos;
	}
	
	static int max(int [][] mx){
		int[] pos = maxPos(mx);
		return mx[pos[0]][pos[1]];
	}
}