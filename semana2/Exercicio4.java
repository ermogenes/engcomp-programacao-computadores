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
			mensagemAvaliacao = "A equa��o " + equacaoExtenso + 
				" n�o � quadr�tica.";
		}else{
			double d = Math.pow(b,2) - 4*a*c;
			if (d<0){
				mensagemAvaliacao = "A equa��o " + equacaoExtenso + 
					" n�o possui ra�zes reais.";
			}else{
				double x1 = (-b + Math.sqrt(d))/(2*a);
				double x2 = (-b - Math.sqrt(d))/(2*a);
				mensagemAvaliacao = "A equa��o " + equacaoExtenso + 
					" possui ra�zes x'=" + x1 + " e x\"=" + x2 + ".";
			}
		}
	}
}