public class Task7 {

    private static int countWords(String a){
        String[] words=a.split("\\s+|\\p{Punct}");
        int count=0;
        for(String word:words){
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String b="Hello, world!";
        int wordCount=countWords(b);
        System.out.println("Number of words in the string are: "+wordCount);
    }

}
