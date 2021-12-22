package com.company.models;

public class Marks {
    private String subject;
    private String marks;
    private int year;

    public Marks(String subject, String marks, int year) {
        this.subject = subject;
        this.marks = marks;
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
