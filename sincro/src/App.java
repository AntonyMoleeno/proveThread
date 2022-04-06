public class App {
    public static void main(String[] args) throws Exception {
        
        
        Salvadanaio s1 = new Salvadanaio();


    

        Azione inserisciMonete = new Azione(s1 , true);
        inserisciMonete.start();
        
        Azione prelevaMonete = new Azione(s1, false);
        prelevaMonete.start();
        
        inserisciMonete.join();
        prelevaMonete.join();
        
        
        System.out.println(s1.getMonete());

        
    }
}
