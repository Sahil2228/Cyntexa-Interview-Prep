import java.util.Scanner;
class equilibrium_index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if(n <=0){
            System.out.println("array should have atleast one number.");
            sc.close();
            return;
        }

        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long totalsum = 0;
        for(int i=0;i<n; i++){
            totalsum += arr[i];
        }

        long leftsum = 0;
        boolean found = false;

        for(int i=0; i<n; i++){
            long rightsum = totalsum - leftsum - arr[i];
            if(rightsum == leftsum){
                System.out.println("Equilibrium at index: "+ i);
                found = true; 
                break;
            }
            leftsum += arr[i];

        }
        if(!found){
            System.out.println("no equilibrium index found.");
        }   
        sc.close();

    }
}