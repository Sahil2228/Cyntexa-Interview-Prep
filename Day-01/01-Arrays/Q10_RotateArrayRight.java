import java.util.Scanner;
class shiftright{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Array should have atleast one element.");
            sc.close();
            return;
        }
        int [] arr = new int [n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}