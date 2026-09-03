import java.util.Scanner;
class countDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        n = Math.abs(n); // considers neg has pos.
         int count =0; 
         if( n == 0){
            count = 1;
         }

         while( n > 0){
            n /= 10;
            count ++;
         }
        
        System.out.print(count);
        
        
        sc.close();
    }
}