import java.util.Scanner;
class Reversenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Array must contain atleast one element.");
            sc.close();
            return;
        }
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        System.out.println("The reverse array is:");
        for(int i=0; i< n; i++){
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}