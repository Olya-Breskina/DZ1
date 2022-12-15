package adapter;
public class USB implements ComputerInterface{
    @Override
    public void read() {
        System.out.println("чтение через usb");
    }
}
