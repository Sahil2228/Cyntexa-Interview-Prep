import java.util.Scanner;
import java.util.HashMap;

class first_non_repeating_char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();
        // frequency count.
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
                freq.put(ch,1);
            }
        }
        
        //first non repeating character.
        boolean found = false;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(freq.get(ch) == 1){
                System.out.println("first non-repeating character:"+ ch);
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.println("no non-repeating characters.");
        }
        
        sc.close();
    }
}