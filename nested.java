package hallowapp;

public class nested {
    static void DrawLine(){
        for (int i = 1; i < 6; i++) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
        }
    }
    public static void main(String[] args) {
        DrawLine();
        DrawLine();

        //while
        int t=1;
        while((t>=1)&&(t<=5))
        {
            System.out.println(t);
            t++;
        }
        DrawLine();
        DrawLine();

        //do while
        int d=0;
        do{
            System.out.println(d);
            d++;
        }while (d<10);
    }
}