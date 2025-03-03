package ru.netologi.javaqa.Birthday.services;

public class Post {

    public String name;
    public String surname;
    public String patronymic;
    public String passport;
    public String phone;
    public boolean subscription;
    public FormDate birthday = new FormDate();

    // Переопределяем метод toString()
    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", passport='" + passport + '\'' +
                ", phone='" + phone + '\'' +
                ", subscription=" + subscription +
                ", birthday=" + birthday +
                '}';
    }
}
