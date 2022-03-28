public class Campana implements Runnable{

    String suono;
    int volte;
    public Campana(String suono , int valore){

        this.suono = suono;
        this.volte = valore;

    }

    public void run(){

        for(int i = 0; i < volte; i++){

            System.out.print((i  + 1 ) + suono + "  ");

        }
    }
}