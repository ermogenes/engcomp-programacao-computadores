class Exercicio5{

	public static void main(String args[]){

		String nomeTime = "S�o Paulo FC";
		int numeroJogador = 10;
		int numeroCartoesAmarelosJogador = 7;
		int numeroCartoesVermelhosJogador = 3;
		
		float valorMultaAmarelo = 1000.20F;
		float valorMultaVermelho = 4523.75F;

		System.out.println("Como multa pelos cart�es do jogador camisa " + 
			numeroJogador + " (A=" + numeroCartoesAmarelosJogador + 
			", V=" + numeroCartoesVermelhosJogador + "), o " + nomeTime +
			" dever� pagar R$" + 
			(valorMultaAmarelo * numeroCartoesAmarelosJogador + 
			valorMultaVermelho * numeroCartoesVermelhosJogador) + ".");
	}

}