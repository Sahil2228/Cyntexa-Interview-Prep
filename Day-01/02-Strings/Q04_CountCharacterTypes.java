import java.util.Scanner;
class countcharactertype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string.");
        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digit =0;
        int specialCharacter = 0;

        for(int i=0; i <= str.length()-1; i++){
            char ch =str.charAt(i);

            if(ch >='A' && ch <='Z'){
                uppercase++;
            }else if(ch >='a' && ch<='z'){
                lowercase++;
            }else if(ch >= '0' && ch<='9'){
                digit++;
            }else{
                specialCharacter++;
            }
        }
        System.out.println(uppercase+","+lowercase+","+digit+","+specialCharacter+".");
        sc.close();
    }
}