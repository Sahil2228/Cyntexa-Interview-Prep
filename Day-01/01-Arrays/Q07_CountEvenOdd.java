import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Array must have atleast one number.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int even= 0;
        int odd = 0;
        for(int i=0; i<n; i++){
        if(arr[i] % 2 == 0){
            even ++;
        } else{
            odd++;
        }
        }
        System.out.println("even number: "+ even );
        System.out.println("odd number: "+ odd);
        
        sc.close();
    }
}