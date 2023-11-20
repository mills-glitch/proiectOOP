package com.skillbrain;

public class HandlingRisk extends WarehouseMan implements EmployeeRisk{

    public HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica un risc inalt si beneficiez de un spor extra.");
    }

    @Override
    public double calculateSalary(){
        return 3 * reference + monthlyPremium;
    }

}
