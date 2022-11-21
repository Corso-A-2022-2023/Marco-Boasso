import java.util.Scanner;
class Quadrato{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
/*
int n;
System.out.println("Dimensioni del quadrato?");
n = input.nextInt();
for (int i = 0; i<n; i++){
	for (int j = 0; j<i; j++){
		System.out.print("*");	
	}
	System.out.print("/");
	for (int k = n; k>i; k--){
		System.out.print(":");
	}
	System.out.print("\n");		
	}
	*/
	
	
	int n;
	System.out.println("Dimensioni del quadrato?");
	n = input.nextInt();
	for (int i = 0; i<n; i++){
		for(int j = 0; j<n; j++){
			if (i<j)
				System.out.print("*");
			else if (i == j)
				System.out.print("/");
			else
				System.out.print(":");
		}
		System.out.println("");
	}
}
}
