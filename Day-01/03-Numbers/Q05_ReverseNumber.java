import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();
        if(n < 0 ){
            System.out.println("Negative numbers are noyt supported.");
            sc.close();
            return;
        }
        
        int temp = n;
        int reverse = 0;

        while( temp > 0){
            int digit = temp % 10; 
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println(reverse);
       
        sc.close();
    }
}