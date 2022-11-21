import java.util.Scanner;
class ControllaStringa{
	
	public static boolean tutteCifre (String str, int n) {
        if (str.charAt(n) >= '0' && str.charAt(n) <= '9'){
            if (n == str.length()-1)
                return true;
            return tutteCifre(str, n+1);
        }
        return false;
    }
    public static boolean tutteCifreRic (String str) {      
        return tutteCifre(str, 0);
	}
	
	public static void main(String[] args){
		System.out.println("Inserisci una stringa numerica");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (tutteCifreRic(str)){
			System.out.println("Hai inserito una stringa numerica!");
		}
		else{
			System.out.println("Non hai inserito una stringa numerica!");
			
		}
	}
}