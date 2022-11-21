import java.util.Scanner;
public class EserciziWhile {
public static void main(String[] args){
// DICHIARAZIONE VARIABILE TRAMITE INPUT DA TASTIERA 
Scanner input = new Scanner(System.in);
int n = input.nextInt(); 
int m = n;

for (int i = 0; i<=n; i++){
    System.out.print(i + " ");
}
System.out.println();


while (n >= 0){
    System.out.print((n--)+ " ");
}

for (int j = 1; j<=n; j = j + 2){
    System.out.print(j + " ");
}


int fattoriale = 1;
for (int k = 1; k<=m; k++){
    fattoriale = fattoriale*k;
}
System.out.println("Il valore del fattoriale è " + fattoriale);

}
}