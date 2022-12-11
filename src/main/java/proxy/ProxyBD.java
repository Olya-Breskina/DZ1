package proxy;

public class ProxyBD implements BD{
    private String url;
    private RealBD realBD;

    public ProxyBD(String url) {
        this.url = url;
    }

    @Override
    public void connectionToBD() {

    }
}
