public class CalcoFattoriale {
    public int fattoriale(int n){
        int ris = 1;
        for (int i = 1; i <= n; i= i+1) {
            ris = ris * i;
        }
        return ris;
    }
}
