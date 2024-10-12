package hallowapp.threading;

public class mytreadjoin_main {
    public static void main(String[] arga) {
        mytreadjoin b = new mytreadjoin();
        synchronized (b) {
            b.start();
            try {
                b.wait();
                //b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(b.total);
        }
    }
}
