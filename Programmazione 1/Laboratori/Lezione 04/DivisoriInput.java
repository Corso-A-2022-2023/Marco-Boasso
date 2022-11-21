package Esercizi;

public class DivisoriInput {
    public static void main(String[] args) {
        // INIZIALIZZAZIONE VARIABILI
        int n = SIn.readInt();
        System.out.print("i divisori di " + n + " sono: ");
        for (int i = 1; i <= n; i++){ 
            if (n%i == 0) //Se il resto della divisione (n/i) è 0 allora i è un divisore di n
                System.out.print(i + " "); //quindi lo stampo
        }
    }
    
}
