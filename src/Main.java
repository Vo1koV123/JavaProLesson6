    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {
            //task 1
            List<String> words = Arrays.asList("Max", "Bodya", "Alex", "Max", "Max", "Andry", "Jack", "Harry", "Robert", "Michael");
            String target = "Max";
            countOccurance(words, target);


            //task 2
            int[] arr = {1, 2, 3};

            System.out.println(Arrays.toString(arr));
            toList(arr);

            //task 3
            List<Integer> uniqueNumbers1 = new ArrayList<>();
            uniqueNumbers1.add(1);
            uniqueNumbers1.add(2);
            uniqueNumbers1.add(2);
            uniqueNumbers1.add(3);

            findUnique(uniqueNumbers1);

            //task 4
            List<String> animals = Arrays.asList("bird", "fox", "cat", "bird", "dog", "dog", "dog", "dog", "cat", "bird");
            calcOccurance(animals);

        }

            //task 1
        public static void countOccurance(List<String> wordList, String targetWord) {
            int count = 0;
            for (String words : wordList) {
                if (words.equals(targetWord)) {
                    count++;
                }
            }
            System.out.println(count);
        }

            //task 2
        public static void toList(int[] numbers) {
            ArrayList<Integer> listNumbers = new ArrayList<>();
            for (int number : numbers) {
                listNumbers.add(number);
            }
            System.out.println(listNumbers);
        }

            //task 3
        public static List<Integer> findUnique(List<Integer> listNumbers) {
            List<Integer> uniqueNumbers = new ArrayList<>();

            for (Integer listNumber : listNumbers) {
                if (!uniqueNumbers.contains(listNumber))
                    uniqueNumbers.add(listNumber);
            }
            return uniqueNumbers;
        }

            //task 4
        public static void calcOccurance(List<String> animals) {
            List<String> uniqueValues = new ArrayList<>();
            for (String animal : animals) {
                int counter = 0;
                if (uniqueValues.contains(animal)) continue;
                else uniqueValues.add(animal);
                for (String s : animals) {
                    if (s.equals(animal)) counter++;
                }
                System.out.println(animal + ": " + counter);
            }
        }
            //task 5
        public static class Occurrence {

            private final String name;
            private final int occurrence;

            public Occurrence(String name, int occurrence) {
                this.name = name;
                this.occurrence = occurrence;
            }

            public static List<Occurrence> findOccurance(List<String> occurrences) {

                List<String> uniqueValues = new ArrayList<>();
                List<Occurrence> uniqueOccurrences = new ArrayList<>();

                for (String values : occurrences) {
                    int counter = 0;
                    if (uniqueValues.contains(values)) continue;
                    else uniqueValues.add(values);
                    for (String values2 : occurrences) {
                        if (values.equals(values2)) counter++;
                    }
                    uniqueOccurrences.add(new Occurrence(values, counter));
                }
                return uniqueOccurrences;
            }

            @Override
            public String toString() {
                return "Occurrence{" +
                        "name='" + name + '\'' +
                        ", occurrence: " + occurrence +
                        '}' + '\n';
            }
        }
    }