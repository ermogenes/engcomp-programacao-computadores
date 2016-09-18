class Exercicio11{
	public static void main(String args[]){
		int contador = 1;
		int numero = 2;
		int soma = 0;
		while(contador <= 10){
			soma+=numero;
			numero+=2;
			contador++;
		}
		System.out.println(soma);
	}
}