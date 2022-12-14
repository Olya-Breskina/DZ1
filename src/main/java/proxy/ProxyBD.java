package proxy;

public class ProxyBD implements BD{
    private String nameBD;
    private RealBD realBD;

    public ProxyBD(String nameBD) {
        this.nameBD = nameBD;
    }
    @Override
    public void connectionToBD() {
        System.out.println("localhost:port/"+nameBD);
    }
}

