public class Task2 {

    public static void main(String[] args) {
        String a="Hello12345World";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char b=a.charAt(i);
            if(Character.isLetter(b)){
                count++;
            }

        }
        System.out.println(count);
    }

}
