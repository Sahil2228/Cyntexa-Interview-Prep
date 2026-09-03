import java.util.Scanner;
class Maxnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Enter atleast one element in the array.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        
        for(int i= 1; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max + " is the largest number.");

        sc.close();
    }
}