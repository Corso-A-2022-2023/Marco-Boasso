package Esercizi;

public class ParitaInput {
    public static void main(String[] args) {
        int n;
        int i = 0;
        boolean dispari = true;
        boolean pari = true;
        System.out.println("Inserisci una serie di interi positivi, termina con 0");
        do{ //continua a chiedere numeri finchè non inserisco 0
            i++;
            n = SIn.readInt();
            if (n%2 == 0 && n!=0)
                dispari = false; //abbasso la flag "dispari" se trovo un numero pari (tranne con 0)
            if (n%2 != 0)
                pari = false; // abbasso la flag "pari" se trovo un numero dispari
        } while (n != 0);

        //SERIE DI IF PER SCEGLIERE COSA STAMPARE
        if (pari)
            System.out.println("Tutti i numeri inseriti sono pari");

        if (dispari)
        System.out.println("Tutti i numeri inseriti sono dispari");

        if (i == 1)
            System.out.println("non hai inserito numeri");
        

        if (!(pari&&dispari))
            System.out.println("Ci sono sia numeri pari che numeri dispari");
    }
}