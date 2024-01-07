public class Task3 {

String reverseWord(String a) {
    StringBuilder reverse = new StringBuilder();
    for (int i = a.length() - 1; i >= 0; i--) {
        reverse.append(a.charAt(i));
    }
    return reverse.toString();
}

    public static void main(String[] args) {
    Task3 t=new Task3();
        String a="Hello";
        String word=t.reverseWord(a);


        System.out.println("Before Reversal: "+a);

        System.out.println("After Reversal: "+word);



    }

}
