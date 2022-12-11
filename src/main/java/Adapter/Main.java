package Adapter;

public class Main {
    public static void main(String[] arg){
        USB usb=new USB();
        Computer computer=new Computer();
        computer.connect(usb);

        MemoryCard memoryCard=new MemoryCard();
        USBAdapterClass usbAdapterClass=new USBAdapterClass(memoryCard);
        Computer computer2=new Computer();
        computer2.connect(usbAdapterClass);





    }
}
