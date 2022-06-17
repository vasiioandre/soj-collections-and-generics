import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer item;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Print list with even numbers from 1 to 10:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            item = iterator.next();
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }

        Set<String> flowers = new HashSet<>();
        flowers.add("roses");
        flowers.add("roses");
        flowers.add("roses");

        System.out.println("The elements in the set is only added once:");
        for (String flower : flowers) {
            System.out.println(flower);
        }

        Map<String, Integer> test = new HashMap<>();
        test.put("Ben", 18);
        test.put("Alice", 9);
        test.put("Chloe", 20);
        test.put("John", 5);

        System.out.println("Print keys for values greater than 10:");
        for (Map.Entry<String, Integer> student : test.entrySet()) {
            if (student.getValue() > 10) {
                System.out.println(student.getKey());
            }
        }

        List<Integer> numbersWithDuplicates = Arrays.asList(new Integer[]{7, 4, 5, 2, 1, 2, 4, 1});
        System.out.println("List with duplicates:");
        for (Integer number : numbersWithDuplicates) {
            System.out.println(number);
        }

        HashSet<Integer> set = new HashSet<Integer>(numbersWithDuplicates);
        List<Integer> numbersWithoutDuplicates = new ArrayList<Integer>(set);

        System.out.println("List without duplicates:");
        for (Integer number : numbersWithoutDuplicates) {
            System.out.println(number);
        }

        Collections.sort(numbersWithoutDuplicates, Collections.reverseOrder());
        System.out.println("Reverse sorted list:");
        for (Integer number : numbersWithoutDuplicates) {
            System.out.println(number);
        }

        Set<String> setOfStrings = new HashSet<String>();
        for (Integer number : numbersWithoutDuplicates)
            setOfStrings.add(Integer.toString(number));

        System.out.println("Create a Set of Strings from the sorted list:");
        for (String number : setOfStrings) {
            System.out.println(number);
        }

        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String s : setOfStrings) {
            map.put(s, numbersWithoutDuplicates.get(i));
            i++;
        }

        System.out.println("Print the map having the resulted set as the keySet and the list as values for each key:");
        for (Map.Entry<String, Integer> mapElement : map.entrySet()) {
            System.out.println(mapElement);
        }
    }
}
