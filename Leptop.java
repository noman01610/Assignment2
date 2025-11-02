
public class Leptop
{
    private String brand;
    private String processor;
    private int ramSize;
    
    public Leptop(String brand, String processor, int ramSize) 
    {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand) 
    { 
        this.brand = brand;
    }
    public String getProcessor() 
    { 
        return processor;
    }
    public void setProcessor(String processor) 
    { 
        this.processor = processor; 
    }
    public int getRamSize()
    { 
        return ramSize;
    }
    public void setRamSize(int ramSize)
    {
        this.ramSize = ramSize;
    }
    public void upgradeRam(int extraRam)
    {
        ramSize += extraRam;
        System.out.println("RAM upgraded by " + extraRam + "GB.");
        System.out.println("New RAM Size: " + ramSize + "GB");
    }

  public static void main(String[] args) 
    {
        Leptop pc = new Leptop("Dell", "Intel Core i7", 8);

        System.out.println(
            "Brand: " + pc.getBrand() +
            "\nProcessor: " + pc.getProcessor() +
            "\nRAM Size: " + pc.getRamSize() + "GB"
        );
        pc.upgradeRam(8); 
    }
}
