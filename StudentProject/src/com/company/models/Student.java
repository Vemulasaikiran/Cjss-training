package com.company.models;

public class Student {

    private int rollNo;
    private String name;
    private String year;
    private Fee feePayment;
    private String branch;

    public Student(int rollNo, String name, String year, Fee feePayment, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.year = year;
        this.feePayment = feePayment;
        this.branch = branch;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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
}
