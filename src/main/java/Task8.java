import java.util.ArrayList;
import java.util.List;


public class Task8 {
    public static List<String> filter(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A") || str.startsWith("a")) {
                result.add(str.toLowerCase());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Eve");
        list.add("aaron");
        list.add("Ray");
        list.add("Argon");

        List<String> filteredList = filter(list);

        System.out.println("Filtered Strings Starting with 'A' in Lower Case: " + filteredList);
    }

}
