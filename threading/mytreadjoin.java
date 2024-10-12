package hallowapp.threading;

public class mytreadjoin extends Thread {
    int total;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                total += i;
            }notify();
        } catch (Exception e) {
        }
        ;

    }
}