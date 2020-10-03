package ru.mirea.prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dmitrii", "kakdimaaa@mail.ru", 'M');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }

}
