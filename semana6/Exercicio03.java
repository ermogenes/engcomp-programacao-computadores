class Exercicio03{

	public static void main(String args[]){
		String original = "Univesp";
		String copia = copiaString(original);
		copia += " (alterado)";
		System.out.println("Original: " + original + "\t" + "Cópia: " + copia);
	}
	
	public static String copiaString(String s){
		return new String(s); 
	}

}