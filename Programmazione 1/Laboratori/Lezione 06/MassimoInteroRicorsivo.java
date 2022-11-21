import java.util.Scanner;
class MassimoInteroRicorsivo{
		public static int leggiNum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 0)
			return 0;
		int b = leggiNum();
		if (b < a){
			return a;
		}
		else{
			return b;
		}
	}

	public static void main(String[] args){
		System.out.println("Inserisci una serie di numeri, termina inserendo 0");
		int max = leggiNum();
		System.out.println("il massimo e': " + max);	
	}
}