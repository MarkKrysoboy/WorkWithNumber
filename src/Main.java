import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tempIntList = new ArrayList(intList);
        Iterator<Integer> listIterator = tempIntList.iterator();
        while (listIterator.hasNext()) {
            int x = listIterator.next();
            if (x <= 0 || x % 2 != 0) {
                listIterator.remove();
            }
        }
        Collections.sort(tempIntList);

        for (Integer i:tempIntList) {
            System.out.print(i + " ");
        }

    }
}
