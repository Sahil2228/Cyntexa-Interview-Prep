import java.util.Scanner;
class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a;
        if(largest < b){
            largest = b;
        }
        if(largest < c){
            largest = c;
        }
        System.out.println(largest);
        
        
        sc.close();
    }
}