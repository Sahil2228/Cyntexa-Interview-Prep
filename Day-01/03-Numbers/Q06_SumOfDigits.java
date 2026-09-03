import java.util.Scanner;
class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
         int temp = n;
         int sum = 0;

         while(temp > 0){
            int digit = temp % 10; 
            sum += digit;
            temp /= 10; 
         }

         System.out.println(sum);
        
        sc.close();
    }
}