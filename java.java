import java.util.Scanner;
public class java{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int num1;
        System.out.println("Enter the value of first number:");
        num1 = input.nextInt();
        
        int num2, sum;
        System.out.println("Enter the value of Second number:");
        num2 = input.nextInt();

        sum = num1+num2;
        System.out.println("The sum is:" + sum); 

    }
    
}
