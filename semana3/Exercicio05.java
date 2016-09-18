class Exercicio05{
	public static void main(String args[]){
		System.out.println(converterFParaC(32, false));
		System.out.println(converterFParaC(0, true));
	}
	
	public static double converterFParaC(
						float temperatura,
						boolean inverter
					){
		if (!inverter){
			return (temperatura - 32) * 5/9;
		}else{
			return (temperatura * 9/5) + 32;
		}
		
	}
}