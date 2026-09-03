import java.util.Scanner;

class reverse_word_order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for(int i=words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i !=0){
                result.append(" ");
            }
        }
        System.out.println(result);


        sc.close();

    }
}