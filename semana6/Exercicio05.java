class Exercicio05{

	public static void main(String args[]){
		int[] m = new int[]{1, 2, 3, 4, 5, 7, 9, 12};
		int[] m2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
		
		imprimeOrdenacao(m);
		imprimeOrdenacao(m2);
	}

	public static void imprimeOrdenacao(int[] m){
		System.out.println("\n\n--- Matriz ---");
		imprimeMatriz(m);
		System.out.println("\nPassos:\n");
		ordenaBolha(m, true);
		System.out.println("\n\nMatriz ORDENADA");
		imprimeMatriz(m);
	}
		
	public static void imprimeMatriz(int[] mx){
		String line = "";
		for(int i=0;i<mx.length;i++)
			line += mx[i] + "\t";
		System.out.println(line);
	}	

	public static void ordenaBolha(int[] m, boolean verbose){
		for(int j = m.length - 1; j >= 0; j--){
			if (verbose) imprimeMatriz(m);
			for(int i = 0; i < j; i++)
				if (m[i] > m[i+1]){
					int aux = m[i+1];
					m[i+1] = m[i];
					m[i] = aux;
				};
		}
	}
	
}