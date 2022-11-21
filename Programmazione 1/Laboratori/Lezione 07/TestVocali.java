import java.util.Scanner;
public class TestVocali{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("char P in " + s + ": " + MetodiRicorsivi.trovaCarattere(s, 'P'));
		System.out.println("quante volte? " + MetodiRicorsivi.contaCaratteri(s, 'P'));
	}
}