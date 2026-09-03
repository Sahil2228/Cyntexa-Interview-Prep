import java.util.Scanner;
class movezero{
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

        //add non zero numbers to the start.
        int position = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[position] = arr[i];
                position ++;
            }
        }

        //add zeros at the end.
        while(position < n){
            arr[position] = 0;
            position ++;
        }

        System.out.println("after shifting all zeros to the end the number is:");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
                
        sc.close();
    }
}