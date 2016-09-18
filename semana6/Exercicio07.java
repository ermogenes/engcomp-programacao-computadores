class Exercicio07{

	public static void main(String args[]){
		Produto[] meusProdutos = new Produto[]{
					new Produto(9, 1),
					new Produto(8, 2),
					new Produto(7, 3),
					new Produto(6, 4),
					new Produto(5, 5)
				};
		
		int[] buscas = new int[]{1, 5, 7, 10};
		
		Produto.listaProdutos(meusProdutos);
	
		for(int id: buscas)
			System.out.println(
				"Buscando " + id + ": " +
				Produto.buscaProduto(meusProdutos, id)
			);
	}

}

class Produto{
	private int id;
	private int idFabricante;
	
	public int getId(){ return this.id;}
	public int getIdFabricante(){ return this.idFabricante;}
	
	public Produto(int id, int idFabricante){
		this.id = id;
		this.idFabricante = idFabricante;
	}
	
	public static void ordenaProdutos(Produto[] p){
		ordenaBolha(p, true);	
	}
	
	private static boolean isOrdenado(Produto[] p){
		for(int i = 1; i < p.length; i++)
			if (p[i-1].id > p[i].id) return false;
		return true;
	}
	
	public static int buscaProduto(Produto[] p, int id){
		if (!isOrdenado(p))
			ordenaBolha(p, false);
		return buscaBinaria(p, id, false);
	}

	private static int buscaBinaria(Produto[] p, int q, boolean verbose){
		int fim = p.length - 1;
		int inicio = 0;
		while (inicio <= fim){
			int meio = (fim + inicio) / 2;
			if (verbose) System.out.println(p[meio].id + " == " + q + "?");
			if (p[meio].id < q){
				inicio = meio + 1;
			}else{
				if (p[meio].id > q){
					fim = meio - 1;
				}else{
					return meio;
				}
			}
		}
		return -1; 
	}
	
	private static void ordenaBolha(Produto[] m, boolean verbose){
		for(int j = m.length - 1; j >= 0; j--){
			if (verbose) imprimeMatriz(m);
			for(int i = 0; i < j; i++)
				if (m[i].id > m[i+1].id){
					Produto aux = m[i+1];
					m[i+1] = m[i];
					m[i] = aux;
				};
		}
	}

	private static void imprimeMatriz(Produto[] p){
		String line = "";
		for(Produto pA: p)
			line += pA.id + "/" + pA.idFabricante + "\t";
		System.out.println(line);
	}	

	public static void listaProdutos(Produto[] p){
		if (!isOrdenado(p))
			ordenaBolha(p, false);
		System.out.println("\n\n--- Lista de Produtos [id/idFabricante] ---");
		imprimeMatriz(p);
	}
	
}