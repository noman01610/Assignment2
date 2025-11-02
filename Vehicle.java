public class Vehicle
{
    private String companyName;    
    private String modelNo;        
    private int year;

   
    public Vehicle(String companyName, String modelNo, int year) {
        this.companyName = companyName;
        this.modelNo = modelNo;
        this.year = year;
    }
    
    public String getCompanyName() 
    { 
        return companyName;
    }
    
    public void setCompanyName(String companyName) 
    { 
        this.companyName = companyName;
    }
    
    public String getModelNo() 
    { 
        return modelNo;
    }
    
    public void setModelNo(String modelNo)
    { 
        this.modelNo = modelNo;
    }
    
    public int getYear()
    {
        return year; 
    }
    
    public void setYear(int year)
    { 
        this.year = year; 
    }



    public static void main(String[] args) 
    {
       
        Vehicle v1 = new Vehicle("Bajaj", "Pulsar", 2019);

        System.out.println
        (
            "Company Name: " + v1.getCompanyName() + 
            "\nModel Name: " + v1.getModelNo() +
            "\nYear: " + v1.getYear()
        );

        v1.setCompanyName("Bajaj Auto");
        v1.setModelNo("Pulsar 150");
        v1.setYear(2020);

        System.out.println
        (
            """
            
             After Update
            Company Name: """ + v1.getCompanyName() + 
            "\nModel Name: " + v1.getModelNo() +
            "\nYear: " + v1.getYear() 
        );
    }
}