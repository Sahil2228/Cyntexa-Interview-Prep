import java.util.Scanner;
public class Q01_PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n <=1){
            System.out.println("Not a prime.");
            sc.close();
            return;
        }

        boolean isprime = true;

        for(int i=2; i*i <=n; i++){
            if( n % i == 0 ){
                isprime = false; 
                System.out.println("not a prime number.");
                break;
            }
        }
       if(isprime){
        System.out.println("number is a prime number.");
       }
      
        sc.close();
    }
}