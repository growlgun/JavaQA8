package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "7722 665111";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 02;
        post.birthday.year = 1994;


    }
}
