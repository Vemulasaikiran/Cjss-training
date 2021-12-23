package com.company;

import com.company.models.Benefits;
import com.company.models.Department;
import com.company.models.Employee;
import com.company.models.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee sai = new Employee("E1","Saikiran",10000,"lId1","dId1","bId1");
        Employee sam = new Employee("E2","sam",15000,"lId2","dId2",null);
        Employee satya = new Employee("E3","satya",9000,"lId3","dId3","bId2");
        Employee avinash = new Employee("E4","avinash",11000,"lId4","dId4","bId1");
        Employee anjali = new Employee("E5","anjali",12000,"lId5","dId5",null);
        Employee mahesh = new Employee("E6","mahesh",13000,"lId6","dId6","bId2");

        Department dId1 = new Department("dId1","HealthCare");
        Department dId2 = new Department("dId2","Finance");
        Department dId3 = new Department("dId3","Admin");
        Department dId4 = new Department("dId4","HealthCare");
        Department dId5 = new Department("dId5","Fraud");
        Department dId6 = new Department("dId6","Admin");


        Location lId1 = new Location("lId1","Hyderabad","India");
        Location lId2 = new Location("lId2","Delhi","India");
        Location lId3 = new Location("lId3","London","UK");
        Location lId4 = new Location("lId4","chennai","India");
        Location lId5 = new Location("lId5","Edinburgh","UK");
        Location lId6 = new Location("lId6","Bangalore","India");


        Benefits bId1 = new Benefits("bId1","Health Insurance","It is applicable for all");
        Benefits bId2 = new Benefits("bId2","Lift Access","It is accessible only  for card Holders");

        List<Employee> employees = new ArrayList<>();

        employees.add(sai);
        employees.add(sam);
        employees.add(satya);
        employees.add(avinash);
        employees.add(anjali);
        employees.add(mahesh);

        List<Department> departments = new ArrayList<>();
        departments.add(dId1);
        departments.add(dId2);
        departments.add(dId3);
        departments.add(dId4);
        departments.add(dId5);
        departments.add(dId6);


        List<Location> locations = new ArrayList<>();
        locations.add(lId1);
        locations.add(lId2);
        locations.add(lId3);
        locations.add(lId4);
        locations.add(lId5);
        locations.add(lId6);


        List<Benefits> benefits = new ArrayList<>();
        benefits.add(bId1);
        benefits.add(bId2);



        System.out.println("+++********* !! Task 1 !! ***+++**++***++**++*");

        List <Location> locid = locations.stream().filter(q->q.getCountry().contains("India")).collect(Collectors.toList());
        List<Employee> empd = employees.stream().filter(two->locid.stream().anyMatch(one-> one.getLocationId().equals(two.getLocationId()))).collect(Collectors.toList());
//        System.out.println(empd);
        empd.stream().forEach(y->System.out.println("\n Name : "+y.getName()+"\n Employee Id : "+y.getId()));


        System.out.println("+++********* !! Task 2 !! ***+++**++***++**++*");


        List<Location> locHyd = locations.stream().filter(o->o.getCountry().contains("India")&&(o.getLocationName().contains("Hyderabad")||o.getLocationName().contains("chennai"))).collect(Collectors.toList());
//        System.out.println(locHyd);
        List<Employee> emmp = employees.stream().filter(t->locHyd.stream().anyMatch(o->o.getLocationId().equals(t.getLocationId()))).collect(Collectors.toList());

        emmp.stream().forEach(u->{
            System.out.println("\n Name : "+u.getName()+"\n Employee Id : "+u.getId());
            locations.stream().filter(k->k.getLocationId().equals(u.getLocationId())).forEach(f->System.out.println(" City : "+f.getLocationName()+"\n Country : "+f.getCountry()));

        });


        System.out.println("+++********* !! Task 3 !! ***+++**++***++**++*");

        employees.stream().filter(x->x.getBenefitId()!=null).forEach(r->{
            System.out.println("\n Name : "+r.getName()+"\n Employee Id : "+r.getId());
            benefits.stream().filter(g->g.getBenefitId().equals(r.getBenefitId())).forEach(l->
                    System.out.println(" Benefit Name : "+l.getBenefitName()+"\n Benefit Description : "+l.getDescription()));
        });

        System.out.println("+++********* !! Task 4 !! ***+++**++***++**++*");

        












    }
}
