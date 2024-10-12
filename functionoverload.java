package hallowapp;

public class functionoverload {
    int Sum (int n1, int n2){//to create the function before main function
        return (n1+n2);
    }
    int Sum (int n1, int n2, int n3){//to create the function before main function
        return (n1+n2+n3);
    }
    public static void main(String[] args) {
        int r2 =new functionoverload().Sum(4,8);
        int r3 =new functionoverload().Sum(4,8,17);
        System.out.println(r2);
        System.out.println(r3);
    }
}
