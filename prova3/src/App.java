public class App {
    public static void main(String[] args) throws Exception {
        for(int i=0; i < 5; i++){
        Runnable cam1 = new Campana("din ", 1);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread.sleep(0);

        Thread thr2 = new Thread(new Campana("don", 1));
        thr2.start();
        Thread.sleep(1);

        Thread thr3 = new Thread(new Campana("dan", 1));
        thr3.start();
        Thread.sleep(2);
    }}
}
