import java.util.Scanner;
public class MetodiRicorsivi{
	public static int sommatoriaRicorsiva(){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int somma = 0;
	if (a==0){
		return somma;
	}
	else{
		somma = a + sommatoriaRicorsiva();
		return somma;
	}
	}
	
	
	
	public static boolean trovaCarattere(String s, char c){
		return trovaCarattereRic(s, c, 0);
	}
	
	public static boolean trovaCarattereRic(String s, char c, int i){
		if(i < s.length()){
			if(s.charAt(i) != c)
				return trovaCarattereRic(s, c, i + 1);
			else
				return true;
		}
		else
			return false;		
	}
	
	
	
	public static int contaCaratteri(String s, char c){
		return contaCaratteriRic(s, c, 0);
	}
	
	public static int contaCaratteriRic(String s, char c, int i){
		if(i == s.length())
			return 0;
		else {
			if(s.charAt(i) == c)
				return 1 + contaCaratteriRic(s, c, i+1);
			return contaCaratteriRic(s,c,i+1);
		}
	} 
	
	public static boolean palindroma(String s){
		return palindromaRic(s, 0);
	}
	
	
	public static boolean palindromaRic(String s, int i){
		if((s.length()/2)<=i){
			return true;
		}
		else{
			if (s.charAt(i) == s.charAt(s.length() - 1 - i))
				return palindromaRic(s, i+1) && true;
			else
				return false;
		}
	}
	
	public static String conversioneCaratteri(String s){
		return conversioneCaratteriRic(s, s.length() -1);
	}
	public static String conversioneCaratteriRic(String s, int i){
		if(i < 0)
			return "";
		else{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
				return conversioneCaratteriRic(s, i-1) + "*";
			}
			else if(((s.charAt(i) > 'a') && (s.charAt(i))<= 'z') || ((s.charAt(i) > 'A') && (s.charAt(i))<= 'Z')){
				return conversioneCaratteriRic(s, i-1) + "$";
			}
			else
				return conversioneCaratteriRic(s, i-1) + "-";
		}
	}
	
	
	public static String stringaInversa(String s){
		return stringaInversaRic(s, 0);
	}
	
	public static String stringaInversaRic(String s, int i){
		
		if (i == s.length())
			return "";
		else{
			return stringaInversaRic(s, i+1) + s.charAt(i);
		}
		
		
	}
	
	public static String eliminaCarattere(String s, int i){
		return eliminaCarattereRic(s, i, s.length()-1);	
	}
	
	public static String eliminaCarattereRic(String s, int n, int i){
		if (i<0)
			return "";
		else{
			if(i == n)
				return eliminaCarattereRic(s, n, i-1);
			else
				return eliminaCarattereRic(s, n, i-1) + s.charAt(i);
		}
		
	}
	
	public static String permutazioniStringaRic(String s, int i){
			if (i < 0)
				return "";
			else{
				
			}
	}
	public static String permutazioniStringa(String s){
		return permutazioniStringaRic(s, s.length()-1);
	}
	
	
	
	public static String scambioLettere(String s, int i){
		String st1, st2, st3, st4;
		st1 = s.substring(0, i);
		st2 = "" + s.charAt(i);
		st3 = "" + s.charAt(i+1);
		st4 = s.substring(i+2);
		return st1 + st3 + st2 + st4;
		
	}
	
}