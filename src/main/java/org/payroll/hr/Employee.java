package org.payroll.hr;


public abstract class Employee implements Payable {

    private String name;
    private final int EMPLOYEE_ID;
    private Address address;
    private double payRate;
    private static int nextID = 1000;
    protected static final double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        EMPLOYEE_ID = getNextID();
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.EMPLOYEE_ID;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    public void displayAddress() {
        System.out.println(address.toString());
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayRate(double rate) {
        this.payRate=rate;
    }


    @Override
    public String toString(){
        return "Employee ID - " + this.EMPLOYEE_ID + "\nName - " +this.name
                + "\n" + this.address.toString();
    }

}
