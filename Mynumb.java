public class MyNumb{
    public static void main(String[] args) {
        
        double num = 56.764;
         
        double numRound = Math.round(num);
         System.out.println("Original number: " + num);
        double numFloor = num;
        System.out.println("Floor value: " + (int)numFloor);
     
         
        num = num +1;
        double numCeil =num;
        System.out.println("Ceil value: " +(int)numCeil);
        
    }
}
