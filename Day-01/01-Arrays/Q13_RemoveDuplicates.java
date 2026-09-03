import java.util.Scanner;
import java.util.HashSet;
class removeduplicate{
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

        //hashset for unique values.
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        
        for(int value : set){
            System.out.print(value+ " ");
        }
        
        
        sc.close();

    }
}