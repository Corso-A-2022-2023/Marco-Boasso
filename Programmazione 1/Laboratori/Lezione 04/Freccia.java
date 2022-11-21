import java.util.Scanner;
class Freccia{
	public static void stampaRiga(){
		Scanner input = new Scanner(System.in);	
		System.out.println("Dimmi il valore di asterischi");
		int a = input.nextInt();
		System.out.println("Dimmi il valore di punti");
		int b = input.nextInt();
		for (int i = 0; i<a; i++){
			System.out.print("*");
		}
		for (int j = 0; j<b; j++){
			System.out.print(".");
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		int n = input.nextInt();
		
		for (int i = 0; i<n; i++){
			for (int j = 0; j<i; j++){
				System.out.print(".");
			}
			System.out.println("**");
		}
		for (int k = n; k>0; k--){
			for (int j = 1; j<k; j++){
				System.out.print(".");
			}
			System.out.println("**");
		}
		stampaRiga();
	}
}