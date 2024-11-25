import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user choice \n 1. To convert from INR to USD \n 2. To Convert USD to INR \n -999 to quit");
        int choice = sc.nextInt();

        while (choice != -999){
            if(choice == 1){
                System.out.println("Enter the INR value(in Rupees): ");
                double inrValue = sc.nextDouble();
                System.out.printf("The value in USD is: $%.2f", 0.012 * inrValue);
            } else{
                System.out.println("Enter the USD value: ");
                double usdValue = sc.nextDouble();
                System.out.printf("The value in INR is: Rs. %.2f",  usdValue/0.012);
            }

            System.out.println();
            System.out.println("Enter the user choice \n 1. To convert from INR to USD \n 2. To Convert USD to INR \n -999 to quit");
            choice = sc.nextInt();

        }
    }
}