class Exercicio07{

	public static void main(String args[]){
		for(int i=0; i<10; i++) Ola.cumprimenta();
	}
}

class Ola{
	static int c = 0;
	
	public static void cumprimenta(){
		int modo = c%3;
		c++;
		String mensagem = "";
		switch (modo) {
            case 0:  mensagem = "Oi!";
                     break;
            case 1:  mensagem = "Olá!";
                     break;
            case 2:  mensagem = "E aí, blz?";
                     break;
		}
		System.out.println(mensagem);
	}
	
}