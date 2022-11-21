import java.util.Scanner;
class Fibonacci{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
//DICHIARAZIONE VARIABILI
int n;
int a = 0;
int b = 1;
int output = 0;
//RICHIESTA INPUT
System.out.println("quanto la vuoi lunga sta sequenza?");
n = input.nextInt();

System.out.print("0 ");
for(int i = 0; i < n; i++){
	output = a + b;
	a = b;
	b = output;
	System.out.print(output + " ");
	
	
	
}
}
}