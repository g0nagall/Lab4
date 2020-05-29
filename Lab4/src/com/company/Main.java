package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String[] nameSubjects = {
                new String("Math"),
                new String("Biology"),
                new String("Chemistry"),
                new String("English"),
                new String("Algebra")
        };
        Student[] students = new Student[nameSubjects.length];
        for (int i = 0; i < students.length; i++) {
            Scanner sc = new Scanner(System.in);
            P.rint("Enter name of student: ");
            String name = sc.nextLine();
            P.rint("Enter surname of student: ");
            String surname = sc.nextLine();
            students[i] = new Student(i + 1,name,surname,"KB-71",nameSubjects);
            Student.nextID = i + 2;
        }
        for (Student student : students) {
            P.rintln("studentID: " + student.getStudentID() + "\n" + "Name: " + student.getName() + "\n" + "Surname: " + student.getSurname() + "\n" + "Group: " + student.getGroup());
            System.out.printf("AverageMark: %.1f\n",student.averageMark());
            student.displaySubjects();
            P.rintln("");
        }
        Student bestStudent = Utils.getTheBestStudent(students);
        System.out.printf("The best mark has %s %s from %s. He has %.1f.\n",bestStudent.getName(),bestStudent.getSurname(),bestStudent.getGroup(),bestStudent.averageMark());
        String bestSubject = Utils.getTheBestSubject(students);
        P.rintln(bestSubject);
    }
}