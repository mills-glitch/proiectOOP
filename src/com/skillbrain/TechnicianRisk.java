package com.skillbrain;

public class TechnicianRisk extends Technician implements EmployeeRisk{
    @Override
    public void handleRisk() {
        System.out.println("Lucrez intr-un mediu cu risc inalt si beneficiez de un salariu extra.");
    }

    @Override
    public double calculateSalary(){
        return 2.5 * reference + monthlyPremium;
    }

    public TechnicianRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
        this.reference = reference;
    }
}
