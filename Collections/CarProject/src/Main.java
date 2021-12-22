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
//        CarCP p1 = new CarCP();
//        p1.setColor("red");
//        p1.setPrice(1000000);
//        p1.setQuantity(10);
//
//
//        CarCP p2 = new CarCP();
//        p2.setColor("White");
//        p2.setPrice(900000);
//        p2.setQuantity(10);
//
//
//        CarCP p3 = new CarCP();
//        p3.setColor("blue");
//        p3.setPrice(950000);
//        p3.setQuantity(5);
//
//
//
//        CarsModels model1 = new CarsModels();
//        model1.setModel("jazz");
//        model1.setColorAndPrice(Arrays.asList(p1,p3));
//
//        CarsModels model2 = new CarsModels();
//        model2.setModel("City");
//        model2.setColorAndPrice(Arrays.asList(p1,p3));
//
//
//        CarsModels model3 = new CarsModels();
//        model3.setModel("Clazz");
//        model3.setColorAndPrice(Arrays.asList(p1,p3));
//
//
////        CarsModels car1 = new CarsModels();
////        car1.setModel("jazz");
////        car1.setColorAndPrice(Arrays.asList(model1));
////
////
////        Cars car2 = new Cars();
////        car2.setModel("City");
////        car2.setModels(Arrays.asList(model2,model3));
//
//        DealerDetails details1 = new DealerDetails();
//        details1.setName("Green Honda");
//        details1.setAddress("Secunderabad");
//        details1.setPhoneNumber(998899882);
//        details1.setCars(Arrays.asList(model1,model2));
//
//        DealerDetails details2 = new DealerDetails();
//        details2.setName("Metro Honda");
//        details2.setAddress("LB Nagar");
//        details2.setPhoneNumber(8899882);
//        details2.setCars(Arrays.asList(model1));
//
//        DealerDetails details3 = new DealerDetails();
//        details3.setName("pride Honda");
//        details3.setAddress("dilsukhnagar");
//        details3.setPhoneNumber(88998);
//        List<DealerDetails> d = new ArrayList<>();
//        d.add(details1);
//        d.add(details2);


//        for(DealerDetails details : d)
//        {
//            System.out.println("Name : "+details.getName().toString()+"; Address : "+details.getAddress().toString()+"; Phone No : "+details.getPhoneNumber());
//            for (CarsModels car: details.getCars())
//            {
////               System.out.println("Model : "+car.getModel().toString()+car.getModels().toString()+"\n");
//               System.out.println("Model : "+car.getModel()+car.getColorAndPrice().toString()+"\n");
//               System.out.println("");
//            }
//            System.out.println("");
//
//        }

//        details3.setCars(Arrays.asList(model2,model3));

        CarCP c1 = new CarCP("Red",1050000,4);
        CarCP c2 = new CarCP("Blue",1000000,4);
        CarCP c3 = new CarCP("Yellow",1000000,4);
        CarCP c4 = new CarCP("Green",1000000,4);
        CarCP c5 = new CarCP("Black",1000000,4);
        CarCP c6 = new CarCP("White",1000000,4);




        List<CarCP> col1 = Arrays.asList(c1);


        CarsModels city = new CarsModels("City",col1);
        CarsModels clazz = new CarsModels("Clazz",col1);
        CarsModels jazz = new CarsModels("jazz",col1);


        List<CarsModels> mod1 =Arrays.asList(city,clazz);



        DealerDetails detai = new DealerDetails("pride Honda","dilsukhnagar",98778191,mod1);
        List<DealerDetails> dealer =new ArrayList<>();

        dealer.add(detai);

        dealer.stream().forEach(q->{
                System.out.println("Name : "+q.getName()+"\n Address : "+q.getAddress()+"\n Phone Number : "+q.getPhoneNumber());
        });
//        d.stream().forEach(a->System.out.println("Name : "+a.getName()+" Address : "+a.getAddress()+" Phone No : "+a.getPhoneNumber()+"Car Model"+
//                                                "Car Model : "+ a.getCars()));




    }

}
