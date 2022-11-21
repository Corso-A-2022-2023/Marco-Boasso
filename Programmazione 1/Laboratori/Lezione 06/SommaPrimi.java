import java.util.Scanner;
class SommaPrimi{

public static int sommaPrimi(int n){
	int somma;
	if ((sommaPrimi(n-1) >= 0)&&(sommaPrimi(n-1)%sommaPrimi(n-(n-1))==0)){
		somma 
		= sommaPrimi(n-1);
		return n;
	}
		return 0;
	}
	
	
	
	
	public static void main(String[] args){
		System.out.println("inserisci un numero intero positivo");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int somma = sommaPrimi(n);
		System.out.println("la somma di tutti i numeri primi compresi tra 0 e " + n + " e' " + somma);
	}
}