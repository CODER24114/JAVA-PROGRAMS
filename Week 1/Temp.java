public class Temp{
    public static void main(String[] args) {
     System.out.printf("%-15s%-15s%n", "Fahrenheit","Celsius");
        System.out.println("------------------------------");
        
        for (int i = 10; i<=100; i=i+10) {
            double fahrenheit=i;
           
            double celsius = (fahrenheit - 32) / 1.8;
            
            System.out.printf("%-15d%-15.3f%n",(int)fahrenheit, celsius);
        }
    }
}