package lesson3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Timofei", 99, 100, new Date(2000, 8, 13), false);

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person);

        System.out.println(person.equals(person));
        System.out.println(person.hashCode());

        Chief chief = new Chief("Boris", 120, 200, new Date(1994, 7, 24), true);

        System.out.println(chief);
        System.out.println(person.compareTo(chief));

    }
}
