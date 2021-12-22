package com.company;

import com.company.models.Fee;
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

        Student saikiran = new Student(01,"Saikiran","1st Year",sai,"CSE");

        Student naresh = new Student(02,"Naresh","2nd Year",nareshP,"MECH");

        Student samSwaroop = new Student(03,"SamSwaroop","1st Year",sam,"ECE");

        Student satya = new Student(04,"Sathya","2nd Year",sathya,"ECE");


        List<Student> student = new ArrayList<>();
        student.add(saikiran);
        student.add(naresh);
        student.add(samSwaroop);
        student.add(satya);







        System.out.println("Task 1");

        student.stream().filter(m->m.getYear().contains("2nd Year")).forEach(q->System.out.println("Roll No : "+q.getRollNo()+"; Student Name : " + q.getName()+"; Branch : "+q.getBranch()+"; Year : "+q.getYear()));


        System.out.println("Task 2");

        student.stream().forEach(i->System.out.println("Roll No : "+ i.getRollNo()+"; Name : "+ i.getName()+"; Branch : "+i.getBranch()+"; Amount Payed : "+ i.getFeePayment().getAmount()+"; Date of Payment : "+i.getFeePayment().getDate()));


        System.out.println("Task 3");

        












    }
}
