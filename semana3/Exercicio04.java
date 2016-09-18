class Exercicio04{
	public static void main(String args[]){
		exibeOrdenadoAsc(1, 2, 3);
		exibeOrdenadoAsc(4, 2, 3);
		exibeOrdenadoAsc(1, 4, 3);
		exibeOrdenadoAsc(1, 1, 1);
		exibeOrdenadoAsc(1, 1, 3);
		exibeOrdenadoAsc(4, 4, 3);
		exibeOrdenadoAsc(1, 3, 3);
		exibeOrdenadoAsc(4, 3, 3);
		exibeOrdenadoAsc(1, 1, 0);
		exibeOrdenadoAsc(1, 2, 0);
		exibeOrdenadoAsc(4, 2, 0);
	}
	
	public static void exibeOrdenadoAsc(int a, int b, int c){
		int maior; int menor; int intermediario;
		
		if (a<b) {
			if (b<c){
				menor = a; intermediario = b; maior = c;
			}else{
				if (a<c){
					menor = a; intermediario = c; maior = b;
				}else{
					menor = c; intermediario = a; maior = b;
				}
			}
		}else{
			if (a<c){
				menor = b; intermediario = a; maior = c;
			}else{
				if (b<c){
					menor = b; intermediario = c; maior = a;
				}else{
					menor = c; intermediario = b; maior = a;
				}
			}
		}
		
		System.out.println(
			menor + " <= " + intermediario + " <= " + maior
		);	
	}
}