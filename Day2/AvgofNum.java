import java.util.Scanner;

public class AvgofNum {
    public static double Average (double x, double y, double z){
        return (x + y + z) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x= sc.nextDouble();
        System.out.print("Enter the second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double z = sc.nextDouble();
        System.out.print(Average(x, y, z)); 

        
    }
    
}
