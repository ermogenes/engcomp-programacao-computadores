class Exercicio09{
	public static void main(String args[]){
		System.out.println("Sa�da do item (a):"); a();
		System.out.println("\nSa�da do item (b):"); b();
		System.out.println("\nSa�da do item (c):"); c();
	}

	public static void a(){
		int soma = 33;
		int cont = 1;
		while (cont < 12) {
		soma = soma + cont;
		cont = cont + 2;
		}
		System.out.println("Os n�meros s�o: "+cont+" e "+soma);
	}

	public static void b(){
		int num = 0;
		while (num <= 5) {
		num = num + 1;
		System.out.println(num);
		}
	}

	public static void c(){
		int dest1 = 15;
		int dest2 = 27;
		int local1 = 20;
		int local2 = 20;
		boolean chegou1 = false;
		boolean chegou2 = false;
		while ((!chegou1) && (!chegou2)) {
		/*se move uma unidade por instante*/
		local1 = local1 - 1;
		local2 = local2 + 2; /*se move 2 X mais r�pido*/
		chegou1 = (local1 <= dest1);
		chegou2 = (local2 >= dest2);
		System.out.println("Os viajantes est�o em "+local1+
		" e "+local2);
		}
		System.out.println("As posi��es finais dos viajantes s�o "+local1+" e "+local2);	
	}
}