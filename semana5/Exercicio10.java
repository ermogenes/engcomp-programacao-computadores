class Exercicio10{

	public static void main(String args[]){
		Complexo[] ncs1 = {
			new Complexo(0, 0),
			new Complexo(1, 2),
			new Complexo(2, 3),
			new Complexo(Math.PI, 1)
		};
		
		Complexo[] ncs2 = {
			new Complexo(2, 3),
			new Complexo(Math.PI, 1),
			new Complexo(1, 2),
			new Complexo(0, 0)
		};
		
		for (int i = 0; i < ncs1.length; i++)
			imprimeLinha(ncs1[i], ncs2[i]);
	}
	
	static void imprimeLinha(Complexo c1, Complexo c2){
			System.out.print("(" + c1.toString());
			System.out.print(") + (");
			System.out.print(c2.toString());
			System.out.print(") = (");
			System.out.print(Complexo.soma(c1, c2).toString());
			System.out.println(")");
			
			System.out.print("(" + c1.toString());
			System.out.print(") - (");
			System.out.print(c2.toString());
			System.out.print(") = (");
			System.out.print(Complexo.subtracao(c1, c2).toString());
			System.out.println(")");
	}
}

class Complexo{

	public double r;
	public double i;

	public Complexo(double r, double i){
		this.r = r;
		this.i = i;
	}
	
	public static Complexo soma(Complexo c1, Complexo c2){
		return new Complexo(c1.r + c2.r, c1.i + c2.i);
	}
	
	public static Complexo subtracao(Complexo c1, Complexo c2){
		return new Complexo(c1.r - c2.r, c1.i - c2.i);
	}
	
	public String toString(){
		return this.r + " + " + this.i + "i";
	}
}