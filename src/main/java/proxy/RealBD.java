package proxy;

public class RealBD implements BD {
    private String nameBD;
    public RealBD(String nameBD){
        this.nameBD=nameBD;
    }
    @Override
    public void connectionToBD() {
        System.out.println("подключено на прямую к " + nameBD);
    }
}
