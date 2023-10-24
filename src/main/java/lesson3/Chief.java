package lesson3;

import java.util.Date;

public class Chief extends Person{

    public Chief(String name, int age, int salary, Date birthdate, boolean chief) {
        super(name, age, salary, birthdate, chief);
    }

    public int SalaryUpdate(int salary, boolean chief){
        if (chief) {
            return salary;
        }
        else {
            return salary + (salary / 10);
        }
    }
}
