package hallowapp;

public class polmorphism {
    void display (int n1){
        System.out.println("integer:"+n1);
    }
    void display (float n1){

        System.out.println("float:"+n1);
    }
//the same name of method but different type of parameters
    public static void main(String[] args) {
        new polmorphism().display(4);

        new polmorphism().display(5.6f);
    }
    }
