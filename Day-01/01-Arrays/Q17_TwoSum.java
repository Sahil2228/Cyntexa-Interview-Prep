import java.util.Scanner;
import java.util.HashMap;

class Two_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;
        for(int i=0; i<n; i++){

            int compliment = target - arr[i];

            if(map.containsKey(compliment)){
                System.out.println("Pairs are "+ compliment + " + "+ arr[i]+ " = "+ target);
                found = true;
                break;
            }
            map.put(arr[i], i);
        }

        if(!found){
            System.out.println("no pair found found.");
        }
        sc.close();
    }
}