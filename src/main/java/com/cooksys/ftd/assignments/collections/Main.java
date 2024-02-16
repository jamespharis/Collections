package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Manager;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {}
    
    Manager m1 = new Manager("John");
    Manager m2 = new Manager("Tom", m1);

}
