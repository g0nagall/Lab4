package com.company;

import java.util.Random;

public class Subject {

    private boolean passed;
    private double mark;
    private String nameSubject;
    public Subject() { }
    public Subject(String nameSubject) {
        Random number = new Random();
        this.nameSubject = nameSubject;
        this.mark = 2 + number.nextDouble() * 3;
        this.passed = passedSubject();
    }
    private boolean passedSubject() {
        if(this.mark <= 2) {
            return false;
        }
        else return true;
        }
    public double getMark() {
        return this.mark;
    }
    public boolean getPassed() {
        return this.passed;
    }
    public String getNameSubject() {
        return this.nameSubject;
    }
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
}
