import java.util.Scanner;
class Min_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Enter atleast one number.");
            sc.close();
            return;
        }
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < n ; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(min + " is the minimum number from the array.");

        sc.close();
    }
}