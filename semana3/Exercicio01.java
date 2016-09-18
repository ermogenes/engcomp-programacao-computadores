class Exercicio01{
	public static void main(String args[]){
		System.out.println("Saída do item (a):"); a();
		System.out.println("\nSaída do item (b):"); b();
		System.out.println("\nSaída do item (c):"); c();
		System.out.println("\nSaída do item (d):"); d();
		System.out.println("\nSaída do item (e):"); e();
	}

	public static void a(){
		if (5 < 5) System.out.println("sim");
		System.out.println(" é a resposta.\n");
	}

	public static void b(){
		int var1 = 3;
		int var2 = 6;
		if ((var1 + 2) < var2) System.out.println("oba");
		if ((var1 + 4) < var2) System.out.println("abo");
		if ((var1 + 4) > var2) System.out.println("aob");
		System.out.println("ola\n");
	}

	public static void c(){
		int a = 10;
		int b = 20;
		int c;
		if (a < b) c = a;
		else c = b;
		System.out.println(a+" "+b+" "+c);
	}

	public static void d(){
		int a = 10;
		int b = 20;
		int c = (a < b) ? a : b;
		System.out.println(a+" "+b+" "+c);
	}

	public static void e(){
		int a = 3;
		int b = 4;
		boolean continua = true && ((a + b) < (2 * a));
		if (continua) System.out.println("alto");
		else System.out.println("baixo");
	}
}