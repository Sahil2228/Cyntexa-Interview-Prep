import java.util.Scanner;
import java.util.HashMap;

class characterfreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str =str.toLowerCase();

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }else{
            freq.put(ch, 1);
            }
        }


        for(Character key : freq.keySet()){
            System.out.println(key+" = "+ freq.get(key));
        }

        sc.close();
    }
}