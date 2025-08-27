package com.example.calculator;
// 3. Create a customer class with the following attributes:

//     a. String name

//     b. Integer age

//     c. Insurance as a dependency
public class Customer{
    private String name;
    private int age;
    private Insurance insurance;//dependency
    public void setInsurance(Insurance insurance){
        this.insurance = insurance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void showCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Insurance Type: " + insurance.getInsuranceName());
        System.out.println("Insurance Premium: " + insurance.getInsurancePremium());
    }
    public Insurance getInsurance() {
        return insurance;
    }
}
