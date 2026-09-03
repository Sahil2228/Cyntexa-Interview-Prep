import java.util.Scanner;
 class invertednumbertriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

      for(int i=n; i>=1; i--){
         for(int j=1; j<=i; j++){
            System.out.print(i+" ");
         }
         System.out.println();
      }



         sc.close();
    }
 }

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1