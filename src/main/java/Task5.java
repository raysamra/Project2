import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    private static boolean areAnagrams(String a, String b){
        a=a.replaceAll("\\s", "").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();

        if(a.length() != b.length()){
            return false;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String a=scanner.nextLine();

        System.out.println("Enter the second word:");
        String b=scanner.nextLine();

        if(areAnagrams(a,b)) {
            System.out.println("Words are anagrams");
        }else{
            System.out.println("Words are not anagrams");
        }


    }
}
