class Exercicio06{
	public static void main(String args[]){
		System.out.println("A " + dataMaisAntiga(1,1,2001,1,1,2002)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(1,1,2002,1,1,2001)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(1,1,2001,1,2,2001)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(1,2,2001,1,1,2001)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(1,1,2001,2,1,2001)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(2,1,2001,1,1,2001)
			+ " data é cronologicamente mais antiga.");
		System.out.println("A " + dataMaisAntiga(1,1,2001,1,1,2001)
			+ " data é cronologicamente mais antiga.");
	}
	
	public static String dataMaisAntiga(
						int dia1, int mes1,	int ano1,
						int dia2, int mes2,	int ano2
					){
		if (ano1 < ano2){
			return "primeira";
		}else{
			if (ano2 < ano1){
				return "segunda";
			}else{
				if (mes1 < mes2){
					return "primeira";
				}else{
					if (mes2 < mes1){
						return "segunda";
					}else{
						if (dia1 < dia2){
							return "primeira";
						}else{
							if (dia2 < dia1){
								return "segunda";
							}else{
								return "(iguais)"; // iguais
							}
						}
					}
				}
			}
		}
	}
}