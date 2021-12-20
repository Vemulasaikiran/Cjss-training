import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[]args)
    {
        CarCP p1 = new CarCP();
        p1.setColor("red");
        p1.setPrice(1000000);
        p1.setQuantity(10);


        CarCP p2 = new CarCP();
        p2.setColor("White");
        p2.setPrice(900000);
        p2.setQuantity(10);


        CarCP p3 = new CarCP();
        p3.setColor("blue");
        p3.setPrice(950000);
        p3.setQuantity(5);



        CarsModels model1 = new CarsModels();
        model1.setModel("jazz");
        model1.setColorAndPrice(Arrays.asList(p1,p3));

        CarsModels model2 = new CarsModels();
        model2.setModel("City");
        model2.setColorAndPrice(Arrays.asList(p1,p3));


        CarsModels model3 = new CarsModels();
        model3.setModel("Clazz");
        model3.setColorAndPrice(Arrays.asList(p1,p3));


        Cars car1 = new Cars();
        car1.setModel("jazz");
        car1.setModels(Arrays.asList(model1));


        Cars car2 = new Cars();
        car2.setModel("City");
        car2.setModels(Arrays.asList(model2,model3));

        DealerDetails details1 = new DealerDetails();
        details1.setName("Green Honda");
        details1.setAddress("Secunderabad");
        details1.setPhoneNumber(998899882);
        details1.setCars(Arrays.asList(car1,car2));

        DealerDetails details2 = new DealerDetails();
        details2.setName("Metro Honda");
        details2.setAddress("LB Nagar");
        details2.setPhoneNumber(8899882);
        details2.setCars(Arrays.asList(car2));

        DealerDetails details3 = new DealerDetails();
        details2.setName("pride Honda");
        details2.setAddress("dilsukhnagar");
        details2.setPhoneNumber(88998);
        details2.setCars(Arrays.asList(car2));


        List<DealerDetails> d = new ArrayList<>();
        d.add(details1);
        d.add(details2);



        for(DealerDetails details : d)
        {
            //System.out.println("Name : "+details.getName().toString()+"; Address : "+details.getAddress().toString()+"; Phone No : "+details.getPhoneNumber());
            for (Cars car: details.getCars())
            {
               //System.out.println("Model : "+car.getModel().toString()+car.getModels().toString()+"\n");
              // System.out.println("");
            }
            //System.out.println("");

        }
        List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> square = num.stream().map(x->(x+1)*(x+1)).collect(Collectors.toList());
        //System.out.println(square);


        List<String> names = Arrays.asList("apple","banana","hi","Hello","and","heydude");
        List<String> res = names.stream().filter(x->x.startsWith("h")||x.startsWith("H")).collect(Collectors.toList());
//        System.out.println(res);
//
        List<Integer> squ = num.stream().map(y->y*y).collect(Collectors.toList());
//        System.out.println(squ);
//1.print numbers
      //  IntStream.range(1,10).forEach(System.out::println);



//2. Skip first n no of elements from the string

//        IntStream.range(1,10).skip(5).forEach(System.out::println);

// 3.lambda expression
        //IntStream.range(1,10).skip(2).forEach(x->System.out.println(x));


// 4. sum

//        System.out.println(
//                IntStream.range(1,5).sum()
//        );
//        System.out.println(" ");

//  5.  sorted and 1st item n the list

//        Stream.of("Apple","Ant","Avocado","Avengers").sorted().findFirst().ifPresent(System.out::println);

//6. Stream from Array, Sort, Filter and print

//        String[]  info = {"Apple","Ant","Avocado","Avengers","banana","hi","Hello","and","heydude" };
//        Stream.of(info).filter(y->y.startsWith("h")||y.startsWith("H ")).sorted().forEach(System.out::println);


//7. Average of squares of int array
//        Arrays.stream(new int[]{2,3,4,5,6}).map(m->m*m).average().ifPresent(System.out::println);


// 8. Stream from List, filter and print

//        List<String> data = Arrays.asList("Apple","Ant","Avocado","Avengers","banana","hi","Hello","and","heydude");
//        Streams();
//        System.out.println(strem);
//        data.stream().map(String::toLowerCase).filter(y->y.startsWith("h")).sorted().forEach(System.out::println);


//        9. Reduction Sum

        double t = Stream.of(7.3,2.4,1.9).reduce(0.0, (Double a, Double b )->a+b);
        System.out.println(t);
//        10. Summary Statistics
        IntSummaryStatistics stat = IntStream.of(2,1,5,10,31,94,90).summaryStatistics();
        System.out.println(stat.getAverage());

    }

}