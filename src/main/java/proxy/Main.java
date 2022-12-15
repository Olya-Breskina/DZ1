package proxy;

public class Main {
    public static void main(String[] arg){
        ProxyDB proxyDB=new ProxyDB("qwerty");
        proxyDB.connectionToDB("qwerty");
    }
}
