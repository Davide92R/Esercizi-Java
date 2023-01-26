import java.util.Scanner;

public class Triangoli {
    public void inserisci(int n){

        if(n==1){
            triangoloDestro();
        }
        if(n==2){
            triangoloSinistro();
        }
        if(n==3){
            triangoloCentrale();
        }
        if(n==0){
            System.exit(0);
        }
    }

    public void triangoloDestro(){
        System.out.println("Triangolo Destro");
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Inserisci il numero per le righe: ");
            int r = in.nextInt();

            for (int i = 1; i <= r; i++) {
                for (int j = 1; j >= i; j--) {
                    System.out.println(" ");
                }
                System.out.println("*");
            }
        }
    }
    public void triangoloSinistro(){
        System.out.println("Triangolo Sinistro");
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Inserisci il numero per le righe: ");
            int r = in.nextInt();

            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
    public void triangoloCentrale(){
        System.out.println("Triangolo Centrale");
                try (Scanner in = new Scanner(System.in)) {
                    System.out.println("Inserisci il numero per le righe: ");
                    int r = in.nextInt();
                    for (int i = 1; i <= r; i++) {
                        for (int j = r; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
        }
}
