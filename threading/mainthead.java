package hallowapp.threading;

public class mainthead {
    public static void main(String[] args) {
        mythreadsynchronized t =new mythreadsynchronized();
        t.start();
        mythreadsynchronized t2 =new mythreadsynchronized();
        t2.start();
        mythreadsynchronized t3 =new mythreadsynchronized();
        t3.start();
    }

    }
