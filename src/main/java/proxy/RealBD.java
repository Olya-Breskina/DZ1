package proxy;

public class RealBD implements BD{
    private String url;

    public RealBD(String url) {
        this.url = url;
        load();
    }
    public void load(){
        System.out.println("подключиться к базе данных по "+url);
    }

    @Override
    public void connectionToBD() {
        System.out.println("подключена база данных");
    }
}
