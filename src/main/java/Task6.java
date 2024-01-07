public class Task6 {

    private static int countV(String a){
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            char b=a.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String vowels="documentation";
        int countV=countV(vowels);
        System.out.println("Number of vowels in the string are: "+countV);
    }
}
