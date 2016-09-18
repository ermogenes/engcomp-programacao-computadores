class Exercicio08{

	public static void main(String args[]){
		int[] parm1 = new int[10];
		int n1 = 5; int n2 = 7;
		int[] parm2 = {1,7,3,7};
		
		Simples simples = new Simples();
		simples.inicializaArray(parm1, n1);
		System.out.println("A matriz abaixo...");
		imprimeMatriz(parm1);
		System.out.println("... contém o valor " + n1 + "? "
			+ (simples.estaNoArray(parm1,n1) ? "SIM" : "NÃO"));
		System.out.println("... contém o valor " + n2 + "? "
			+ (simples.estaNoArray(parm1,n2) ? "SIM" : "NÃO"));
		System.out.println("\nA matriz abaixo...");
		imprimeMatriz(parm2);
		System.out.println("... contém o valor " + n1 + "? "
			+ (simples.estaNoArray(parm2,n1) ? "SIM" : "NÃO"));
		System.out.println("... contém o valor " + n2 + "? "
			+ (simples.estaNoArray(parm2,n2) ? "SIM" : "NÃO"));
	}

	static void imprimeMatriz(int[] mx){
		int n = mx.length;
		for(int i=0;i<n;i++)
			System.out.print(mx[i] + "\t");
		System.out.print("\n");
	}	
}

class Simples{

	void inicializaArray(int[] a, int v){
		for(int i=0; i < a.length; i++) a[i]=v;
	}
	
	boolean estaNoArray(int[] a, int v){
		boolean retVal = false;
		for(int i=0; i < a.length; i++) 
			retVal = retVal || a[i] == v;
		return retVal;
	}
}