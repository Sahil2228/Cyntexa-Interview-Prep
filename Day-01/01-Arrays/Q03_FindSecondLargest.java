import java.util.Scanner;
class Secondlargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:"); 
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("there should be atleast two numbers in the array.");
            sc.close();
            return;
        }

        int [] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for(int i =1; i < n ; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }

        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("There are no distinct values of second largest element.");
        } else {
            System.out.println(secondlargest + " is the second largest element.");
        }     
        
        sc.close();
    }
}