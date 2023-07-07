
import java.util.Arrays;
import java.util.LinkedList;

public class App {

    public static void linkedList() {
        LinkedList<String> list = new LinkedList<>();

        // Add items to this list
        list.add("First string");
        list.add("Second string");
        list.add("Fourth string");

        list.add(2, "Third string"); // Inserts after the Second String

        var iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void mismatching() {
        int[] a1 = new int[] { 1, 2, 3, 4, 5 };
        int[] a2 = new int[] { 1, 2, 3, 5, 4 };

        // Finds the first index where these two integer arrays are not matching
        System.out.println("First mismatch at: " + Arrays.mismatch(a1, a2)); // 3
    }

    public static void arrayToList() {
        // Initialize a new array of intergers
        int[] a = { 1, 3, 4, 5, 6, 2, 5, 2, 2, 6, 7, 8 };

        // Print its type
        System.out.println("Type of a: " + a.getClass());

        // Convert to the list
        var list = Arrays.asList(a);

        // Print out the list
        System.out.println("Type of list: " + list.getClass());
    }

    public static void arrayFill() {
        // Initialize a new array
        int[] i = new int[10];

        // Fill the first 5 indices with 5
        Arrays.fill(i, 0, 5, 5);

        // Fill the next 5 indices with 9
        Arrays.fill(i, 5, 10, 9);

        // Iterate the array and printout the list
        for (int a : i) {
            System.out.println(a);
        }
    }

    public static void varKeyword() {
        var i = 10;
        System.out.println(((Object) i).getClass().getName()); // java.lang.Integer

        var name = "some name";
        System.out.println((name).getClass().getName()); // java.lang.String
    }

    public static void sortingAndSearching() {
        // An unsorted array of integers
        var intList = new int[] { 1, 3, 4, 2, 3, 2, 5, 3, 2, 7, 5, 3 };

        // First sort the list
        Arrays.sort(intList, 0, intList.length);

        // Now find the index of the 7
        System.out.println("Index of 7: " + Arrays.binarySearch(intList, 0, intList.length, 7));
    }

    public static void main(String[] args) throws Exception {

        varKeyword();
        sortingAndSearching();
        arrayFill();
        linkedList();
        mismatching();
        arrayToList();
    }
}
