package Esercizi;

public class Floyd {
    public static void main(String[] args) {
    //INIZIALIZZAZIONE VARIABILI
    int n = SIn.readInt();
    int k = 0;
        //funziona ma non so come :)
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <= i; j++){
                k++;
                    System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}