package org.payroll.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return this.salary - (this.salary*.3);
    }

    @Override
    public String generatePayStub(String payDate) {
            return "\t\t\t" + "\n\t" + "Name: " + this.getName() + " - Employee Id: " + this.getEmployeeID() +
                "\n\t" + "Pay Date \t " + payDate +
                "\n\t" + "Gross Salary $" + this.salary +
                "\n\t" + "Net Salary $" + calculatePay() + "\n\n";
    }

    @Override
    public String toString() {
        return String.format("\n\tName: " + this.getName() +
                "\n\tGross Salary $" + this.salary +
                "\n\tNet Salary $%.2f", calculatePay());

    }

}
