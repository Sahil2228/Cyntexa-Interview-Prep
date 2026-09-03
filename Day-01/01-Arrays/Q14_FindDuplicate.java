import java.util.Scanner;
import java.util.HashSet;
class FindDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Array should have atleast one element");
            sc.close();
            return;
        }

        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                System.out.println("duplicate no. " + arr[i]);
                found = true;
                break; // only gives you the first duplicate....if you want all then remove that. 
            }
            set.add(arr[i]);
        }
        
        if(!found){
            System.out.print("No duplicate element.");
        }
        sc.close();

    }
}