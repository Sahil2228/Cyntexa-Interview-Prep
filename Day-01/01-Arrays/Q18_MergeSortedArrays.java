import java.util.Scanner;
class sortedarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array1 size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the array2 size:");
        int m = sc.nextInt();
        int [] arr2 = new int[m];
        System.out.println("Enter the array elements:");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int [] result = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        //enter remaining of array1.
        while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
        }
        //enter remaining of array2.
        while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("sorted array is:");
        for(int x=0; x<result.length;x++){
            System.out.println(result[x]+" ");
        }
        sc.close();
    }
}