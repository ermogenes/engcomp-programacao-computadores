class Exercicio09{

	public static void main(String args[]){
		double[] p1 = {1,2,3,4,5};
		double[] p2 = {0,0,1,0,2,3,0};
		System.out.printf("p1: %s\np2: %s\nSoma: %s", 
			exibePolinomio(p1),
			exibePolinomio(p2),
			exibePolinomio(somaPolinomios(p1,p2))
		);
	}
	
	static double[] somaPolinomios(double[] p1, double p2[]){
		double[] polMenor;
		double[] polMaior;
		double[] polSoma;
		
		int tamP1 = p1.length;
		int tamP2 = p2.length;
		int tamSoma;
		
		if (tamP1 >= tamP2){
			tamSoma = tamP1;
			polMaior = p1;
			polMenor = p2;
		}else{
			tamSoma = tamP2;
			polMaior = p2;
			polMenor = p1;
		}

		polSoma = new double[tamSoma];
		int tamMaior = polMaior.length;
		int tamMenor = polMenor.length;
		
		for(int i = 0; i < tamMenor; i++)
			polSoma[i] = polMenor[i] + polMaior[i];
		
		for(int i = tamMenor; i < tamMaior; i++)
			polSoma[i] = polMaior[i];
			
		return polSoma;
	}

	static String exibePolinomio(double[] p){
		String strRet = "";
		for(int i=0; i < p.length; i++){
			if(strRet.length() > 0 && i!=0 && p[i]!=0) strRet += " + ";
			if(p[i]!=0){
				strRet += p[i];
				if (i!=0) strRet += "x";
				if (i>=2) strRet += "^" + i;
			}
		}
		return strRet;
	}
}