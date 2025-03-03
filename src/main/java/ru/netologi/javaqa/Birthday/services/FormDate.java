package ru.netologi.javaqa.Birthday.services;

public class FormDate {
    int day;
    int month;
    int year;

    // Переопределяем метод toString() для класса Birthday
    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}