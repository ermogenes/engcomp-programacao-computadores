class Exercicio01abc{
	public static void main(String args[]){
		System.out.println("\nSa�da (a)\n"); a();
		System.out.println("\nSa�da (b)\n"); b();
		System.out.println("\nSa�da (c)\n"); c();
	}

	static void a(){
		for(int cont = 1; cont <= 5; cont++)
			System.out.println("Oi");
	}

	static void b(){
		for(int cont = 1; cont <= 5; cont++)
			System.out.print("Oi");
	}

	static void c(){
		for(int cont = 1; cont <= 3; cont++) {
			System.out.print("Oi");
			System.out.print(" Programador");
		}
	}
}