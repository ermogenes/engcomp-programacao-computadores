class Exercicio04{

	public static void main(String args[]){
		int[] m = new int[]{1, 2, 3, 4, 5, 7, 9, 12};
		int[] q = new int[]{0, 1, 4, 5, 7, 9, 12, 15};
		
		System.out.println("Matriz:");
		imprimeMatriz(m);
		System.out.println("\nBuscas:\n");
		for(int qA: q)
			System.out.println(qA + " "
					+ (buscaBinaria(m, qA) ? "": "não ")
					+ "encontrado.\n");
	}

	public static void imprimeMatriz(int[] mx){
		String line = "";
		for(int i=0;i<mx.length;i++)
			line += mx[i] + "\t";
		System.out.println(line);
	}	

	public static boolean buscaBinaria(int[] m, int q){
		int fim = m.length - 1;
		int inicio = 0;
		while (inicio <= fim){
			int meio = (fim + inicio) / 2;
			System.out.println(m[meio] + " == " + q + "?");
			if (m[meio] < q){
				inicio = meio + 1;
			}else{
				if (m[meio] > q){
					fim = meio - 1;
				}else{
					return true;
				}
			}
		}
		return false; 
	}

}