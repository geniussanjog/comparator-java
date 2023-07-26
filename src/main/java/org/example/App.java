package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Employee e1 = new Employee(1,"XX",55);
        Employee e2 = new Employee(2,"GG",55);
        Employee e3 = new Employee(3,"PP",70);
        Employee e4 = new Employee(4,"UU",12);
        Employee e5 = new Employee(5,"YY",12);
        Employee e6 = new Employee(6,"DD",74);
        Employee e7 = new Employee(7,"JJ",74);
        Employee e8 = new Employee(8,"EE",12);
        Employee e9 = new Employee(9,"KK",55);
        Employee e10 = new Employee(10,"CC",74);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e4);
        employeeList.add(e7);
        employeeList.add(e6);
        employeeList.add(e9);
        employeeList.add(e2);
        employeeList.add(e10);
        employeeList.add(e8);
        employeeList.add(e5);
        employeeList.add(e1);
        employeeList.add(e3);
        //employeeList.forEach(System.out::println);


          // Natural Sort using stream
          //employeeList.stream().sorted().forEach(System.out::println);

          //Sorting using Collections.sort() methiod - natural sort
          //Collections.sort(employeeList);

//        Collections.sort(employeeList,new EmployeeAgeComparator());

//        Collections.sort(employeeList,new EmployeeNameComparator());

//        Collections.sort(employeeList, new EmployeeAgeThenNameComparator());

//        employeeList.stream().sorted(new EmployeeNameComparator()).forEach(System.out::println);
//        employeeList.forEach(System.out::println);

        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);

        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getEmpName)).forEach(System.out::println);




    }
}
