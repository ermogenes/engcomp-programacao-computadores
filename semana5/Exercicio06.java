class Exercicio06{

	public static void main(String args[]){
		double[][] tabVendas = {
			{-1, 1, 2, 3, 4, 5, 6},
			{0, 20000, 35000, 2000.2, 20832, 10500, 12000},
			{1, 15453, 5300, 42000, 135832, 18580.36, 85200},
			{2, 14320, 55800, 12356, 2563, 100000, 62325},
			{3, 12345, 44823, 15863.25, 56483.55, 93000, 4852.33}
		};
		
		System.out.println("A filial que mais vendeu é a de código "
			+ maxVendedor(tabVendas) + ".");
	}

	static void imprimeMatriz(double[][] mx){
		int n = mx.length;
		for(int i=0;i<n;i++){
			int m = mx[i].length;
			for(int j=0;j<m;j++)
				System.out.print(mx[i][j] + "\t");
			System.out.print("\n");
		}
	}	

	static int maxVendedor(double[][] mx){
		int n = mx.length;
		int m = mx[0].length;
		int maxVendedor = -1;
		double maxVenda = -1;
		for(int i=1;i<n;i++){
			double venda = 0;
			for(int j=1;j<m;j++)
				venda += mx[i][j];
			if (venda > maxVenda){
				maxVenda = venda;
				maxVendedor = (int) mx[i][0];
			}
		}
		return maxVendedor;
	}
}