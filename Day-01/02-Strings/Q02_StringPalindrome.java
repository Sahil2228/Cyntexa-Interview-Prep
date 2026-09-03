import java.util.Scanner;

class palindromestr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int left = 0; 
        int right = str.length()-1;

        boolean isPalindrome = true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome  = false;
                break; 
            }
            left ++;
            right --;
        }
        if(isPalindrome){
            System.out.println("String is a Palindrome.");
        } else {
            System.out.println("String is not a Palindrome.");
        }
        sc.close();
    }
}