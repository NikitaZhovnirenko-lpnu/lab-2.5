package com.company;

import Strings.Genders;

public class Main {

    public static void main(String[] args) {

      /*  Варіант 5.
        Створити клас Man (людина) з полями: ім’я, вік, стать і вага. Визначити методи
        переприсвоєння імені, зміни віку і зміни ваги.
        Створити клас-контейнер Student, що має поля «людина» та «рік навчання».
        Визначити методи переприсвоєння та збільшення року навчання.

        Виконати завдання свого варіанту Лабораторної роботи № 1.5 (Композиція класів та
        об’єктів) з конструкторами і перевантаженням операцій
        */

        Man stephan = new Man("Степан", Genders.GENDER_MALE, 15, 52.5);
        Man maria = new Man("Марія", Genders.GENDER_FEMALE, 16, 57.0);

        Man empty = new Man();

        Student student1 = new Student(9, stephan);
        Student student2 = new Student(10, maria);

        System.out.println(empty.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        
    }
}
