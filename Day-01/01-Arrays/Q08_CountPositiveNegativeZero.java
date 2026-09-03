import java.util.Scanner;
class posnegzero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("array should have atleast a single element.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0; 
        int neg = 0;
        int zero = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                pos++;
            } else if( arr[i] < 0){
                neg++;
            } else{
                zero++;
            }
        }
        System.out.println("positive number are: " + pos +" negative numbers are: "+ neg+ " and zero's are: "+ zero);
        
        sc.close();
    }
}