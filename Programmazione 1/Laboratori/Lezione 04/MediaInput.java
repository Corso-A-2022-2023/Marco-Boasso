package Esercizi;

public class MediaInput {
    public static void main(String[] args) {
        // INIZIALIZZAZIONE VARIABILI
        int n;
        int i = 0;
        int somma = 0;

        System.out.println("Inserisci una serie di interi positivi, termina con 0");
        do{ //continua a chiedere numeri finchè non inserisco 0
        n = SIn.readInt();
        somma = somma + n;
        i++; //tiene il conto del numero dei numeri inseriti
        } while (n != 0);
        float media = somma/(float)(i-1); //"i-1" perchè sennò considera anche lo zero
        System.out.println("la media è: " + media);
    }
}
