class Exercicio02{

	public static void main(String args[]){
		String[] palmo = new String[]{
			"ovo",
			"osso",
			"os!#so",
			"socorrammesubinoonibusemmarrocos",
			"arara",
			"ermogenes",
			"univesp"
		};
		
		for(String p: palmo)
			System.out.println(p + ": " + isPalmo(p));
	}
	
	public static boolean isPalmo(String s){
		int ult = s.length();
		boolean isPalmo = true;
		// percorre metade da string
		for(int i = 0; i <= ult/2; i++)
			isPalmo = (isPalmo && (s.charAt(i) == s.charAt(ult-1-i)));
		return isPalmo;
	}

}