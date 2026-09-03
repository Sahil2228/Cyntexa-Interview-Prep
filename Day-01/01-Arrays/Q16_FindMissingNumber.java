import java.util.Scanner;
class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter "+ (n-1) +" numbers:");
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        long ExpectedValue = (long) n *( n+1 )/2;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        long Missing_value = ExpectedValue - sum;

        System.out.println(Missing_value);
        
        
        
        sc.close();
    }
}