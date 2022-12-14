package proxy;

public class Main {
    public static void main(String[] arg){
        BD bd=new ProxyBD("qqq");
        bd.connectionToBD();
    }
}
