package hallowapp.threading;

public class mythread extends Thread{
    @Override
    public void run() {
        int x=0;
        while (true){
            System.out.println(x);
            x++;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
