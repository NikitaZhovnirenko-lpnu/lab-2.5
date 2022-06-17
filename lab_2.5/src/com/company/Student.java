package com.company;

public class Student {
    private int yearOfStudy;
    private Man man;

    public Student(int yearOfStudy, Man man) { //конструктор з параметрами
        this.yearOfStudy = yearOfStudy;
        this.man = man;
    }
    public Student(){} //пустий конструктор

    public Student(Student student){ //конструктор копіювання
        this.yearOfStudy = student.getYearOfStudy();
        this.man = student.getMan();
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }


    public void setYearOfStudy(int yearOfStudy) {
        if(yearOfStudy >= 0 || yearOfStudy <= 12){
            this.yearOfStudy = yearOfStudy;
        }
        else {
            System.out.println("Увага: значення не може бути від'ємним.");
            System.exit(0);
        }
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }


    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", man=" + man +
                '}';
    }
}
