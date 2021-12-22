package com.company;

import com.company.models.Fee;
import com.company.models.Marks;
import com.company.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fee sai = new Fee(100000,"12-Dec-2021");
        Fee nareshP = new Fee(50000,"11-Sep-2021");
        Fee sam = new Fee(173000,"11-Sep-2021");
        Fee sathya  = new Fee(10000,"01-Oct-2021");


        Marks saiM = new Marks("M1","50",1);
        Marks saiPhy = new Marks("Phy","45",1);
        Marks saiDp = new Marks("Dp","45",1);

        Marks nareshjava = new Marks("Java","60",2 );
        Marks nareshpython = new Marks("Python","60",2);
        Marks nareshAlgo = new Marks("Algorithms","50",2);


        Marks satyajava = new Marks("Java","60",2 );
        Marks satyapyt = new Marks("Python","60",2);
        Marks satyaAlgo = new Marks("Algorithms","50",2);

        Marks sambee = new Marks("BEE","67",1);
        Marks samedc = new Marks("edc","67",1);
        Marks sammefa = new Marks("Mefa","57",1);

        List<Marks> samSwaroopMarks = new ArrayList<>();
        samSwaroopMarks.add(sambee);
        samSwaroopMarks.add(samedc);
        samSwaroopMarks.add(sammefa);



        List<Marks> nareshMarks = new ArrayList<>();
        nareshMarks.add(nareshjava);
        nareshMarks.add(nareshpython);
        nareshMarks.add(nareshAlgo);

        List<Marks> sathyaMarks = new ArrayList<>();
        sathyaMarks.add(satyajava);
        sathyaMarks.add(satyapyt);
        sathyaMarks.add(satyaAlgo);


        List<Marks> saimarks = new ArrayList<>();
        saimarks.add(saiM);
        saimarks.add(saiPhy);
        saimarks.add(saiDp);



        Student saikiran = new Student(01,"Saikiran",1,sai,"CSE",saimarks);

        Student naresh = new Student(02,"Naresh",2,nareshP,"MECH",nareshMarks);

        Student samSwaroop = new Student(03,"SamSwaroop",1,sam,"ECE",samSwaroopMarks);

        Student satya = new Student(04,"Sathya",2,sathya,"ECE",sathyaMarks);


        List<Student> student = new ArrayList<>();
        student.add(saikiran);
        student.add(naresh);
        student.add(samSwaroop);
        student.add(satya);





        System.out.println("******************************************************");

        student.stream().filter(m->m.getYear()==2).forEach(q->System.out.println("Roll No : "+q.getRollNo()+"; Student Name : " + q.getName()+"; Branch : "+q.getBranch()+"; Year : "+q.getYear()));


        System.out.println("***********************************");

        student.stream().forEach(i->System.out.println("Roll No : "+ i.getRollNo()+"; Name : "+ i.getName()+"; Branch : "+i.getBranch()+"; Amount Payed : "+ i.getFeePayment().getAmount()+"; Date of Payment : "+i.getFeePayment().getDate()));


        System.out.println("************************************************");
        student.stream().forEach(i->{System.out.println("Roll No : "+ i.getRollNo()+"; Name : "+ i.getName()+"; Branch : "+i.getBranch()+"; Amount Payed : "
                + i.getFeePayment().getAmount()+"; Date of Payment : "+i.getFeePayment().getDate());
                i.getSubject().stream().forEach(v->System.out.println("Subject : "+v.getSubject()+ "; Marks : "+v.getMarks()+ "; Year : "+v.getYear()));


        });

    }
}
