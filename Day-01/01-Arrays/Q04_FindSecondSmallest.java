import java.util.Scanner;
class Secondsmallest{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("Array should have atleast two numbers.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        for(int i=0; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        int Smallest = arr[0];
        int Secondsmallest = Integer.MAX_VALUE;
        for(int i=1; i < n; i++){
            if(arr[i] < Smallest){
                Secondsmallest = Smallest;
                Smallest = arr[i];
            } else if(arr[i]< Secondsmallest && arr[i] != Smallest){
                Secondsmallest = arr[i];
            }
        }
        if(Secondsmallest == Integer.MAX_VALUE){
            System.out.println("No second smallest distinct number exists.");
        } else {
            System.out.println( Secondsmallest + " is the second smallest number.");
        }
        
        sc.close();
    }
}