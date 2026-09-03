import java.util.Scanner;
import java.util.HashSet;

public class Q07_FirstRepeatingCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();

        HashSet<Character> seen =new HashSet<>();

        boolean found = false;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(seen.contains(ch)){
                System.out.println("first repeating character is: "+ ch);
                found = true; 
                break;
            } else {
                seen.add(ch);
            }
        }

        if(!found){
            System.out.println("No Repeating Character.");
        }
        sc.close();
    }
}
