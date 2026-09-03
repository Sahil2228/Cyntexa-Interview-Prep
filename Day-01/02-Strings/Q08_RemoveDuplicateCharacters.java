import java.util.Scanner;
import java.util.HashSet;

class remove_duplicate_characters{
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine().toLowerCase();

        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result);

    
        sc.close();
    }
}