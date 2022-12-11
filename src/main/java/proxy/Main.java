package proxy;

public class Main {
    public static void main(String[] arg){
        BD bd=new RealBD("https://github.com/Olya-Breskina?tab=repositories");
        bd.connectionToBD();
    }
}
