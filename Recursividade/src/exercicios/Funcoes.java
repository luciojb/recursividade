package exercicios;

public class Funcoes {
	
	public static int Fatorial(int num){
		if (num<=1)
			return 1;
		else 
			return num*Fatorial(num -1);
	}
	
	public static String ReverteNome(String nome){
		if (nome.length()<=1)
			return nome;
		else {
			String LastLetra = String.valueOf(nome.charAt(nome.length()-1));
			nome = nome.substring(0, nome.length()-1);
			return LastLetra+ReverteNome(nome);
		}
	}
	
	public static int Expoente(int num, int exp){
		if (exp==1)
			return num;
		else
			return num*Expoente(num, exp-1);
	}
}
