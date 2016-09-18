class Exercicio07{
	public static void main(String args[]){
		System.out.println(ehDivisor(1,1));
		System.out.println(ehDivisor(2,1));
		System.out.println(ehDivisor(3,1));
		System.out.println(ehDivisor(3,3));
		System.out.println(ehDivisor(6,3));
		
		System.out.println(ehDivisor(3,2));
		System.out.println(ehDivisor(3,6));
		System.out.println(ehDivisor(3,7));
		System.out.println(ehDivisor(7,3));
	}
	
	public static boolean ehDivisor(int n, int divisor){
		return ((n % divisor) == 0);
	}
}