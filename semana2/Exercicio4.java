class Exercicio4{

	static String mensagemAvaliacao = "";

	public static void main(String args[]){
		avaliaZerosDeFuncaoQuadratica(1,2,-3);
		System.out.println(mensagemAvaliacao);

		avaliaZerosDeFuncaoQuadratica(0,2,-3);
		System.out.println(mensagemAvaliacao);

		avaliaZerosDeFuncaoQuadratica(1,2,3);
		System.out.println(mensagemAvaliacao);
	}

	public static void avaliaZerosDeFuncaoQuadratica(double a, double b, double c){
		String equacaoExtenso = a + "x^2 + " + b + "x + " + c;
		if (a==0){
			mensagemAvaliacao = "A equação " + equacaoExtenso + 
				" não é quadrática.";
		}else{
			double d = Math.pow(b,2) - 4*a*c;
			if (d<0){
				mensagemAvaliacao = "A equação " + equacaoExtenso + 
					" não possui raízes reais.";
			}else{
				double x1 = (-b + Math.sqrt(d))/(2*a);
				double x2 = (-b - Math.sqrt(d))/(2*a);
				mensagemAvaliacao = "A equação " + equacaoExtenso + 
					" possui raízes x'=" + x1 + " e x\"=" + x2 + ".";
			}
		}
	}
}