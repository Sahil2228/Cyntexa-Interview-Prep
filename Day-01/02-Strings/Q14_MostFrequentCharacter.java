import java.util.Scanner;
import java.util.HashMap;

class most_freq_character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch ==' '){
                continue;
            }

            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
                freq.put(ch, 1);
            }
        }

        char mostfrequent = '\0';
        int maxfrequency = 0;

        for(Character key : freq.keySet()){
            if(freq.get(key)>maxfrequency){
                maxfrequency = freq.get(key);
                mostfrequent = key;
            }
        }
        if(maxfrequency ==0){
            System.out.println("no character found.");
        }else{
            System.out.println("most frequent character: "+ mostfrequent);
            System.out.println("frequency: "+ maxfrequency);
        }
        sc.close();


    }
}