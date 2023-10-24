package lesson3;

import lombok.*;

import java.util.Date;

@Data // + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int salary;
    private Date birthdate;
    private boolean cheif;

    public Person(int age, Date birthdate) {
        this.age = age;
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Person o) {
        return birthdate.compareTo(o.birthdate);
    }
}
