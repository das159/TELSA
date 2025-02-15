import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,count=0;
        System.out.println("Enter any number:");
        number= input.nextInt();

        if(number<=1){
            System.out.println("Not defined by mathmatician");
            count=1;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println("That is not prime number");
                count=1;
                break;
            }
        }
            if(count==0){
                System.out.println("That is a prime number");
            }


    }
}
