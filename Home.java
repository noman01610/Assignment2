public class Home 
{
    private String address;
    private int numberOfRooms;
    private double area;
    
    public Home(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }
    
    public String getAddress() { 
        return address; 
    }
    
    public void setAddress(String address) { 
        this.address = address; 
    }
    
    public int getNumberOfRooms() { 
        return numberOfRooms; 
    }
    
    public void setNumberOfRooms(int numberOfRooms) { 
        this.numberOfRooms = numberOfRooms; 
    }
    
    public double getArea() { 
        return area; 
    }
    
    public void setArea(double area) { 
        this.area = area; 
    }
    
    public double calculatePrice(double pricePerSqMeter) {
        return area * pricePerSqMeter;     
    }

 
    public static void main(String[] args) 
{
        Home h1 = new Home("123 Maple Street", 4, 150.5);
        
        System.out.println("Address: " + h1.getAddress());
        System.out.println("Rooms: " + h1.getNumberOfRooms());
        System.out.println("Area: " + h1.getArea() + " sq.m");
        
        double price = h1.calculatePrice(1200);
        System.out.println("Price: $" + price);
    }
}