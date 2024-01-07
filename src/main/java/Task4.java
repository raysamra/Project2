import java.util.Scanner;

public class Task4 {
    private static boolean isPalindrome(String a){
        a=a.replaceAll("\\s","").toLowerCase();

        int left =0;
        int right=a.length()-1;

        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String b=scanner.nextLine();

        if(isPalindrome(b)){
            System.out.println("The word is a palindrome");
        }else{
            System.out.println("The word is not a palindrome");
        }
    }

}
