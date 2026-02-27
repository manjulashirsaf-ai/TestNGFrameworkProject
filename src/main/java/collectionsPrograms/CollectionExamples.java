package collectionsPrograms;

import java.util.*;
import java.util.Map.Entry;

public class CollectionExamples {

    public static void main(String[] args) {

        // 1️⃣ Remove duplicates from ArrayList using Set
        System.out.println("1️⃣ Remove duplicates using Set:");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> set = new LinkedHashSet<>(list); // preserves insertion order
        System.out.println("Original list: " + list);
        System.out.println("Without duplicates: " + set);
        System.out.println();

        // 2️⃣ Sort ArrayList
        System.out.println("2️⃣ Sort ArrayList:");
        ArrayList<Integer> listToSort = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
        Collections.sort(listToSort); // ascending
        System.out.println("Ascending: " + listToSort);
        Collections.sort(listToSort, Collections.reverseOrder()); // descending
        System.out.println("Descending: " + listToSort);
        System.out.println();

        // 3️⃣ Iterate HashMap
        System.out.println("3️⃣ Iterate HashMap:");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Using entrySet iterator
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        // 4️⃣ Find duplicate elements using HashSet
        System.out.println("4️⃣ Find duplicates using HashSet:");
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 3};
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (int num : arr) {
            if (!tempSet.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
        System.out.println();

        // 5️⃣ Count frequency of words using HashMap
        System.out.println("5️⃣ Count frequency of words:");
        String text = "java python java c python java";
        String[] words = text.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
        System.out.println();

        // 6️⃣ Difference between HashMap and Hashtable
        System.out.println("6️⃣ HashMap vs Hashtable:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashMap.put(1, "A"); // allows null key and null values
        hashMap.put(null, "B");
        hashtable.put(2, "X"); // does NOT allow null key or null values
        // hashtable.put(null, "Y"); // will throw NullPointerException if uncommented
        System.out.println("HashMap: " + hashMap);
        System.out.println("Hashtable: " + hashtable);
        System.out.println();

        // 7️⃣ Convert List to Set
        System.out.println("7️⃣ Convert List to Set:");
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println("List: " + stringList);
        System.out.println("Set: " + stringSet);
        System.out.println();

        // 8️⃣ Find max value in HashMap
        System.out.println("8️⃣ Find max value in HashMap:");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        int maxScore = Collections.max(scores.values());
        System.out.println("Max score: " + maxScore);
        System.out.println();

        // 9️⃣ Custom sorting using Comparator
        System.out.println("9️⃣ Custom sorting using Comparator:");
        class Student {
            String name;
            int age;
            Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String toString() { return name + "-" + age; }
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        // Sort by age ascending
        students.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("Sorted by age ascending: " + students);

        // Sort by name descending
        students.sort((s1, s2) -> s2.name.compareTo(s1.name));
        System.out.println("Sorted by name descending: " + students);
    }
}
