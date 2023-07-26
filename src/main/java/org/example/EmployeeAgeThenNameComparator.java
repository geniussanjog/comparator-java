package org.example;

import java.util.Comparator;

public class EmployeeAgeThenNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return new EmployeeAgeComparator().thenComparing(new EmployeeNameComparator()).compare(o1, o2);
    }
}
