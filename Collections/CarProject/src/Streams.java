import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
        public static void main (String[]args) throws IOException {
            // 1. Integer Stream
            IntStream
                    .range(1, 10)
                    .forEach(System.out::print);
            System.out.println();

            // 2. Integer Stream with skip
            IntStream
                    .range(1, 10)
                    .skip(5)
                    .forEach(x -> System.out.println(x));
            System.out.println();

            // 3. Integer Stream with sum
            System.out.println(
                    IntStream
                            .range(1, 5)
                            .sum());
            System.out.println();

            // 4. Stream.of, sorted and findFirst
            Stream.of("Ava", "Aneri", "Alberto")
                    .sorted()
                    .findFirst()
                    .ifPresent(System.out::println);

            // 5. Stream from Array, sort, filter and print
            String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
            Arrays.stream(names)	// same as Stream.of(names)
                    .filter(x -> x.startsWith("S"))
                    .sorted()
                    .forEach(System.out::println);

            // 6. average of squares of an int array
            Arrays.stream(new int[] {2, 4, 6, 8, 10})
                    .map(x -> x * x)
                    .average()
                    .ifPresent(System.out::println);

            // 7. Stream from List, filter and print
            List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
            people
                    .stream()
                    .map(String::toLowerCase)
                    .filter(x -> x.startsWith("a"))
                    .forEach(System.out::println);

            // 8. Stream rows from text file, sort, filter, and print
            Stream<String> bands = Files.lines(Paths.get("bands.txt"));
            bands
                    .sorted()
                    .filter(x -> x.length() > 13)
                    .forEach(System.out::println);
            bands.close();

            // 9. Stream rows from text file and save to List
            List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                    .filter(x -> x.contains("jit"))
                    .collect(Collectors.toList());
            bands2.forEach(x -> System.out.println(x));

            // 10. Stream rows from CSV file and count
            Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
            int rowCount = (int)rows1
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .count();
            System.out.println(rowCount + " rows.");
            rows1.close();

            // 11. Stream rows from CSV file, parse data from rows
            Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
            rows2
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .filter(x -> Integer.parseInt(x[1]) > 15)
                    .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
            rows2.close();

            // 12. Stream rows from CSV file, store fields in HashMap
            Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
            Map<String, Integer> map = new HashMap<>();
            map = rows3
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .filter(x -> Integer.parseInt(x[1]) > 15)
                    .collect(Collectors.toMap(
                            x -> x[0],
                            x -> Integer.parseInt(x[1])));
            rows3.close();
            for (String key : map.keySet()) {
                System.out.println(key + "  " + map.get(key));
            }

            // 13. Reduction - sum
            double total = Stream.of(7.3, 1.5, 4.8)
                    .reduce(0.0, (Double a, Double b) -> a + b);
            System.out.println("Total = " + total);

            // 14. Reduction - summary statistics
            IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                    .summaryStatistics();
            System.out.println(summary);

System.out.println("*****************************************");
            List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9);
            List<Integer> square = num.stream().map(x->(x+1)*(x+1)).collect(Collectors.toList());
            System.out.println("Squaring");

            System.out.println(square);

            System.out.println("The total sum of values present in list ");

            Integer sum = num.stream().reduce(0,Integer::sum);
            System.out.println(sum);


            //System.out.println(square);


            List<String> names = Arrays.asList("apple","banana","hi","Hello","and","heydude");
            List<String> res = names.stream().filter(x->x.startsWith("h")||x.startsWith("H")).collect(Collectors.toList());


            String rap = names.stream().filter(x->x.startsWith("h")||x.startsWith("H")).collect(Collectors.joining());


            System.out.println("\n******************");


            System.out.println("finding by starting letter ");

            System.out.println(res);
            System.out.println("\n******************");

            System.out.println("joining string");
            System.out.println(rap);

            //
            List<Integer> squ = num.stream().map(y->y*y).collect(Collectors.toList());
//        System.out.println(squ);
            System.out.println("\n******************");

            System.out.println("\n1.print numbers");
            IntStream.range(1,10).forEach(System.out::println);


            System.out.println("\n******************");

//2. Skip first n no of elements from the string
            System.out.println("\n2. Skip first n no of elements from the string");

            IntStream.range(1,10).skip(5).forEach(System.out::println);
            System.out.println("\n******************");

// 3.lambda expression
            System.out.println("\n3.lambda expression");

            IntStream.range(1,10).skip(2).forEach(x->System.out.println(x));

            System.out.println("\n******************");

// 4. sum
            System.out.println("\n4.Sum");

            System.out.println(
                    IntStream.range(1,5).sum()
            );
            System.out.println(" ");
            System.out.println("\n******************");

//  5.  sorted and 1st item n the list
            System.out.println("\n5.  sorted and 1st item n the list");

            Stream.of("Apple","Ant","Avocado","Avengers").sorted().findFirst().ifPresent(System.out::println);
            System.out.println("\n******************");

//6. Stream from Array, Sort, Filter and print
            System.out.println("\n6. Stream from Array, Sort, Filter and print");

            String[]  info = {"Apple","Ant","Avocado","Avengers","banana","hi","Hello","and","heydude" };
            Stream.of(info).filter(y->y.startsWith("h")||y.startsWith("H ")).sorted().forEach(System.out::println);

            System.out.println("\n******************");

//7. Average of squares of int array
            System.out.println("\n7. Average of squares of int array");

            Arrays.stream(new int[]{2,3,4,5,6}).map(m->m*m).average().ifPresent(System.out::println);

            System.out.println("\n******************");

// 8. Stream from List, filter and print
            System.out.println("\n8. Stream from List, filter and print");

            List<String> data = Arrays.asList("   Apple","   Ant","   Avocado","   Avengers","banana","hi","Hello","and","heydude");
//        Streams();
//        System.out.println(strem);
            System.out.println("\n******************");

            System.out.println("\nUpperCase");

            data.stream().map(q->q.toUpperCase()).forEach(System.out::println);

            System.out.println("\n******************");

            System.out.println("\nTrim");

            data.stream().forEach(e->System.out.println(e.trim()));
            System.out.println("\n******************");

            System.out.println("\nStrip");

            data.stream().forEach(w->System.out.println(w.strip()));
            System.out.println("\n******************");

            System.out.println("\nLowercase,starts with an character, sort and print ");

            data.stream().map(String::toLowerCase).filter(y->y.startsWith("h")).sorted().forEach(System.out::println);

            System.out.println("\n******************");
            System.out.println("\ncontains 'a string'");


            data.stream().filter(m->m.contains("ocad")).forEach(System.out::println);

            System.out.println("\n******************");


//        9. Reduction Sum
            System.out.println("9. Reduction Sum");
            double t = Stream.of(7.3,2.4,1.9).reduce(0.0, (Double a, Double b )->a+b);
            System.out.println(t);


            System.out.println("\n******************");

//        10. Summary Statistics
            System.out.println("10. Summary Statistics");


            IntSummaryStatistics stat = IntStream.of(2,1,5,10,31,94,90).summaryStatistics();
            System.out.println(stat.getAverage());

        }

}


