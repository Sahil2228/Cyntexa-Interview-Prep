import java.util.Scanner;
class printprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        if(n <2){
            System.out.println("Not a prime.");
            sc.close();
            return;
        }

        for(int i=2; i<= n; i++){

            boolean isprime = true; 

            for(int j = 2; j*j <= i; j++){
                if(i % j ==0){
                    isprime = false; 
                    break; 
                }
            }

            if(isprime){
                System.out.println(i + " is a prime number.");
            }
        }
        sc.close();
    }
}