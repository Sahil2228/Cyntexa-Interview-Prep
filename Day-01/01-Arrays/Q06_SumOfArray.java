import java.util.Scanner;

class Sumofarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Array should have atleast one element.");
            sc.close();
            return;
        }
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum + " is the sum of array.");
    
        sc.close();
    }
}