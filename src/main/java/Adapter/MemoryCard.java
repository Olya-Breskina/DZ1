package Adapter;

public class MemoryCard implements USBAdapter{
    @Override
    public void read() {
        System.out.println("чтение через usb-адаптер");
    }
}
