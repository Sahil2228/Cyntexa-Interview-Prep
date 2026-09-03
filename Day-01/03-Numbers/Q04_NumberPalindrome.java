import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n ;
        int reverse = 0;

        while(temp >0){
            int digit = temp % 10; 
            reverse = reverse * 10 + digit; 
            temp /= 10;
        }

        if(n == reverse){
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
  
        sc.close();
    }
}