package com.skillbrain;

public class Technician extends Employee {



    @Override
    public double calculateSalary() {
        return 2 * reference ;
    }

    @Override
    public String getName() {
        return "Tehnicianul se numeste "+ firstName + " " + lastName;
    }

    public Technician(String firstName, String lastName, int age, String employmentDate, int reference){
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

}
