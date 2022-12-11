package Adapter;

public class USBAdapterClass implements ComputerInterface{
    private MemoryCard memoryCard;
    public USBAdapterClass(MemoryCard memoryCard){
        this.memoryCard=memoryCard;
    }
    @Override
    public void read() {
        memoryCard.read();
    }
}
