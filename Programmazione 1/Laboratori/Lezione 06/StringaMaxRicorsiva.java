import java.util.Scanner;
class StringaMaxRicorsiva{
	public static String lunghezza(){
		Scanner sc = new Scanner(System.in);
		String er = "errore";
		String a = sc.nextLine();
		if (a.length() == 0)
			return er;
		String b = lunghezza();
		if (b.length() >= a.length()){
			return b;
		}
		else{
			return a;
		}
		
		
		
	}
	
	
	public static void main(String[] args){
		System.out.println("Inserisci una serie di stringhe, termina con stringa vuota");
		String lunga = lunghezza();
		System.out.println("la stringa piu' lunga e':");
		System.out.println(lunga);
	}
}