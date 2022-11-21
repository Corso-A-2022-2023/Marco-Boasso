import java.util.Scanner;
public class TestPalindromi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s + " e' palindroma? " + MetodiRicorsivi.palindroma(s));
	}
}