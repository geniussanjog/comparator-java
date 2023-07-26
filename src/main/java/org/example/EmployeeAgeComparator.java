package org.example;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
