import java.util.Scanner;
class vowelconsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int vowel = 0;
        int consonant =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >='a' && ch <='z'){
                if(ch =='a' || ch =='e' || ch == 'i' || ch =='o' ||ch =='u'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("vowels: "+ vowel);
        System.out.println("consonants "+consonant);
        sc.close();
    }
}