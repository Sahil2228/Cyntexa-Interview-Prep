import java.util.Scanner;
class leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a year:");
        int n = sc.nextInt();

        if(n <=0){
            System.out.println("Enter a valid year.");
            sc.close();
            return;
        }

        if(n % 400 ==0 || (n % 4 ==0 && n % 100 != 0)){
            System.out.println("It is a leap year.");
        } else{
            System.out.println("Not a leap year.");
        }

        sc.close();
    }
}