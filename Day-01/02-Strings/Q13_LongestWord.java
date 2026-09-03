import java.util.Scanner;

class logest_word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine().trim();

        if(str.isEmpty()){
            System.out.println("no words found.");
            sc.close();
            return;
        }

        String[] words = str.split("\\s+");

        String longestword = words[0];

        for(int i=1; i<words.length; i++){
            if(words[i].length() > longestword.length()){
                longestword = words[i];
            }
        
        }
        System.out.println(longestword);
        sc.close();
    }
}