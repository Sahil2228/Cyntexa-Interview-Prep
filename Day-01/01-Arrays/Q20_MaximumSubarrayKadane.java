import java.util.Scanner;
class maxsubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Array should have atleast one element.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long currentsum = arr[0];
        long maxsum = arr[0];

        for(int i=0;i<n; i++){
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(maxsum, currentsum);
        }

        System.out.println("maximum substring sum is: " + maxsum);
    
        sc.close();

    }
}