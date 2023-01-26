import java.util.Scanner;

public class Portafoglio {
    private double sommaTotale;
    private int conteggio;

    public Portafoglio(double sommaTotale, int conteggio){
        this.sommaTotale = sommaTotale;
        this.conteggio = conteggio;
    }

    public Portafoglio(){
    }
    /*getters e setters */
    public double getSommaTotale(){
        return sommaTotale;
    }
    public void setSommaTotale(double sommaTotale){
        this.sommaTotale=sommaTotale;
    }
    public int getConteggio(){
        return conteggio;
    }
    public void setConteggio(int conteggio){
        this.conteggio=conteggio;
    }

    /*Aggiungere Euro */
    public void aggiungiEuro(double e){
        sommaTotale += e;
    }
    /*Aggiungi Lire */
    public void aggiungiLire(double l){
        sommaTotale += (l / 1936.27);
    }
    /*Togli Euro */
    public void togliEuro(double e){
        if(e > sommaTotale){
            System.out.println("Valore maggiore della somma totale!");
        }else{
            sommaTotale -= e;
        }
    }
    /*Togli Lire */
    public void togliLire(double l){
        if(l > sommaTotale){
            System.out.println("Valore maggiore della somma totale!");
        }else{
            sommaTotale -= (l / 1936.27);
        }
    }
    /*Soldi totali */
    public double quantiSoldi(){
        return this.getSommaTotale();
    }
    /*Creazione menù per richiamare metodo*/
    public void menu(int n){
        try (Scanner in = new Scanner(System.in)) {
            double e = 0, l = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Quanti Euro vuoi aggiungere al tuo portafogli? ");
                e = in.nextDouble();
                aggiungiEuro(e);

                System.out.println("Quante Lire vuoi aggiungere al tuo portafogli? ");
                l = in.nextDouble();
                aggiungiLire(l);

                System.out.println("Quanti Euro vuoi togliere dal tuo portafogli? ");
                e = in.nextDouble();
                togliEuro(e);

                System.out.println("Quante Lire vuoi togliere dal tuo portafogli? ");
                l = in.nextDouble();
                togliLire(l);
            }
        }
    }
}
