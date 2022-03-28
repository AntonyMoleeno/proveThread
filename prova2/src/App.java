public class App {
    public static void main(String[] args) throws Exception {
        Thread thr1 = new ContaINani2("topolino");
        Thread thr2 = new ContaINani2("minni");
        thr1.start();
        thr2.start();
    
    }
}
