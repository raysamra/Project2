import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {

        public static void main(String[] args) {

            List<String> arrList = new ArrayList<>();
            arrList.add("purple");
            arrList.add("black");
            arrList.add("purple");
            arrList.add("orange");
            arrList.add("white");
            arrList.add("black");

            System.out.println("Original Array List: " + arrList);

            List<String> afterList = new ArrayList<>(new HashSet<>(arrList));

            System.out.println("List after removing duplicates: " + afterList);
        }


}
