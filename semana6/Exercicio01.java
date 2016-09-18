class Exercicio01{

	public static void main(String args[]){
		Pessoa[] p = new Pessoa[5];
		p[0] = new Pessoa(
				"João", 'M', "123456789", 
				1, 1, 2001
			);
		p[1] = new Pessoa(
				"Maria", 'F', "987654321",
				31, 12, 2001
			);
		p[2] = new Pessoa(
				"José", 'M', "654987321",
				1, 6, 2001
			);
		p[3] = new Pessoa(
				"Ana", 'F', "321456987",
				10, 3, 2005
			);
		p[4] = new Pessoa(
				"Juliana", 'F', "456987123",
				7, 8, 2001
			);
			
		for(Pessoa atual: p)
			System.out.println(atual.toString());
	}

}

class Pessoa{

	public String nome;
	public char sexo;
	public String rg;
	public Data dataNascimento;
	
	public Pessoa(
		String nome, char sexo, 
		String rg, 
		int diaDataNascimento, 
		int mesDatanascimento, 
		int anoDataNascimento
	){
		this.nome = nome;
		this.sexo = sexo;
		this.rg = rg;
		this.dataNascimento = new Pessoa.Data(
							diaDataNascimento, 
							mesDatanascimento, 
							anoDataNascimento
						);
	}
	
	public String toString(){
		return this.nome + "\t" + sexo + "\t" + 
			rg + "\t" + dataNascimento.toString();
	}

	private class Data{
		public int dia;
		public int mes;
		public int ano;
		
		public Data(int d, int m, int a){
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		
		public String toString(){
			return this.dia + "/" + this.mes + "/" + this.ano;
		}
	}
}