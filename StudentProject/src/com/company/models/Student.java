package com.company.models;

import java.util.List;

public class Student {

    private int rollNo;
    private String name;
    private int year;
    private Fee feePayment;
    private String branch;
    private List<Marks> subject;

    public Student(int rollNo, String name, int year, Fee feePayment, String branch, List<Marks> subject) {
        this.rollNo = rollNo;
        this.name = name;
        this.year = year;
        this.feePayment = feePayment;
        this.branch = branch;
        this.subject = subject;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Fee getFeePayment() {
        return feePayment;
    }

    public void setFeePayment(Fee feePayment) {
        this.feePayment = feePayment;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public List<Marks> getSubject() {
        return subject;
    }

    public void setSubject(List<Marks> subject) {
        this.subject = subject;
    }
}
