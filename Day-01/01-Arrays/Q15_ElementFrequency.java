import java.util.Scanner;
import java.util.HashMap;
class getfrequency{
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

        HashMap<Integer, Integer> frequence = new HashMap<>();

        for(int i=0; i<n; i++){

            if(frequence.containsKey(arr[i])){
                frequence.put(arr[i],frequence.get(arr[i])+1);
            } else {
                frequence.put(arr[i], 1);
            }
        }

        for(int key: frequence.keySet()){
            System.out.println(key +" = "+ frequence.get(key));
        }

        sc.close();
    }
}