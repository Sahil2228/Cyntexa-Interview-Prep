import java.util.Scanner;
class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Enter first number:");
      int a = sc.nextInt();
      System.out.println("Enter second number:");
        int b = sc.nextInt();

        a= Math.abs(a);
        int p =a;
        b = Math.abs(b);
        int q = b;

        if( a==0 && b ==0){
            System.out.println("Lcm=0");
        }

        while(b !=0){
            int rem = a % b;
            a = b; 
            b = rem;
        }

        int gcd = a;
        int lcm = (p / gcd) * q;

        System.out.println(lcm);


        sc.close();
    }
}