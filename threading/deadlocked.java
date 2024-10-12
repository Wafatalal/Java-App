package hallowapp.threading;

public class deadlocked {
    public static void main(String[] args) {
        final String passenger1="pick passenger1";
        final String passenger2="pick passenger2";
        Thread t1= new Thread(){
            public void run(){
                synchronized (passenger1){
                    System.out.println("Thread1: locked passenger1");
                    try { Thread.sleep(100); }
                    catch (Exception e){}
                    System.out.println("Thread1: waiting to get passenger1");
                    synchronized (passenger2){
                        System.out.println("Thread1: get locked passenger1");
                    }
                }
            }
        };
        Thread t2= new Thread(){
            public void run(){
                synchronized (passenger2){
                    System.out.println("Thread2: locked passenger1");
                    try { Thread.sleep(100); }
                    catch (Exception e){}
                    System.out.println("Thread2: waiting to get passenger1");
                    synchronized (passenger1){
                        System.out.println("Thread2: get locked passenger1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
    }
