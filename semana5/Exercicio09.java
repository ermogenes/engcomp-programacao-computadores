class Exercicio09{

	public static void main(String args[]){
		Esfera[] es = {
			new Esfera(0),
			new Esfera(1),
			new Esfera(2),
			new Esfera(Math.PI)
		};
		
		for (int i = 0; i < es.length; i++)
			imprimeEsfera(es[i]);
	}

	static void imprimeEsfera(Esfera e){
		System.out.println("\nRaio: " + e.raio +
			", Área: " + e.area() +
			", Volume: " + e.volume()
		);
	}	
}

class Esfera{

	public double raio;

	public Esfera(double raio){
		this.raio = raio;		
	}
	
	public double area(){
		return 4 * Math.PI * Math.pow(this.raio, 2);
	}
	
	public double volume(){
		return (4 * Math.PI * Math.pow(this.raio, 3))/3;
	}
}