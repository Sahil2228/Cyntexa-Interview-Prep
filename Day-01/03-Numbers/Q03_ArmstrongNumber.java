import java.util.Scanner;
class armstrongnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int org = n;

        //count the number of digits.
        int digits = 0;
        int temp = n; 

        if(temp == 0){
            digits = 1;
        } else {
            while(temp > 0){
                digits++;
                temp /= 10;
            }
        }


        //calculating the armstrong. 
        long sum = 0;
        temp = n;
         while ( temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit,digits);
            temp /= 10;
         }

         if(n == 0){
            sum =0;
         }

         if(sum == org){
            System.out.println("Number is armstrong number.");
         } else{
            System.out.println("Number is not a armstrong number.");
         }
        
        sc.close();
    }
}