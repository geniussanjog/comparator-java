package org.example;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
    }
}
