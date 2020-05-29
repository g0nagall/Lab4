package com.company;

public class Student {
    private int studentID;
    public static int nextID;
    private String name;
    private String surname;
    private String group;
    private Subject[] subjects;
    public Student() { }
    public Student(int studentID,String name,String surname,String group, String[] nameSubjects) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subjects = new Subject[nameSubjects.length];
        for(int i = 0; i < subjects.length; i++) {
            subjects[i] = new Subject(nameSubjects[i]);
        }
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return this.studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return this.group;
    }
    public Subject[] getSubjects() {
        return subjects;
    }
    public double averageMark() {
        double sumOfMarks = 0;
        for (Subject subject : subjects) {
            sumOfMarks+=subject.getMark();
        }
        return sumOfMarks / subjects.length;
    }
    public void displaySubjects() {
        for (Subject subject : subjects) {
            System.out.printf("NameSubject: %s\n Mark: %.1f\n Passed: %b\n",subject.getNameSubject(),subject.getMark(),subject.getPassed());
        }
    }

}
