import java.util.Scanner;
class smallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int smallest = a;
        if(smallest > b){
            smallest = b;
        }
        if(smallest > c){
            smallest = c;
        }
        System.out.println(smallest);
        
        
        sc.close();
    }
}