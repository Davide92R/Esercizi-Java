// import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*ESERCIZIO 1: Area Trapezio*/
// public class Main {
//     public static void main(String[] args) {
//         double b1,b2,area,altezza;
//         Scanner in = new Scanner(System.in);

//         while(inserisciSiOppureNo()){

//             System.out.println("Inserisci la base 1: ");
//             b1= in.nextDouble();

//             System.out.println("Inserisci la base 2: ");
//             b2= in.nextDouble();
//             System.out.println("Inserisci l'altezza: ");
//             altezza= in.nextDouble();

//             area = (b1 + b2)* altezza/2;
//             System.out.println("Risultato: " + area);
//         }
//     }

//     public static boolean inserisciSiOppureNo(){
//         Scanner in = new Scanner(System.in);
        
//         System.out.println("Vuoi continuare? digita si o no");
//         String faiUnaScelta = in.nextLine();

//         if("si".equalsIgnoreCase(faiUnaScelta))
//             return true;
//         else
//             return false;

//     }
// }

/*ESERCIZIO 2: Area Triangolo METODO 1*/

// public class Main{
//     public static void main(String[] args){

//         int base, altezza, area;

//         base = 4;
//         altezza = 10;
//         area = base * altezza / 2;

//         System.out.println("Area: " + area);
//     }
// }

/*ESERCIZIO 3: Area Triangolo METODO 2 in maniera dinamica.*/

// public class Main{
//     public static void main(String[] args){
//         int base, altezza, area;

//         Scanner in = new Scanner(System.in);

//         System.out.println("Inserisci un numero intero per la base: ");
//         base = in.nextInt();
//         System.out.println("Inserisci un numero intero per l'altezza: ");
//         altezza = in.nextInt();

//         area = base * altezza / 2;
//         System.out.println("Area: " + area);

//     }
// }

/*ESERCIZIO 4: Area Triangolo METODO 3: Con il cilo for */

// public class Main{
//     public static void main(String[]args){

//         int base, altezza, area;
//         int ripeti=0;

//         Scanner in = new Scanner(System.in);

//         System.out.println("Quante volte vuoi ripetere il calcolo? inserisci N° volte: ");
//         ripeti = in.nextInt();

//         for (int i = 0; i < ripeti; i++) {
            
//             System.out.println("Inserisci un numero intero per la base: ");
//             base = in.nextInt();
    
//             System.out.println("Inserisci un numero intero per l'altezza: ");
//             altezza = in.nextInt();
    
//             area = base * altezza / 2;
//             System.out.println("Area: " + area);
//         }
//     }
// }

/*ESERCIZIO 5: Visualizzare numeri da 10 a 100*/

// public class Main{
//     public static void main(String[]args){

//         // int numeri;

//         for(int i=10; i<101;i++){
//             System.out.println(i);
//         }
//     }
// }

/*ESERCIZIO 6: Visualizzare numeri da 10 a 100 sulla stessa linea.*/

// public class Main{
//     public static void main(String[]args){

//         /*Con il ciclo FOR:*/
//         // for(int i=10; i<101; i++){
//         //     System.out.print(i + " ");
//         // }

//         /*Con il cilo WHILE:*/
//         int i=10;
//         while(i<=100){
//             System.out.print(i + " ");
//             i++;
//         }
//     }
// }

/*ESERCIZIO 7: Visualizzare i multipli di 2,3,4, a seconda di quale metti in input, e mostra i suoi multipli da 1 a 100.*/

// public class Main{
//     public static void main(String[]args){

//         int n= multiplo();
//         for (int i = 1; i <= 100; i++) {
//             if(i % n == 0){
//                 System.out.print(i + " ");
//             }
//         }
//     }
    
//     public static int multiplo(){
        
//         int n=0;
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Scegli un numero intero e ti mostrerò i suoi multipli! Scegli il numero: ");
//             n=in.nextInt();
//         }
//         return n;
//     }
// }

/*ESERCIZIO 8: Programma per calcolare la somma di n numeri scelti dall'utente. Possono scegliere anche numeri con la virgola!!*/

// public class Main{
//     public static void main(String[]args){
        
//         double somma=0;
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Quanti numeri vuoi inserire? ");
//             double n= in.nextDouble();

//             for (double i = 0; i < n; i++) {
                
//                 System.out.println("Inserisci un numero: ");
//                 double x = in.nextDouble();

//                 somma = somma + x;
//             }

//             System.out.println("La somma dei numeri scelti è: " + somma);
//         }
//     }
// }

/*ESERCIZIO 9: Programma che conta da un numero scelto dall'utente fino a 10. Usando il while. Se il numero è inferiore di 10 allora non mostra nulla. */

// public class Main{
//     public static void main(String[]args){

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("inserisci un numero intero: ");
//             int n = in.nextInt();

//             if(n<10){
//                 System.out.println("Numero troppo piccolo! Inserisci un numero maggiore di 10!!");
//             }

//             while(n >= 10){
//                 System.out.println();
//                 System.out.println(n);
//                 n--;
//             }
//         }
//     }
// }

/*ESERCIZIO 10:Strutture di controllo in base alle decisioni.
Alice deve decide se uscire con Bob.
1 - Se Bob viene a prenderla con la Ferrari, allora lei uscirà con lui, solo se indossa i soliti bruttissimi mocassini.
2 - Se Bob non viene a prenderla con la Ferrari, uscirà con lui se NON indossa gli occhiali da sole.
Finale - Fai la scelta per lei perchè in base 
Programma avrà tre variabili boolean.
Se la risposta è positiva allora uscirà "Usciamo".
*/

// public class Main{
//     public static void main(String[]args){

//         boolean ferrari, mocassini, occhialiDaSole;
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Bob arriva con il Ferrari? Rispondi true o false: ");
//             ferrari = in.nextBoolean();

//             if(ferrari == true){
//                 System.out.println("Bob arriva con i soliti bruttissimi mocassini? Rispondi true o false: ");
//                 mocassini = in.nextBoolean();

//                 if(mocassini == true){
//                     System.out.println("Usciamo");
//                 }else{
//                     System.out.println("Bob per uscire con te DOVEVI venire con il Ferrari e i Mocassini");
//                 }
//             }else{
//                 System.out.println("Bob indossa gli occhiali da sole? Rispondi true o false: ");
//                 occhialiDaSole = in.nextBoolean();

//                 if(occhialiDaSole == false){
//                     System.out.println("Usciamo");
//                 }else{
//                     System.out.println("Non Possiamo uscire perchè NON sei venuto con la Ferrari e hai gli Occhiali da sole!");
//                 }
//             }
//         }
//     }
// }

/*ESERCIZIO 11: Calcolare il massimo tra 2 cifre*/

// public class Main{
//     public static void main(String[]args){

//         double a, b;
//         // double max = -1;

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Scegli il primo numero: ");
//             a = in.nextDouble();
//             System.out.println("Scegli il secondo numero: ");
//             b= in.nextDouble();
//         }
        
//         if(a>b){
//             System.out.println("il massimo è il primo valore inserito ovvero: " + a);
//         }else if(a<b){
//             System.out.println("il massimo è il secondo valore inserito ovvero: " + b);
//         }else{
//             System.out.println("Non c'è un massimo perchè sono uguali");
//         }
//     }
// }

/*ESERCIZIO 11: Trovare il minimo comune multiplo e il massimo comune divisore tra due numeri*/

// public class Main{
//     public static void main(String[]args){
        /*PRIMO METODO (FATTO DA ME: da in automatico, selezionando due numeri casuali, sia il MCD che il MCM)*/
        // int a,b;
        // int piuGrande, piuPiccolo;

        // try (Scanner in = new Scanner(System.in)) {
        //     System.out.println("Scegli il primo numero: ");
        //     a = in.nextInt();
        //     System.out.println("Scegli il secondo numero: ");
        //     b = in.nextInt();

        //     /* MASSIMO COMUNE DIVISORE */
        //     if(a>b){
        //         piuGrande = a;
        //         piuPiccolo = b;
        //     }else{
        //         piuGrande = b;
        //         piuPiccolo = a;
        //     }
    
        //     int resto = piuGrande%piuPiccolo;
        //     while(resto != 0 && resto != 1){
        //         piuGrande=piuPiccolo;
        //         piuPiccolo=resto;
        //         resto= piuGrande%piuPiccolo;
        //     }
    
        //     if(resto == 0){
        //         System.out.println("Il massimo comune divisore è: " + piuPiccolo);

        //         /* MINIMO COMUNE MULTIPLO */
        //         int mCm = a * b /piuPiccolo;
        //         System.out.println("Il minimo comune multiplo è: " + mCm);

        //     }else if(resto == 1){
        //         System.out.println("Non c'è massimo comune divisore!");

        //         /* MINIMO COMUNE MULTIPLO */
        //         int mCm = a * b /resto;
        //         System.out.println("Il minimo comune multiplo è: " + mCm);
        //     }
        // }

        /*SECONDO METODO: In questo caso si effettua la prima scelta se fare il mino comune multiplo o il maggiore comune divisore; poi si effettua la seconda scelta ovvero quella dei numeri interi; poi il sistema fai i calcoli.
        */

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("**Menù**");
//             System.out.println("Seleziona 1 per Massimo Comune Divisore");
//             System.out.println("Seleziona 2 per Minimo Comune Multiplo");
//             System.out.println("Fai una scelta: ");
//             int n = in.nextInt();
//             Main.menu(n);
//         }
//     }
//     public static void menu(int n){
//         if(n == 1){
//             stampaMcD();
//         }
//         if(n == 2){
//             stampaMcM();
//         }
//     }

//     public static void stampaMcD(){
//         int primoNumero, secondoNumero;
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Massimo Comune Divisore");

//             System.out.println("Scegli il primo numero: ");
//             primoNumero = in.nextInt();
//             System.out.println("Scegli il secondo numero");
//             secondoNumero = in.nextInt();
//         }

//         System.out.println("mcd (" + primoNumero + ", " + secondoNumero + " ) = " + mcd(primoNumero, secondoNumero));
//     }

//     public static void stampaMcM(){
//         int primoNumero, secondoNumero;
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Minimo Comune Multiplo");

//             System.out.println("Scegli il primo numero: ");
//             primoNumero = in.nextInt();
//             System.out.println("Scegli il secondo numero");
//             secondoNumero = in.nextInt();
//         }

//         System.out.println("mcm (" + primoNumero + ", " + secondoNumero + " ) = " + mcm(primoNumero, secondoNumero));
//     }

//     public static int mcd(int primoNumero, int secondoNumero){
//         if(primoNumero == secondoNumero){
//             return primoNumero;
//         }else if (primoNumero> secondoNumero){
//             return mcd(primoNumero - secondoNumero, secondoNumero);
//         }else{
//             return mcd(secondoNumero, primoNumero);
//         }
//     }

//     public static int mcm(int primoNumero, int secondoNumero){
//         int r = 0 , i= 1;
//         r = primoNumero;
//         while(r % secondoNumero != 0 ){
//             r = primoNumero * i;
//             i++;
//         }
//         return r;
//     }
// }

/*ESERCIZIO 12: Creare una classe che legge un intero di 0 inserito da un utente e ci dice se è intero. Un numero per essere intero deve essere divisibile solo per se stesso o per 1.*/

// public class Main{
//     public static void main (String[]args){

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Scegli un numero intero per scoprire se è primo: ");
//             int m = in.nextInt();

//             if(numeroPrimo(m)){
//                 System.out.println("Il numero è primo");
//             }else{
//                 System.out.println("Il numero NON è primo");
//             }

//         }
//     }

//     public static boolean numeroPrimo(int n){

//         for (int i = 2; i < n; i++) {
//             if (n%i==0) {
//                 return false;
//             }
//         }
//         if(n<2){
//             return false;
//         }
//         if(n<=3){
//             return true;
//         }
//         if(n%2==0){
//             return false;
//         }
//         return true;
//     }
// }

/*ESERCIZIO 13: Verificare che se un numero è pari o dispari.*/

// public class Main{
//     public static void main(String[]args){
        
//             pariDispari();
//         }
//     public static boolean pariDispari(){

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Scegli un numero e ti dirò se pari o dispari: ");
//             int n = in.nextInt();

//             if(n%2==0){
//                 System.out.println("Il numero " + n + " è pari!!");
//                 return true;
//             }else{
//                 System.out.println("Il numero " + n + " è dispari!!");
//                 return false;
//             }
//         }
//     }

//     // public static boolean vuioContinuare(){
//     //     try (Scanner in = new Scanner(System.in)) {

//     //         int digita = 0;
//     //         System.out.println("Per terminare digita 0.");
//     //         digita = in.nextInt();

//     //         if(digita == 0){
//     //             return true;
//     //         }else{
//     //             return false;
//     //         }
//     //     }
//     // }
// }

/*ESERCIZIO 13: Stampare diversi tipi di triangoli DESTRO, SINISTRO E CENTRALE.*/

// public class Main{
//     public static void main(String[]args){
        
//         Scanner in = new Scanner(System.in);
//         Triangoli tr = new Triangoli();

//         System.out.println("Inserisci 1, 2, 3 (Triangolo destro, sinistro, centrale e 0 per uscire): ");
//         int n = in.nextInt();
//         tr.inserisci(n);
//     }
// }

/*ESERCIZIO 14: Scrivere un programma che legge in input 10 valori di tipo bouble , li memorizza in un array e li visualizza.*/

// public class Main{
//     public static void main(String[]args){
        
//         try (Scanner in = new Scanner(System.in)) {
//             double [] numeri = new double[10];

//             for (int i = 0; i < 10; i++) {
//                 System.out.println("Scegli " + i + " numeri: ");
//                 numeri[i] = in.nextDouble();
//             }
//             System.out.println("Risultato");
//             for (int i = 0; i < 10; i++) {
//                 System.out.println(numeri[i]);
//             }
//         }
//     }
// }

/*ESERCIZIO 14: Scrivere un programma che legga 10 int in input, li memorizzi in un array e li visualizzi aumentati di 1.*/

// public class Main{
//     public static void main(String[]args){

//         try (Scanner in = new Scanner(System.in)) {
//             int [] n = new int [10];

            // for (int i = 0; i < 10; i++) {
            //     System.out.print("Scegli " + i + " numeri: ");
            //         n[i] = in.nextInt();
            //     }
//                 System.out.print("Risultato: ");
//                     for (int i = 0; i < 10; i++) {
//                         System.out.print(" " + (n[i] + 1));
//                         }
//         }
//     }
// }

/*ESERCIZIO 15: Scrivere un programma che memorizzi in un array i valori inseriti sempre in modo opposto, quindi dall'ultimo inserito al primo.*/

// public class Main{
//     public static void main(String[]args){

//         try (Scanner in = new Scanner(System.in)) {

//             int [] valori = new int[5];
//             for (int i = 0; i < valori.length; i++) {
//                 System.out.print("Scegli " + i + " numeri: ");
//                     valori[i] = in.nextInt();
//             }

//             System.out.println("Array invertita: ");
//             for (int i = valori.length - 1; i >= 0; i--) {
//                 System.out.print(" " + valori[i]);
//             }
//         }
//     }
// }

/*ESERCIZIO 16: Scrivere un programma che verifica se due array contengono lo stesso valore nella stessa posizione.*/

// public class Main{
//     public static void main(String[]args){
//         int a[] = new int[5];
//         int b[] = new int[5];
        
//         for (int i = 0; i < a.length; i++) {
//             Scanner in = new Scanner(System.in);
//                 System.out.println("Scegli i numeri del primo array:");
//                     // System.out.print(i + " numero scelto: ");
//                     a[i]= in.nextInt();
//         }
        
//         for (int i = 0; i < b.length; i++) {
//             Scanner in = new Scanner(System.in);
//                 System.out.println("Scegli i numeri del secondo array:");
//                     // System.out.print(i + "numero scelto: ");
//                     b[i]= in.nextInt();
//         }
        
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < b.length; j++) {
//                 if(a[i] == b[j]){
//                     System.out.println(a[i]);
//                 }else{
//                     System.out.println(b[j]);
//                 }
//             }
//         }
        
//     }

        // boolean risultato = isEqual(primo, secondo);
        // if(risultato){
        //     System.out.println("Gli array sono uguali");
        // }else{
        //     System.out.println("Gli array sono diversi");
        // }
// }

    /*Array uguali*/
    // public static boolean isEqual(int [] primo, int [] secondo){

    //     if(primo == secondo){
    //         return true;
    //     }else if(primo == null || secondo == null){
    //         return false;
    //     }else if(primo.length != secondo.length){
    //         return false;
    //     }
    //     for (int i = 0; i < primo.length; i++) {
    //         if(primo[i] != secondo[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

/*ESERCIZIO 17: Scrivere un programma che azzera tutti gli elementi di una matrice di int bidimensionale di n * m posizioni, con n e m letti in input durante l'esecuzione. Fate visualizzare la matrice per controllare.*/

// public class Main{
//     public static void main (String[]args){

//         int [][] matrice = null;
//         int n, m, r, c;

//         Scanner in = new Scanner (System.in);
//         System.out.println("Inserisci n (numero di righe): ");
//         n = in.nextInt();
//         System.out.println("Inserisci m (numero di colonne): ");
//         m = in.nextInt();

//         /*ASSEGNAZIONE DI N E M ALLA MATRICE */
//         matrice = new int [n][m];
        
//         /*AZZERAMENTO*/
//         for (int i = 0; i < matrice.length; i++) {
//             for (int j = 0; j < matrice[i].length; j++) {
//                 matrice[i][j] = 0;
//             }
//         }

//         /*ASSEGNAZIONE ALLE RIGHE*/
//         System.out.println("Inserisci r (righe): ");
//         r = in.nextInt();
//         for (int i = 0; i < matrice[r].length; i++) {
//             matrice [r][i] = 1;
//         }

//         /*ASSEGNAZIONE ALLE COLONNE*/
//         System.out.println("Inserisci c (colonne): ");
//         c = in.nextInt();
//         for (int i = 0; i < matrice.length; i++) {
//             matrice [i][c] = 2;
//         }

//         /*VISUALIZIAMO*/

//         for (int i = 0; i < matrice.length; i++) {
//             for (int j = 0; j < matrice[i].length; j++) {
//                 System.out.print( matrice [i][j] + "\t" );
//             }
//             System.out.println();
//         }
//     }
// }

/*ESERCIZIO 18: Scrivere un programmache la matricesia quadrata (n * n). Scrivere le istruzioni per assegnare 1 alla diagonale principale, ovvero quella che va dall'angolo in alto a sinistra all'angolo in basso a destra. Usare il ciclo e visualizzare la matrice per controllare.*/

// public class Main{
//     public static void main(String[]args){

//         int [][] matrice = null;
//         int n;

//         Scanner in = new Scanner(System.in);
//         System.out.println("Inserisci n (numero righe e colonne): ");
//         n = in.nextInt();

//         matrice = new int [n][n];

//         /*ASSEGNAZIONE DI 1 ALLA DIAGONALE PRINCIPALE*/

//         for (int i = 0; i < matrice.length; i++) {
//             matrice [i][i] = 1;
//         }

//         /*VISUALIZZIAMO*/

//         for (int i = 0; i < matrice.length; i++) {
//             for (int j = 0; j < matrice.length; j++) {
//                 System.out.print(matrice [i][j] + "\t");
//             }
//             System.out.println();

//         }
//     }
// }

/*ESERCIZIO 19: Scrivere un programma che memorizzi n numeri in input durante l'esecuzione in un array e li visualizza in ordine crescente con la selection SORT.*/

// public class Main{
//     public static void main(String[]args){

//         System.out.println("Inserisci i valori: ");
//         try (Scanner in = new Scanner(System.in)) {
//             int [] valori = new int[5];
//             for (int i = 0; i < valori.length; i++) {
//                 System.out.println("Valore " + i + " : ");
//                 valori[i]=in.nextInt();
//             }
//             System.out.println("I valori dell'Array originale che hai inserito sono: " + Arrays.toString(valori));
//             Arrays.sort(valori);
//             System.out.println("Array con valori in ordine crescente: " + Arrays.toString(valori));
//             // for (int i = valori.length - 1; i >= 0 ; i--) {
//             //     System.out.print(valori[i] + " ");
//         }
//     }
// }

/*ESERCIZIO 20: Stampare il numero delle righe, la lunghezza della prima riga e il quarto elemento della terza riga di una tavola pitagorica di dimensioni 3x4.*/

// public class Main{
//     public static void main(String[]args){

        /*PRIMO METODO*/
        // int tavPitagorica [] [] = {
        //     {1*1, 1*2, 1*3, 1*4},
        //     {2*1, 2*2, 2*3, 2*4},
        //     {3*1, 3*2, 3*3, 3*4},
        // };

        /*SECONDO METODO CON IL CICLO FOR*/
//         int row= 3;
//         int col= 4;
//         int [][] tavPitagorica = new int[row][col];

//         for (int i = 0; i < tavPitagorica.length; i++) {
//             for (int j = 0; j < tavPitagorica[i].length; j++) {
//                 tavPitagorica[i][j] = (i+1) * (j+1);
//             }
//         }

//         System.out.println("Numero righe: " + tavPitagorica.length);
//         System.out.println("Lunghezza prima riga: " + tavPitagorica[0].length);
//         System.out.println("Quarto elemento della terza riga: " + tavPitagorica[2][3]);
//     }
// }

/*ESERCIZIO 21: Scrivere un programma che calcola il fattoriale*/

// public class Main{
//     public static void main(String[]args){

//         CalcoFattoriale calcoFattoriale = new CalcoFattoriale();

//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Inserisci un numero intero positivo: ");
//             int n = in.nextInt();

//             System.out.println("Il fattoriale di " + n + " è: " + calcoFattoriale.fattoriale(n));
//         }
//     }
// }

/*ESERCIZIO 22: Definire a classe Portafogli con  metodi:
 * 1 - aggiungiEuro, per aggiungere un certo numero di euro al portafogli.
 * 2 - aggiungiLire, per aggiungere un certo numero di Lire al portafogli.
 * 3 - togliEuro, per togliere un certo numero di Euro dal portafogli.
 * 4 - togliLire, per togliere un certo numero di Lire dal portafogli.
 * 5 - quantiSoldi per sapere quanti soldi si hanno nel portafogli.
*/

public class Main{
    public static void main(String[]args){
        try (Scanner in = new Scanner (System.in)) {
            Portafoglio p1 = new Portafoglio(0, 0);
            Portafoglio p2 = new Portafoglio(0, 0);
            List<Portafoglio>lista = new ArrayList<>();

            System.out.println("Quante volte vorresti ripetere l' operazione da svolgere? ");
            int n = in.nextInt();

            System.out.println("Portafoglio 1: ");
            p1.menu(n);
            System.out.println("Portafoglio 2: ");
            p2.menu(n);

            lista.add(p1);
            lista.add(p2);
            
            for (int i = 0; i < lista.size(); i++) {
                lista.get(i).setConteggio(i);
                System.out.println("Portafogli n° " + lista.get(i).getConteggio() + " Totale: " + lista.get(i).quantiSoldi());
            }
        }
    }
}