public class containani  extends Thread{
    
    public  void run(){
        this.setName("settenani");
        System.out.println(Thread.currentThread().getName());
        for(int i = 0 ; i < 7; i++ ){

            System.out.print((i + 1) + " ");
        }
    }
}
