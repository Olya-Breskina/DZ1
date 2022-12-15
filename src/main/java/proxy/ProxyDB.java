package proxy;

public class ProxyDB {
   private String nameDB1;
    private RealDB realDB = new RealDB();

    public ProxyDB(String nameDB1) {
        this.nameDB1 = nameDB1;
    }

    public void connectionToDB(String DBname) {
        System.out.println("подключаюсь к " + DBname);
        realDB.connectionToDB("localhost:port/" + DBname);

    }
}

