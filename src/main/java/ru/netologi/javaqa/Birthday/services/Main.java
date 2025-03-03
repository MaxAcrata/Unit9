
package ru.netologi.javaqa.Birthday.services;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.surname = "Popov";
        post.patronymic = "Ivanovich";
        post.passport = "1234 № 567890";
        post.phone = "+7(981)232-23-23";
        post.subscription = true;
        post.birthday.day = 10;
        post.birthday.month = 12;
        post.birthday.year = 1990;

        System.out.println(post);
    }
}
