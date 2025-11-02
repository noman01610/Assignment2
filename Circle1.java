
class Circle1
{
    private double radius;

    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius() 
    {
        return radius;
    }
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

  public static void main(String[] args)
    {
        Circle1 c1 = new Circle1();

        c1.setRadius(2);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Perimeter: " + c1.calculatePerimeter());
    }
}
