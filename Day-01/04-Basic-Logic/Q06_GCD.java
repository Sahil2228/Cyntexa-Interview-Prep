import java.util.Scanner;
class Gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if( a==0 && b ==0){
            System.out.println("GCD is undefiend for 0 and 0.");
            sc.close();
            return;
        }
        
        while(b !=0){
            int rem = a % b;
            a = b; 
            b = rem;
        }
        System.out.println(a+ " ");
       
        sc.close();
    }
}