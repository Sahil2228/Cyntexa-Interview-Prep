import java.util.Scanner;

class reverse_each_word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();

        String [] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<words.length; i++){
            StringBuilder reverse = new StringBuilder(words[i]);

            result.append(reverse.reverse());

            if(i != words.length-1){
                result.append(" ");
            }
        }
        System.out.println(result);
        
      sc.close();
    }
}