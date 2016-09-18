class Exercicio08{
	public static void main(String args[]){
		System.out.println(ehTriangulo(1,1,1));
		System.out.println(ehTriangulo(1,2,3));
		System.out.println(ehTriangulo(2,3,4));
		System.out.println(ehTriangulo(3,4,5));
	}
	
	public static boolean ehTriangulo(
							float c1, float c2, float h
						){
		return ((c1*c1 + c2*c2) == (h*h));
	}
}