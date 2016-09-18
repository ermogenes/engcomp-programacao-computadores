class Exercicio06{

	public static void main(String args[]){
		Produto[] meusProdutos = new Produto[]{
					new Produto(9, 1),
					new Produto(8, 2),
					new Produto(7, 3),
					new Produto(6, 4),
					new Produto(5, 5)
				};
		
		Produto.ordenaProdutos(meusProdutos);
		Produto.listaProdutos(meusProdutos);
	}

}

class Produto{
	int id;
	int idFabricante;
	
	public Produto(int id, int idFabricante){
		this.id = id;
		this.idFabricante = idFabricante;
	}
	
	public static void ordenaProdutos(Produto[] p){
		ordenaBolha(p, true);	
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
		System.out.println("\n\n--- Lista de Produtos [id/idFabricante] ---");
		imprimeMatriz(p);
	}
	
}