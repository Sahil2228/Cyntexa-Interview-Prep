import java.util.Scanner;
import java.util.HashMap;

class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = sc.nextLine().toLowerCase().replace(" ","");

        System.out.println("Enter second String:");
        String str2 = sc.nextLine().toLowerCase().replace(" ","");

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram.");
            sc.close();
            return;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);

            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
                freq.put(ch, 1);
            }
        }


        for(int i=0; i<str2.length(); i++){
            char ch =  str2.charAt(i);

            if(!freq.containsKey(ch)){
                System.out.println("Strings are not an Anagram.");
                sc.close();
                return;
            }
            freq.put(ch, freq.get(ch) -1);
            if(freq.get(ch) == 0){
                freq.remove(ch);
            }

        }

        if(freq.isEmpty()){
            System.out.println("Strings are Anagram.");
        }else{
            System.out.println("Strings are not an Anagram.");
        }

        sc.close();
    }
}