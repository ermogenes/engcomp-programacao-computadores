class Exercicio02{
	public static void main(String args[]){
		int a = 1; int b = 2; int c = 3;
		rot02(1,2,-1);  // a entre 0 e b
		rot02(0,2,-1);  // a igual a zero
		rot02(-1,2,-1); // a menor que zero
		rot02(2,2,-1);  // a igual a b
		rot02(4,2,-1);  // a maior que b
	}
	
	public static void rot02(int a, int b, int c){
		if (a>0 && a<b) c = 0;
		System.out.println(c);
	}
}