class Exercicio12{
	public static void main(String args[]){
		System.out.println(-1 + " => " + classificarSaffirSimpson(-1));
		System.out.println(0 + " => " + classificarSaffirSimpson(0));
		System.out.println(1 + " => " + classificarSaffirSimpson(1));
		System.out.println(62 + " => " + classificarSaffirSimpson(62));
		System.out.println(119 + " => " + classificarSaffirSimpson(119));
		System.out.println(154 + " => " + classificarSaffirSimpson(154));
		System.out.println(178 + " => " + classificarSaffirSimpson(178));
		System.out.println(210 + " => " + classificarSaffirSimpson(210));
		System.out.println(249 + " => " + classificarSaffirSimpson(249));
		System.out.println(250 + " => " + classificarSaffirSimpson(250));
		System.out.println(500 + " => " + classificarSaffirSimpson(500));
	}
	
	static String classificarSaffirSimpson(int velocidadeVentoKmH){
		String classificacao;
		
		if (velocidadeVentoKmH < 62){
			classificacao = "N�o classificado";
		}else{
		if (velocidadeVentoKmH >=62 && velocidadeVentoKmH <= 118){
			classificacao = "Tempestade tropical";
		}else{
		if (velocidadeVentoKmH >=119 && velocidadeVentoKmH <= 153){
			classificacao = "Furac�o categoria 1";
		}else{
		if (velocidadeVentoKmH >=154 && velocidadeVentoKmH <= 177){
			classificacao = "Furac�o categoria 2";
		}else{
		if (velocidadeVentoKmH >=178 && velocidadeVentoKmH <= 209){
			classificacao = "Furac�o categoria 3";
		}else{
		if (velocidadeVentoKmH >=210 && velocidadeVentoKmH <= 249){
			classificacao = "Furac�o categoria 4";
		}else{
			classificacao = "Furac�o categoria 5";
		}	}	}	}	}
		}
		return classificacao;
	}
}