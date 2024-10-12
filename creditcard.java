package hallowapp;

public abstract class creditcard {
    String cardID;
    String DataExp;
    String code;
    public String printing() {
        return (cardID+" "+ DataExp+" "+code);
    }
}
